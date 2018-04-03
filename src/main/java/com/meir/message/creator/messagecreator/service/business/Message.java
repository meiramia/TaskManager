package com.meir.message.creator.messagecreator.service.business;

public class Message {
	private String message ;
	private String priority;
	private String description;

	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	private String messageId;

	@Override
	public String toString() {
		return "Message ID: "+messageId + "\nPriority: "+priority+"\nMessage Text: "+message+"\nDescription: "+description;
	}


}

