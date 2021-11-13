package case13;

public class Manager extends Worker {

    private int NumberOfSubordinates;

    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        if (getNumberOfSubordinates() == 0) return BaseSalary;
        else {
            return super.getSalary()*(getNumberOfSubordinates()/100*3);
        }
    }


}
