package com.myprofile.model;

public class ProjectModel extends AbstractModel<ProjectModel> {
	private String nameProject;
	private String link;
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
