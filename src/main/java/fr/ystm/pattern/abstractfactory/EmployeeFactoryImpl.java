package fr.ystm.pattern.abstractfactory;

public class EmployeeFactoryImpl implements IEmployeeFactory {

    @Override
    public IEmployee create(String typeLabel, String lastname, String firstname, int age) {
        // Strategy pattern to avoid switch statement when creating IEmployee depending on label.
        AbstractEmployeeType type = AbstractEmployeeType.of(typeLabel);
        IEmployee employee = type.create(lastname,firstname,age);
        return employee;
        // Open / close principle and strategy pattern
        // this method is closed to any modification
    }
}
