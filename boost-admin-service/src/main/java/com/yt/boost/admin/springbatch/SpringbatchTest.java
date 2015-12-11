package com.yt.boost.admin.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.SyncTaskExecutor;

/**
 * Created by tim on 2015/12/10.
 */
public class SpringbatchTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("batch.xml");
        SimpleJobLauncher launcher = new SimpleJobLauncher();
        launcher.setJobRepository((JobRepository) context.getBean("jobRepository"));
        launcher.setTaskExecutor(new SyncTaskExecutor());

        try {
            JobExecution je = launcher.run(context.getBean("testJdbcBatch", Job.class),
                    new JobParametersBuilder().toJobParameters());

            System.out.println("======================================================================");
            System.out.println(je);
            System.out.println(je.getJobInstance());
            System.out.println(je.getStepExecutions());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
