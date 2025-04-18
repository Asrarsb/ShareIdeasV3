package com.shareideas.user.model;

public class UserProfileDTO {
	
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String bio;
    private String profileImage; // Base64-encoded string
    
    
	public UserProfileDTO() {
		super();
	}
	
	
	public UserProfileDTO(String username, String password, String email, String firstName, String lastName, String bio,
			String profileImage) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.profileImage = profileImage;
	}
	
	
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
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

    
    
    
}