package com.crever.app;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Inject TestDAO dao;
	
	public List<TestVO> select(){
		return dao.select();
	}
	
	public int insert(){
		return dao.insert();
	}
	
}
