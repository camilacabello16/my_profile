package com.myprofile.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.myprofile.dao.IEducationDAO;
import com.myprofile.model.EducationModel;
import com.myprofile.service.IEducationService;

public class EducationService implements IEducationService {

	@Inject
	private IEducationDAO educationDao;
	
	@Override
	public List<EducationModel> findAll() {
		return educationDao.findAll();
	}

}
