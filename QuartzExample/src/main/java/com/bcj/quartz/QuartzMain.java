package com.bcj.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {

	public static void main(String[] args) throws SchedulerException {
		

		JobDetail job = JobBuilder.newJob(QuartzJob.class).build();
		
		// Trigger t1 = TriggerBuilder.newTrigger().withIdentity("SimpleTrigger").startNow().build();
		
		// to schedule for every one minute
		
	   //	Trigger t1 = TriggerBuilder.newTrigger().withIdentity("CornTrigger").withSchedule(CronScheduleBuilder.cronSchedule("	0 0/1 * 1/1 * ? *")).build();
		
		Trigger t1 = TriggerBuilder.newTrigger().withIdentity("CornTrigger").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(05).repeatForever()).build();
				
				
		Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
		
		sc.start();
		
		sc.scheduleJob(job,t1);
		
	}

}
