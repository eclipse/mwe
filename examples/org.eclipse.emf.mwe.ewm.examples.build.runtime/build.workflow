<?xml version="1.0" encoding="UTF-8"?>
<org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:org.eclipse.emf.mwe.ewm.workflow="http://www.eclipse.org/emf/mwe/ewm/workflow" xmlns:org.eclipse.emf.mwe.ewm.workflow.examples.build="http://www.eclipse.org/emf/mwe/ewm/workflow/examples/build" xmlns:org.eclipse.emf.mwe.ewm.workflow.orchestration="http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration" name="Java Build" type="">
  <componentOrchestrationStrategy/>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:JavaCompiler" name="Java Compiler" classNameParameter="//@components.0/@parameters.2" classpathParameter="//@components.0/@parameters.1" workingDirectoryParameter="//@components.0/@parameters.0">
    <componentOrchestrationStrategy/>
    <parameters name="Java Compiler Working Directory" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Java Compiler Classpath" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Java Compiler Class Name" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
  </components>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:JavaJar" name="Java Jar" classNameParameter="//@components.1/@parameters.2" workingDirectoryParameter="//@components.1/@parameters.0" outputFileParameter="//@components.1/@parameters.1">
    <componentOrchestrationStrategy/>
    <parameters name="Java Jar Working Directory" connection="//@connections.1" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Java Jar Output FIle Name" required="true">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Java Jar Class Name" connection="//@connections.2" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
  </components>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:ZipFile" name="Zip File" type="" workingDirectoryParameter="//@components.2/@parameters.2" inputFileParameter="//@components.2/@parameters.1" outputFileParameter="//@components.2/@parameters.0">
    <componentOrchestrationStrategy/>
    <parameters name="Zip Output FIle Name" required="true">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Zip Input FIle Name" connection="//@connections.0" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="Zip Working Directory" connection="//@connections.1" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
  </components>
  <compositeOrchestrationStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow.orchestration:WorkflowSerialOrchestrationStrategy"/>
  <connections sourceParameter="//@components.1/@parameters.1" targetParameters="//@components.2/@parameters.1"/>
  <connections sourceParameter="//@components.0/@parameters.0" targetParameters="//@components.1/@parameters.0 //@components.2/@parameters.2"/>
  <connections sourceParameter="//@components.0/@parameters.2" targetParameters="//@components.1/@parameters.2"/>
  <stateResolutionStrategy/>
</org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent>
