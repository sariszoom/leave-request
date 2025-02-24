package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import jakarta.inject.Named;

@Named
public class ExpireReplyEmployee implements JavaDelegate{
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        
        execution.setVariable("approveorreject", "Your leave request has been Expired."); 
    }
}