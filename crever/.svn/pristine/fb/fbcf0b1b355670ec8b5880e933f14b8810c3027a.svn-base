package com.crever.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.crever.service.persistence.AjaxPersistence;
import com.crever.utils.DynamicValueObject;

@Service
public class AjaxService {
	@Inject AjaxPersistence ajax_persistence;
	
	public List<DynamicValueObject> getDateTime(DynamicValueObject dy){
		return ajax_persistence.getDateTime(dy);
		
	}
}
