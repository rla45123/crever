package com.crever.service;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import com.crever.service.persistence.MainPersistence;
import com.crever.utils.DynamicValueObject;

@Controller
public class MainService {
	@Inject
	MainPersistence main_persistence;

	public int image_add(DynamicValueObject dy) {
		return main_persistence.image_add(dy);
	}
}
