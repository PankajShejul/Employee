package com.innovect.service;

import com.innovect.core.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImplementation implements EmployeeService{
  private List<Employee> listOfEmployees;
  private List<Employee> listOfRemovedEmployees;
  public EmployeeServiceImplementation()
  {
    listOfEmployees=new ArrayList<>();
    listOfRemovedEmployees=new ArrayList<>();
  }

  @Override
  public void add(Employee employee) {
    listOfEmployees.add(employee);
  }

  @Override
  public void view() {
    for(Employee employee: listOfEmployees)
    {
      System.out.println(employee);
    }
  }

  @Override
  public void update() {

  }

  @Override
  public void searchById(int id) {
    for(Employee e:listOfEmployees)
    {
      if(e.getId()==id)
      {
        System.out.println(e);
        break;
      }
    }
  }

  @Override
  public void remove(int id) {
    Employee temp=null;
    for(Employee e:listOfEmployees)
    {
      if(e.getId()==id)
      {
        temp=e;
        listOfRemovedEmployees.add(e);
        break;
      }
    }
    listOfEmployees.remove(temp);
  }

  @Override
  public void viewRemoved() {
    for(Employee e:listOfRemovedEmployees)
    {
      System.out.println(e);
    }
  }
}
