package com.myprofile.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.myprofile.dao.ISubjectDAO;
import com.myprofile.model.SubjectModel;
import com.myprofile.service.ISubjectService;

public class SubjectService implements ISubjectService {

	@Inject
	private ISubjectDAO subjectDao;
	
	@Override
	public List<SubjectModel> findAll(int offset, int limit) {
		return subjectDao.findAll(offset, limit);
	}

	@Override
	public SubjectModel save(SubjectModel subjectModel) {
		Long subjectId = subjectDao.save(subjectModel);
		return subjectDao.findOne(subjectId);
	}

	@Override
	public int getTotalItem() {
		return subjectDao.getTotalItem();
	}

}
