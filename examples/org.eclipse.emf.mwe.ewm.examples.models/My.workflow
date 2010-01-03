<?xml version="1.0" encoding="UTF-8"?>
<org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:org.eclipse.emf.mew.ewm.examples.concat="http://www.eclipse.org/emf/mwe/ewm/examples/concat" xmlns:org.eclipse.emf.mwe.ewm.workflow="http://www.eclipse.org/emf/mwe/ewm/workflow" xmlns:org.eclipse.emf.mwe.ewm.workflow.orchestration="http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration" name="Workflow" type="Workflow">
  <componentOrchestrationStrategy/>
  <components xsi:type="org.eclipse.emf.mew.ewm.examples.concat:Concat" name="ConcatA" type="Concat">
    <componentOrchestrationStrategy/>
    <inputMessage name="InputMessageA" description="Input message for node A">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </inputMessage>
    <inputAppendMessage name="InputAppendMessageA" description="Input append message for node A">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </inputAppendMessage>
    <outputMessage name="OutputMessageA" description="Output message for node A">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </outputMessage>
  </components>
  <components xsi:type="org.eclipse.emf.mew.ewm.examples.concat:Concat" name="ConcatB" type="Concat">
    <componentOrchestrationStrategy/>
    <inputMessage name="InputMessageB" description="Input message for node B" connection="//@connections.0">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </inputMessage>
    <inputAppendMessage name="InputAppendMessageB" description="Input append message for node B">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </inputAppendMessage>
    <outputMessage name="OutputMessageB" description="Output message for node B">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      <valueStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow:WorkflowParameterSimpleValueStrategy"/>
    </outputMessage>
  </components>
  <compositeOrchestrationStrategy xsi:type="org.eclipse.emf.mwe.ewm.workflow.orchestration:WorkflowSerialOrchestrationStrategy"/>
  <connections sourceParameter="//@components.0/@outputMessage" targetParameters="//@components.1/@inputMessage"/>
  <stateResolutionStrategy/>
</org.eclipse.emf.mwe.ewm.workflow:WorkflowCompositeComponent>
