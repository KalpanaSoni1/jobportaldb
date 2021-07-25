package com.example.jobportaldb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.JobType;

public interface JobTypeRepo  extends JpaRepository<JobType,Long> {

}
