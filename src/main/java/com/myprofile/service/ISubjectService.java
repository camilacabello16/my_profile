package com.myprofile.service;

import java.util.List;

import com.myprofile.model.SubjectModel;

public interface ISubjectService {
	List<SubjectModel> findAll(int offset, int limit);
	SubjectModel save(SubjectModel subjectModel);
	int getTotalItem();
}
