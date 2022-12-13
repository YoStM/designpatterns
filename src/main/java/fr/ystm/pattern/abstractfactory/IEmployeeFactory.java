package fr.ystm.pattern.abstractfactory;

public interface IEmployeeFactory {
    IEmployee create(String typeLabel, String lastname, String firstname, int age);
}
