package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.RegisterDao;
import com.lti.training.entity.User;

@Service
public class SearchService {

	@Autowired
	private RegisterDao registerDao;
	
	public User findByEmail(String em) {
		return registerDao.fetch(em);
	}
}
