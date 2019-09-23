package com.innovect.core;

import java.util.Date;

public class Address {
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String country;



  public Address(String addressLine1, String addressLine2, String city, String state, String country)
  {
    this.addressLine1=addressLine1;
    this.addressLine2=addressLine2;
    this.city=city;
    this.state=state;
    this.country=country;
  }
  @Override
  public String toString() {
    return
        "addressLine1=" + addressLine1 + '\n' +
        " addressLine2='" + addressLine2 + '\n' +
        " city=" + city + '\n' +
        " state=" + state + '\n' +
        " country=" + country + '\n' +
        '}';
  }
}
