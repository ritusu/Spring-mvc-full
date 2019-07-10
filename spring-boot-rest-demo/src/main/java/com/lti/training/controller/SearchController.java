package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.entity.User;
import com.lti.training.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	private SearchService ss;
	@RequestMapping("/search")
	public User search(@RequestParam(name = "email") String email) {
		return ss.findByEmail(email);
	}
	
}
