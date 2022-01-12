
  package com.gozoo.www;
  
  import java.text.ParseException;
  
  import org.quartz.JobDetail; 
  import org.quartz.Scheduler; 
  import org.quartz.SchedulerException; 
  import org.quartz.SchedulerFactory; 
  import org.quartz.Trigger; 
  import org.quartz.impl.JobDetailImpl; 
  import org.quartz.impl.StdSchedulerFactory; 
  import org.quartz.impl.triggers.CronTriggerImpl;
  
  public class MyScheduler { 
  public static SchedulerFactory sf = null; 
  public static Scheduler s = null; 
  public static String id = null;
  
  public static void init() throws SchedulerException, ParseException{
  
  sf = new StdSchedulerFactory(); 
  s = sf.getScheduler();
  
  JobDetail job1 = new JobDetailImpl("myJob1","myGroup1",MyJob.class);
  Trigger trigger1 = new CronTriggerImpl("myTrigger1","myGroup1","0/20 * * * * ?"); 
  s.scheduleJob(job1, trigger1); 
  
  }
  
  public static void start() throws SchedulerException { 
	  	s.start(); 
	  }
  
  public static void end() throws SchedulerException {
	  	s.shutdown();
	  }
  
	/*
	 * public static void main(String[] args) throws Exception { 
	 * new MyScheduler();
	 * }
	 */
  }