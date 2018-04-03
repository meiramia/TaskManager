package com.meir.message.creator.messagecreator.bo;

public class AcknoledgmentResponse {
private boolean isSuccess;
private String description;
public boolean isSuccess() {
	return isSuccess;
}
public void setSuccess(boolean isSuccess) {
	this.isSuccess = isSuccess;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
