package com.innovect;

import com.innovect.app.EmployeeServiceApplication;

import java.util.Scanner;

public class Tester {
  public static void main(String[] args) throws Exception{
    EmployeeServiceApplication app=new EmployeeServiceApplication();
    boolean flag=true;
    final int EXIT=0,HOME=1;
    Scanner scanner = new Scanner(System.in);
    while(flag)
    {
      System.out.println("1.Home");
      System.out.println("0.Exit");
      switch (scanner.nextInt())
      {
        case HOME:
          app.home();
          break;
        case EXIT:
          flag=false;
          break;
        default:
          System.out.println("Please Enter Correct Choice...");
          break;
      }
    }
  }
}
