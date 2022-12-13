package fr.ystm.pattern.abstractfactory;

public abstract class AbstractEmployeeType {
    public static AbstractEmployeeType of(String typeLabel) {
        switch (typeLabel) {
            case "permanent" :
                return new PermanentContractType();
            case "short term" :
                return new ShortTermContractType();
            default: return null;
        }

    }

    public abstract IEmployee create(String lastname, String firstname, int age);
}
