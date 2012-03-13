package org.eclipse.emf.mwe.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.ConfigurationException;

/**
 * @author Moritz Eysholdt
 */
public class GenModelHelper {

	private Log log = LogFactory.getLog(getClass());

	static {
		EcorePackage.eINSTANCE.getEFactoryInstance();
		GenModelPackage.eINSTANCE.getEFactoryInstance();
	}

	public void registerGenModel(ResourceSet rs, URI genmodelURI) throws ConfigurationException {
		Resource res = rs.getResource(genmodelURI, true);
		if (res == null)
			throw new ConfigurationException("Couldn't find resource under  " + genmodelURI);
		for (EObject object : res.getContents())
			if (object instanceof GenModel)
				registerGenModel((GenModel) object);
	}

	protected Collection<GenPackage> collectGenPackages(GenModel genModel) {
		List<GenPackage> pkgs = new ArrayList<GenPackage>();
		for (GenPackage pkg : genModel.getGenPackages()) {
			pkgs.add(pkg);
			pkgs.addAll(collectGenPackages(pkg));
		}
		pkgs.addAll(genModel.getUsedGenPackages());
		return pkgs;
	}

	protected Collection<GenPackage> collectGenPackages(GenPackage genPackage) {
		List<GenPackage> pkgs = new ArrayList<GenPackage>();
		for (GenPackage pkg : genPackage.getNestedGenPackages()) {
			pkgs.add(pkg);
			pkgs.addAll(collectGenPackages(pkg));
		}
		return pkgs;
	}

	public void registerGenModel(GenModel genModel) {
		Map<String, URI> registry = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
		for (GenPackage pkg : collectGenPackages(genModel)) {
			if (pkg.eIsProxy()) {
				log.debug("Unresolved proxy for GenPackage "+EcoreUtil.getURI(pkg));
				continue;
			}
			String nsURI = pkg.getEcorePackage().getNsURI();
			if (nsURI != null) {
				URI newUri = pkg.eResource().getURI();
				if (registry.containsKey(nsURI)) {
					URI oldURI = registry.get(nsURI);
					if (!oldURI.equals(newUri))
						log.warn("There is already a GenModel registered for NamespaceURI '" + nsURI
								+ "'. It will be overwritten from '" + oldURI + "' to '" + newUri + "'");
					else
						continue;
				}
				registry.put(nsURI, newUri);
				if (log.isInfoEnabled())
					log.info("Registered GenModel '" + nsURI + "' from '" + newUri + "'");
			}
		}
	}
}
