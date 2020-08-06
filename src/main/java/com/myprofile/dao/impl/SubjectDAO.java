package com.myprofile.dao.impl;

import java.util.List;

import com.myprofile.dao.ISubjectDAO;
import com.myprofile.mapper.SubjectMapper;
import com.myprofile.model.SubjectModel;

public class SubjectDAO extends AbstractDAO<SubjectModel> implements ISubjectDAO {

	public List<SubjectModel> findAll(int offset, int limit) {
		String sql = "SELECT * FROM subject LIMIT ?, ?";
		return query(sql, new SubjectMapper(), offset, limit);
	}

	@Override
	public Long save(SubjectModel subjectModel) {
		String sql = "INSERT INTO subject (code, namesubject, grades, wordgrades) VALUES(?, ?, ?, ?)";
		return insert(sql, subjectModel.getCode(), subjectModel.getNameSubject(), subjectModel.getGrade(), subjectModel.getWordGrade());
	}

	@Override
	public SubjectModel findOne(Long id) {
		String sql = "SELECT * FROM subject WHERE id = ?";
		List<SubjectModel> subject = query(sql, new SubjectMapper(), id);
		return subject.isEmpty() ? null : subject.get(0);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT COUNT(*) FROM subject";
		return count(sql);
	}

}
