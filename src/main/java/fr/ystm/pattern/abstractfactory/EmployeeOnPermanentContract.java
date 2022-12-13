package fr.ystm.pattern.abstractfactory;

public class EmployeeOnPermanentContract implements IEmployee{
    String lastname = null;
    String firstname = null;
    int age = 0;

    EmployeeOnPermanentContract(String lastname, String firstname, int age){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String toString(){
        return "{\nlastname : " + this.lastname + ",\nfirstname : " + this.firstname + ",\nage : " + this.age +"\n}";
    }
}
