package com.wolken.wolkenProject.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenProject.dto.UserDto;
import com.wolken.wolkenProject.entity.UserEntity;
import com.wolken.wolkenProject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repo;
    @Autowired 
    MappingService service;
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
	public String validateAndSave(UserDto dto) {
		UserEntity entity=new UserEntity();
		try {
		if(dto!=null) {
			BeanUtils.copyProperties(dto, entity);
			entity=repo.save(entity);
			service.addToMap(entity);
			
			return "User added";
		}
		}
		catch(Exception e){
		 logger.error(e.getMessage());	
		}
		return null;
		
	}

	@Override
	public String validateAndUpdate(UserDto dto) {
		// TODO Auto-generated method stub
		
		UserEntity entity=new UserEntity();
		entity=repo.getByEmailId(dto.getEmailId());
		if(dto.getAddress()!=null) {
			
			entity.setAddress(dto.getAddress());
		}
		 if(dto.getAge()!=0) {
			entity.setAge(dto.getAge());
		}
		 if(dto.getContactNo()!=0) {
			entity.setContactNo(dto.getContactNo());
		}
		 if(dto.getDob()!=null) {
			entity.setDob(dto.getDob());
		}
	     if(dto.getEmailId()!=null) {
			entity.setEmailId(dto.getEmailId());
		}
		 if(dto.getFirstName()!=null)	{
			 entity.setFirstName(dto.getFirstName());
		 }
		 if(dto.getLastName()!=null) {
			 entity.setLastName(dto.getLastName());
		 }
		 if(dto.getGender()!=null) {
			 entity.setGender(dto.getGender());
		 }
		 if(dto.getPassword()!=null) {
			 entity.setPassword(dto.getPassword());
		 }
		 if(dto.getPincode()!=0) {
			 entity.setPincode(dto.getPincode());
		 }
		 repo.save(entity);
		return "User added";
		
	}

	@Override
	public List<UserDto> validateAndGet() {
		// TODO Auto-generated method stub
		List<UserDto> dtos=new ArrayList<>();
		List<UserEntity> entity;
		entity=repo.findAll();
		for(UserEntity Userentity:entity ) {
			UserDto dto=new UserDto();
			BeanUtils.copyProperties(Userentity, dto);
			dtos.add(dto);
			
		}
		
		
		return dtos;
	}
	
	
	

	
	
}
