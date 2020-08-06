package com.myprofile.dao;

import java.util.List;

import com.myprofile.model.SubjectModel;

public interface ISubjectDAO {
	SubjectModel findOne(Long id);
	List<SubjectModel> findAll(int offset, int limit);
	Long save(SubjectModel subjectModel);
	int getTotalItem();
}
