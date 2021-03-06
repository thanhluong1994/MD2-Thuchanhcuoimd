package model;

import java.io.Serializable;

public class Phonebook implements Serializable {
  private  String name;
  private  String numberPhone;
  private  String address;
  private  String email;

  public Phonebook() {
  }

  public Phonebook(String name, String numberPhone, String address, String email) {
    this.name = name;
    this.numberPhone = numberPhone;
    this.address = address;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumberPhone() {
    return numberPhone;
  }

  public void setNumberPhone(String numberPhone) {
    this.numberPhone = numberPhone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Phonebook{" +
            "name='" + name + '\'' +
            ", numberPhone='" + numberPhone + '\'' +
            ", address='" + address + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
