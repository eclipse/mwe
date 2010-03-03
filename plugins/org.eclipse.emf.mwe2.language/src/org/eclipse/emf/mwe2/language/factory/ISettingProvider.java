package org.eclipse.emf.mwe2.language.factory;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmType;


public interface ISettingProvider {
	Map<String,ISetting> getSettings(Object obj, JvmType jvmType);
}
