package com.veton.job_application_app.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job job);
}
