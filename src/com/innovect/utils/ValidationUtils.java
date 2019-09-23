package com.innovect.utils;

import com.innovect.cust_excs.EmployeeHandlingException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidationUtils {
  public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

  public static Date validateDate(String date) throws ParseException {
    Date d=sdf.parse(date);
    return d;
  }

  public static String validateEmail(String email) throws EmployeeHandlingException{
    if(!email.contains("@") || !email.contains("."))
    {
      throw new EmployeeHandlingException("Invalid Email Id");
    }
    return email;
  }

  public static String validatePhone(String phone) throws EmployeeHandlingException {
    if(phone.length()!=10)
    {
      throw new EmployeeHandlingException("Mobile Number is Not 10 Digits");
    }
    return phone;
  }
}
