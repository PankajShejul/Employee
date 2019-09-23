package com.innovect.app;

import com.innovect.core.Department;
import com.innovect.core.Designation;
import com.innovect.core.Employee;
import com.innovect.cust_excs.EmployeeHandlingException;
import com.innovect.service.EmployeeService;
import com.innovect.service.EmployeeServiceImplementation;


import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static com.innovect.utils.ValidationUtils.*;

public class EmployeeServiceApplication {
  private String firstName,middleName,lastName,addressLine1,addressLine2,city,state,country,email,phone;
  private Date dateOfJoining,dateOfBirth;
  Department department;
  Designation designation;
  private int salary;
  Scanner scanner = new Scanner(System.in);
  EmployeeService employeeService=new EmployeeServiceImplementation();


  public void add() throws ParseException, EmployeeHandlingException {
    System.out.println("Enter First Name");
    firstName=scanner.next();
    System.out.println("Enter Middle Name");
    middleName=scanner.next();
    System.out.println("Enter Last Name");
    lastName=scanner.next();
    System.out.println("Enter date of Birth");
    String s=scanner.next();
    dateOfBirth=validateDate(s);
    System.out.println("Enter Your Email");
    email=validateEmail(scanner.next());
    System.out.println("Enter Phone Number");
    phone=validatePhone(scanner.next());
    System.out.println("Enter Departmant:");
    department=Department.values()[scanner.nextInt()];
    System.out.println("Enter Date of Joining");
    s=scanner.next();
    dateOfJoining=validateDate(s);
    System.out.println("Enter Designation");
    designation=Designation.values()[scanner.nextInt()];
    System.out.println("Enter Salary");
    salary=scanner.nextInt();
    System.out.println("Enter Address");
    System.out.print("Address Line 1: ");
    scanner.nextLine();
    addressLine1=scanner.nextLine();
    System.out.print("Address Line 2: ");
    addressLine2=scanner.nextLine();
    System.out.print("City: ");
    city=scanner.nextLine();
    System.out.print("State: ");
    state=scanner.nextLine();
    System.out.print("Country: ");
    country=scanner.nextLine();
    Employee emp=new Employee(firstName,middleName,lastName,dateOfBirth,email,phone,department,dateOfJoining,designation,salary,addressLine1,addressLine2,city,state,country);
    employeeService.add(emp);
  }

  public void view()
  {
    employeeService.view();
  }

  public void update()
  {

  }
  public  void search()
  {
    System.out.println("Enter Id:");
    int id=scanner.nextInt();
    employeeService.searchById(id);
  }
  public void remove()
  {
    System.out.println("Enter Id:");
    int id = scanner.nextInt();
    employeeService.remove(id);
  }
  public void viewRemoved()
  {
    employeeService.viewRemoved();
  }
  public void home() throws Exception
  {

    boolean flag = true;

      System.out.println("1.Add New Employee");
      System.out.println("2.View Employee");
      System.out.println("3.Update Emplyee");
      System.out.println("4.Search Employee");
      System.out.println("5.Remove Employee");
      System.out.println("6.View all Removed Employee");
      System.out.println("0.Exit");
      Menu menu=Menu.values()[scanner.nextInt()];
      switch (menu)
      {
        case ADD:
            add();
          break;

          case VIEW:
            view();
          break;

        case UPDATE:
          update();
          break;

        case SEARCH:
          search();
          break;

        case REMOVED:
          remove();
          break;

        case VIEWREMOVED:
          viewRemoved();
          break;

        case EXIT:
          break;

        default:
          break;

    }
  }
}
