package com.Q7;


import com.Q7.customValidation.isValidContact;
import com.Q7.customValidation.isZipcodeValid;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Repository
@isZipcodeValid
public class Customer {
	

	@NotEmpty(message = "Should not be Empty")
	@Pattern(regexp = "[A-Za-z0-9]{8,20}",message = "Must be Alphanumeric and should have lenght 8 to 20")
	private String username;

	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}",message = "Password should contain at least one upper- case letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should also be 8 to 20 characters long.")
	private String password;
	
    @Email
	private String email;


	/**
	 * isValidContact is custom validation
	 * which is used to check the contact must contain
	 * numbers and should have the length of 10.
	 */

	@NotNull
	@isValidContact
	private String contact;
	
    @NotEmpty
	private String city;

	@Pattern(regexp = "[0-9]{6}",message = "Length should be 6")
	private String  zipcode;
	
	
	// getter and setter 
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

}
