package fr.ystm;

import fr.ystm.pattern.abstractfactory.EmployeeFactoryImpl;
import fr.ystm.pattern.abstractfactory.IEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeFactoryImpl employee = new EmployeeFactoryImpl();
        IEmployee firstEmployee = employee.create("short term","Tassin", "Martin", 32);
        IEmployee secondEmployee = employee.create("permanent","Williams", "John",28);
        System.out.println(firstEmployee.toString());
        System.out.println(secondEmployee.toString());
    }
}