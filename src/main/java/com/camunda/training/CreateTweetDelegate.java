package com.camunda.training;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CreateTweetDelegate implements JavaDelegate{
	private final Logger LOGGER = LoggerFactory.getLogger(CreateTweetDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Publishing start"); 
		Thread.sleep(5000);
		LOGGER.info("Publishing end"); 

	}
}