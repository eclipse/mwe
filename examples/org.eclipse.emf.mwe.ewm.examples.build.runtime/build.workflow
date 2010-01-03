<?xml version="1.0" encoding="UTF-8"?>
<org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:org.eclipse.emf.mwe.ewm.workflow="http://www.eclipse.org/emf/mwe/ewm/workflow" xmlns:org.eclipse.emf.mwe.ewm.workflow.examples.build="http://www.eclipse.org/emf/mwe/ewm/workflow/examples/build" xmlns:org.eclipse.emf.mwe.ewm.workflow.orchestration="http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration" name="Java Build" type="">
  <componentOrchestrationStrategy/>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:JavaCompiler" name="Java Compiler">
    <componentOrchestrationStrategy/>
    <classNameParameter name="Java Compiler Class Name" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </classNameParameter>
    <classpathParameter name="Java Compiler Classpath" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </classpathParameter>
    <workingDirectoryParameter name="Java Compiler Working Directory" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </workingDirectoryParameter>
  </components>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:JavaJar" name="Java Jar">
    <componentOrchestrationStrategy/>
    <classNameParameter name="Java Jar Class Name" connection="//@connections.2" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </classNameParameter>
    <workingDirectoryParameter name="Java Jar Working Directory" connection="//@connections.1" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </workingDirectoryParameter>
    <outputFileParameter name="Java Jar Output FIle Name" required="true">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </outputFileParameter>
  </components>
  <components xsi:type="org.eclipse.emf.mwe.ewm.workflow.examples.build:ZipFile" name="Zip File">
    <componentOrchestrationStrategy/>
    <workingDirectoryParameter name="Zip Working Directory" connection="//@connections.1" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </workingDirectoryParameter>
    <inputFileParameter name="Zip Input FIle Name" connection="//@connections.0" required="true" direction="IN">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </inputFileParameter>
    <outputFileParameter name="Zip Output FIle Name" required="true">
      <type xsi:type="ecore:EDataType" href="../../plugin/org.eclipse.emf.ecore/model/Ecore.ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </outputFileParameter>
  </components>
  <compositeOrchestrationStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow.orchestration:WorkflowSerialOrchestrationStrategy"/>
  <connections sourceParameter="//@components.1/@outputFileParameter" targetParameters="//@components.2/@inputFileParameter"/>
  <connections sourceParameter="//@components.0/@workingDirectoryParameter" targetParameters="//@components.1/@workingDirectoryParameter //@components.2/@workingDirectoryParameter"/>
  <connections sourceParameter="//@components.0/@classNameParameter" targetParameters="//@components.1/@classNameParameter"/>
  <stateResolutionStrategy/>
</org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent>
