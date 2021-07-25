package com.example.jobportaldb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.JobLocation;
import com.example.jobportaldb.Model.UserDetails;

public interface UserRepo  extends JpaRepository<UserDetails,Long> {

}
