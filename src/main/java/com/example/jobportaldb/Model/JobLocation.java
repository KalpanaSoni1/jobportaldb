package com.example.jobportaldb.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Job_Location")
public class JobLocation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Location_id", nullable = false)
	private int Lid;
	
	@Column(name = "Location_city", length = 20)
    private String Lcity;
	
	@Column(name = "Location_state", length = 20)
    private String Lstate;

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public String getLcity() {
		return Lcity;
	}

	public void setLcity(String lcity) {
		Lcity = lcity;
	}

	public String getLstate() {
		return Lstate;
	}

	public void setLstate(String lstate) {
		Lstate = lstate;
	}
	
}
