package com.example.jobportaldb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.JobLocation;

public interface JobLocationRepo  extends JpaRepository<JobLocation,Long> {

}
