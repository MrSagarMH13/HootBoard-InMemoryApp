package com.hootboard.assignment.model;

/**
 * @author MrSagar
 *
 */
public class EmailDTO {

	private String emailId;
	private String email;
	private String emailType;

	public EmailDTO(String emailId, String email, String emailType) {
		super();
		this.emailId = emailId;
		this.email = email;
		this.emailType = emailType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

}
