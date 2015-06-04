package com.niranjan.spring.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niranjan.spring.web.Dao.jobsDao;
import com.niranjan.spring.web.Dao.jobsadda;

@Service("daoService")
public class DaoServices {
	
	private jobsDao jobsdao;
@Autowired
	public void setJobsdao(jobsDao jobsdao) {
		this.jobsdao = jobsdao;
	}
	public List<jobsadda> GetViewData()
	{
		return jobsdao.GetData();
	}

}
