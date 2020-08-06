package com.myprofile.model;

public class SkillModel extends AbstractModel<SkillModel> {
	private String nameSkill;
	public String getNameSkill() {
		return nameSkill;
	}
	public void setNameSkill(String nameSkill) {
		this.nameSkill = nameSkill;
	}
	public int getExpert() {
		return expert;
	}
	public void setExpert(int expert) {
		this.expert = expert;
	}
	private int expert;
}
