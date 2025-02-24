package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import jakarta.inject.Named;

@Named
public class ApproveReplyEmployee implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception { // เมธอดนี้จะถูกเรียกเมื่อโปรเซส BPMN ถึงจุดที่ใช้ Delegate

        execution.setVariable("approveorreject", "Your leave request has been Approved."); 
    
    }
}
