package fr.ystm.pattern.abstractfactory;

public class PermanentContractType extends AbstractEmployeeType{
    @Override
    public IEmployee create(String lastname, String firstname, int age) {
        System.out.println("type of employee : permanent.");
        return new EmployeeOnPermanentContract(lastname,firstname,age);
    }
}
