/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.releng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class GenerateProxyAndPserverPsf {
	
	public static void main(String[] args) {
		new GenerateProxyAndPserverPsf().generate("./team/projectset");
	}
	
	/**
	 * reads in the extssh team project set from ${targetFolder}/extssh/projectset.psf
	 * and generates one withProxy and one anonymous psf file to ${targetFolder}/extssh-withProxy/ and ${targetFolder}/pserver respectively  
	 */
	public void generate(String targetFolder) {
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(targetFolder+"/extssh/projectset.psf"));
			BufferedWriter proxy = new BufferedWriter(new FileWriter(targetFolder+"/extssh-withProxy/projectset.psf"));
			BufferedWriter pserver = new BufferedWriter(new FileWriter(targetFolder+"/pserver/projectset.psf"));
			String line;
			while((line = fileReader.readLine())!= null) {
				proxy.write(line.replaceAll(":extssh:dev\\.eclipse\\.org:", ":extssh:proxy.eclipse.org:443:"));
				proxy.newLine();
				pserver.write(line.replaceAll(":extssh:", ":pserver:anonymous@"));
				pserver.newLine();
			}
			fileReader.close();
			proxy.close();
			pserver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
