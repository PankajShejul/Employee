package com.innovect.cust_excs;

import com.innovect.core.Employee;
@SuppressWarnings("serial")
public class EmployeeHandlingException extends Exception{
  public EmployeeHandlingException(String exception){
    super(exception);
  }
}
