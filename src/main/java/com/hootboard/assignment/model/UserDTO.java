package com.hootboard.assignment.model;

import java.util.List;

import com.hootboard.assignment.base.AuditEntity;

/**
 * @author MrSagar
 *
 */
public class UserDTO extends AuditEntity {

	private Long userId;
	private String firstName;
	private String lastName;
	private List<EmailDTO> emails;
	private List<AddressDTO> addresses;

	public UserDTO(Long userId, String firstName, String lastName, List<EmailDTO> emails,
			List<AddressDTO> addresses) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emails = emails;
		this.addresses = addresses;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

}
