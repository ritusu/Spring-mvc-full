package com.lti.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lti.training.Dto.StatusDTO;
import com.lti.training.Dto.UserDTO;
import com.lti.training.dao.RegisterDao;
import com.lti.training.entity.User;

//@Component
@Service
public class RegisterService {
		
	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public StatusDTO register(UserDTO userDTO) {
		//copying the data from dto to entity
				User user=new User();
				user.setName(userDTO.getName());
				user.setAge(userDTO.getAge());
				user.setEmail(userDTO.getEmail());
				
				int id=registerDao.save(user);
				
				StatusDTO status=new StatusDTO();
				status.setId(id);
				status.setMessage("All Is Well!!!!");
				return status;
				
	}
	
}
