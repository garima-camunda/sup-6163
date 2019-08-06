package com.camunda.training;



import static org.camunda.bpm.engine.test.assertions.bpmn.AbstractAssertions.*;
//import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.*;

import java.sql.SQLException;

import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.extension.process_test_coverage.junit.rules.TestCoverageProcessEngineRuleBuilder;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

public class ProcessJUnitTest {

	@Rule
	@ClassRule
	//	public ProcessEngineRule rule = new ProcessEngineRule();
	public static ProcessEngineRule rule = TestCoverageProcessEngineRuleBuilder.create().build();

	@Before
	public void setup() throws SQLException {
		init(rule.getProcessEngine());

	}


	@Ignore
	@Test
	@Deployment(resources = "taskEventTest.bpmn")
	public void testHappyPath2() throws SQLException {

		ProcessDefinition def = repositoryService().createProcessDefinitionQuery().processDefinitionKey("simpleprocess").singleResult();
		System.out.println(def);
		System.out.println(def.getDescription());
		
		System.out.println(rule.getProcessEngineConfiguration().getEnableFetchProcessDefinitionDescription());
		System.out.println(rule.getProcessEngineConfiguration());


		// Create a HashMap to put in variables for the process instance
		//		Map<String, Object> variables = new HashMap<String, Object>();
		//		//		variables.put("approved", true);
		//		//		variables.put("tweet", "hello");
		//		variables.put("content", new Date() + "Garima ");

//		Test1 test = new Test1();
//		test.setAmount("250");
//
//		VariableMap variables = Variables.createVariables()
//				.putValue("amountObjStrJava", Variables.objectValue("250")
//						.serializationDataFormat(Variables.SerializationDataFormats.JAVA).create())
//				.putValue("amountObjObjXML", Variables.objectValue(test)
//						.serializationDataFormat(Variables.SerializationDataFormats.XML).create());
////				.putValue("amountObjXML", Variables.objectValue(test)
////						.serializationDataFormat(Variables.SerializationDataFormats.XML).create())
////				.putValue("somestring", "somestringval");
//
//		// Start process with Java API and variables
//		ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("simpleprocess", variables);
//		assertThat(processInstance).isWaitingAt("doSomething");

		//		List<Job> jobList = jobQuery()
		//				.processInstanceId(processInstance.getId())
		//				.list();
		//		assertThat(jobList).hasSize(1);
		//		Job job = jobList.get(0);
		//		execute(job);

		//		List<Task> taskList = taskService()
		//				.createTaskQuery()
		////				.taskCandidateGroup("management")
		//				.processInstanceId(processInstance.getId())
		//				.list();
		//		assertThat(taskList).isNotNull();
		//		assertThat(taskList).hasSize(1);
		//		Task task = taskList.get(0);

		//		Map<String, Object> approvedMap = new HashMap<String, Object>();
		//		approvedMap.put("approved", true);
		//		taskService().complete(task.getId(), approvedMap);

		//		assertThat(processInstance).isEnded();
		//		assertThat(processInstance).hasPassed("tweetPublished");
	}

	//	@Test
	//	@Deployment(resources = "tweetapproval.bpmn")
	//	public void testHappyPath() throws SQLException {
	//		org.h2.tools.Server.createWebServer().start();
	//
	//		// Create a HashMap to put in variables for the process instance
	//		Map<String, Object> variables = new HashMap<String, Object>();
	//		//		variables.put("approved", true);
	//		//		variables.put("tweet", "hello");
	//		variables.put("content", new Date() + "Garima ");
	//		// Start process with Java API and variables
	//		ProcessInstance processInstance = runtimeService().startProcessInstanceByKey("TweetApprovalProcess", variables);
	//
	//		assertThat(processInstance).isWaitingAt("checkTweet");
	//
	//		List<Task> taskList = taskService()
	//				.createTaskQuery()
	//				.taskCandidateGroup("management")
	//				.processInstanceId(processInstance.getId())
	//				.list();
	//		//		   assertThat(taskList).isNotNull();
	//		//		   assertThat(taskList).hasSize(1);
	//		Task task = taskList.get(0);
	//
	//		Map<String, Object> approvedMap = new HashMap<String, Object>();
	//		approvedMap.put("approved", true);
	//		taskService().complete(task.getId(), approvedMap);
	//
	//		List<Job> jobList = jobQuery()
	//				.processInstanceId(processInstance.getId())
	//				.list();
	//		assertThat(jobList).hasSize(1);
	//		Job job = jobList.get(0);
	//		execute(job);
	//
	//
	//		// Make assertions on the process instance
	//		assertThat(processInstance).isEnded();
	//		assertThat(processInstance).hasPassed("tweetPublished");
	//	}
	//
	//	@Test
	//	@Deployment(resources = "tweetapproval.bpmn")
	//	public void testTweetRejected() {
	//		Map<String, Object> variables = new HashMap<String, Object>();
	//		//		variables.put("approved", true);
	//		//		variables.put("tweet", "hello");
	//		variables.put("content", new Date() + "Garima ");
	//		variables.put("approved", false);
	//
	//		ProcessInstance processInstance = runtimeService()
	//				.createProcessInstanceByKey("TweetApprovalProcess")
	//				.setVariables(variables)
	//				.startAfterActivity("checkTweet")
	//				.execute();
	//		
	//		assertThat(processInstance)
	//	     .isWaitingAt("SendNotificationTask")
	//	     .externalTask()
	//	     .hasTopicName("notification");
	//	  complete(externalTask());
	//	  
	//			// Make assertions on the process instance
	//		assertThat(processInstance).isEnded();
	////		assertThat(processInstance).hasPassed("tweetDeclined");
	//	}




}
