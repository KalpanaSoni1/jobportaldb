package com.example.jobportaldb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.JobSkill;

public interface JobSkillRepo  extends JpaRepository<JobSkill,Long> {

}
