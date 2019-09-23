package com.innovect.service;

import com.innovect.core.Employee;

public interface EmployeeService {
  void add(Employee employee);
  void view();
  void update();
  void searchById(int id);
  void remove(int id);
  void viewRemoved();

}
