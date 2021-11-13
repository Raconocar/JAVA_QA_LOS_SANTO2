package case13;

public class Director extends Manager{


    public Director(String name, int age, int salary) {
        super(name, age, salary);
    }

    public int getSalary() {
        if (getNumberOfSubordinates() == 0) return BaseSalary;
        else {
            return super.getSalary()*(getNumberOfSubordinates()/100*9);
        }
    }

}
