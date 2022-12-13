package fr.ystm.pattern.abstractfactory;

public class ShortTermContractType extends AbstractEmployeeType {
    @Override
    public IEmployee create(String lastname, String firstname, int age) {
        System.out.println("type of employee : shor term.");
        return new EmployeeOnShortTermContract(lastname,firstname,age);
    }
}
