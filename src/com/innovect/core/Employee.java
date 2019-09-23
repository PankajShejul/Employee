package com.innovect.core;

import java.util.Date;
import java.util.Objects;

public class Employee{
  private int id;
  private String firstName;
  private String middleName;
  private String lastName;
  private Date dateOfBirth;
  private static int idGenerator=100;
  private String email;
  private String phone;
  private Department department;
  private Date dateOfJoining;
  private Designation designation;
  private int salary;
  private Address address;
  public Employee(String fn,String mn,String ln,Date dob,String em,String ph,Department dept,Date doj,Designation desig,int sal,String aL1,String aL2,
                  String city, String state, String country)
  {
    this.id=++idGenerator;
    this.firstName=fn;
    this.middleName=mn;
    this.lastName=ln;
    this.dateOfBirth=dob;
    this.email=em;
    this.phone=ph;
    this.department=dept;
    this.dateOfJoining=doj;
    this.designation=desig;
    this.salary=sal;
    address=new Address(aL1,aL2,city,state,country);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return email.equals(employee.email) &&
        phone.equals(employee.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        " firstName=" + firstName + '\n' +
        " middleName=" + middleName + '\n' +
        " lastName=" + lastName + '\n' +
        " dateOfBirth=" + dateOfBirth +
        " email=" + email + '\n' +
        " phone=" + phone + '\n' +
        " department=" + department +'\n'+
        " dateOfJoining=" + dateOfJoining +'\n'+
        " designation=" + designation +'\n'+
        " salary=" + salary +'\n'+
        " address=" + address +
        '}';
  }

  public int getId() {
    return id;
  }
}
