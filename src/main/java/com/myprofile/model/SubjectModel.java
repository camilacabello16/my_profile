package com.myprofile.model;

public class SubjectModel extends AbstractModel<SubjectModel> {
	private String code;
	private String nameSubject;
	private int grade;
	private String wordGrade;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getWordGrade() {
		return wordGrade;
	}

	public void setWordGrade(String wordGrade) {
		this.wordGrade = wordGrade;
	}

}
