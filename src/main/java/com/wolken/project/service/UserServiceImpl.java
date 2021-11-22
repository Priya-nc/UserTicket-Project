package com.wolken.project.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.project.Repository.UserRepository;
import com.wolken.project.dto.UserDto;
import com.wolken.project.entity.UserEntity;


@Service

public class UserServiceImpl implements UserService{
       @Autowired
       UserRepository repo;
	  private Logger logger=LoggerFactory.getLogger(this.getClass());
	   
		@Override
		public String validateAndSave(UserDto dto) {
			// TODO Auto-generated method stub
			UserEntity entity=new UserEntity();
			try {
			if(dto!=null) {
				BeanUtils.copyProperties(dto, entity);
				entity=repo.save(entity);
				
				
				return "User added";
			}
			}
			catch(Exception e){
			 logger.error(e.getMessage());	
			}
			return null;
			
		}

		@Override
		public List<UserDto> getAllTicket() {
			// TODO Auto-generated method stub
			
				
		       List<UserDto> userDTOs = new ArrayList<>();
				
				try {
					List<UserEntity> userEntities = repo.findAll();
					logger.info("Find ALL"+repo.findAll());
					
					for (UserEntity userEntity : userEntities) {
						UserDto userDTO = new UserDto();
						BeanUtils.copyProperties(userEntity, userDTO);
						logger.info(""+userDTOs);
						userDTOs.add(userDTO);
						logger.info("Mapping"+userDTOs);
						
					}
				} catch (NullPointerException | TypeMismatchException e) {
					logger.error(e.getMessage(),e.getClass().getName());
				}
				return userDTOs;
			
		}

}
