package com.neu.his.pojo;

public class User {
	private int id;
	private String userName;
	private String password;
	private String realName;
	private int useType;
	private int docTitleID;
	private String isScheduling;
	private int deptID;
	private int registLeID;
	private int delMark;

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getUseType() {
		return useType;
	}

	public void setUseType(int useType) {
		this.useType = useType;
	}

	public int getDocTitleID() {
		return docTitleID;
	}

	public void setDocTitleID(int docTitleID) {
		this.docTitleID = docTitleID;
	}

	public String getIsScheduling() {
		return isScheduling;
	}

	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public int getRegistLeID() {
		return registLeID;
	}

	public void setRegistLeID(int registLeID) {
		this.registLeID = registLeID;
	}

	public int getDelMark() {
		return delMark;
	}

	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", useType=" + useType + ", docTitleID=" + docTitleID + ", isScheduling=" + isScheduling + ", deptID="
				+ deptID + ", registLeID=" + registLeID + ", delMark=" + delMark + "]";
	}
}
