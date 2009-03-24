<?xml version="1.0" encoding="UTF-8"?>
<org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:org.eclipse.emf.mew.ewm.examples.tutorial="http://www.eclipse.org/emf/mwe/ewm/examples/tutorial" xmlns:org.eclipse.emf.mwe.ewm.workflow="http://www.eclipse.org/emf/mwe/ewm/workflow" xmlns:org.eclipse.emf.mwe.ewm.workflow.orchestration="http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration">
  <componentOrchestrationStrategy/>
  <components xsi:type="org.eclipse.emf.mew.ewm.examples.tutorial:Concat" name="ConcatA" inputMessage="//@components.0/@parameters.1" inputAppendMessage="//@components.0/@parameters.0" outputMessage="//@components.0/@parameters.2">
    <componentOrchestrationStrategy/>
    <parameters name="InputAppendMessageA">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="InputMessageA">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="OutputMessageA">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
  </components>
  <components xsi:type="org.eclipse.emf.mew.ewm.examples.tutorial:Concat" name="ConcatB" inputMessage="//@components.1/@parameters.1" inputAppendMessage="//@components.1/@parameters.0" outputMessage="//@components.1/@parameters.2">
    <componentOrchestrationStrategy/>
    <parameters name="InputAppendMessageB">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="InputMessageB" connection="//@connections.0">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
    <parameters name="OutputMessageB">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </parameters>
  </components>
  <compositeOrchestrationStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow.orchestration:WorkflowSerialOrchestrationStrategy"/>
  <connections output="//@components.0/@parameters.2" inputs="//@components.1/@parameters.1"/>
  <stateResolutionStrategy/>
</org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent>
