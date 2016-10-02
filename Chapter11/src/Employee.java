/**
 * Created by xiong on 10/2/16.
 */
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee() {
    }

    public Employee(String name, String address,
                    String phoneNumber, String eMail,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, eMail);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
