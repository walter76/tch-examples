package de.thechatoicheap.examples.model;

import org.apache.struts.validator.ValidatorForm;

public class RegisterUserForm extends ValidatorForm {

  private static final long serialVersionUID = 1L;

  private String username;
  private String password;
  private String passwordRepeated;
  private String firstname;
  private String lastname;
  private String email;
  private String emailRepeated;

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

  public String getPasswordRepeated() {
    return passwordRepeated;
  }

  public void setPasswordRepeated(String passwordRepeated) {
    this.passwordRepeated = passwordRepeated;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmailRepeated() {
    return emailRepeated;
  }

  public void setEmailRepeated(String emailRepeated) {
    this.emailRepeated = emailRepeated;
  }
  
}
