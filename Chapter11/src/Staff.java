/**
 * Created by xiong on 10/2/16.
 */
public class Staff extends Employee {
    protected String title;

    public Staff() {
    }

    public Staff(String name, String address,
                 String phoneNumber, String eMail,
                 String office, double salary,
                 MyDate dateHired, String title) {
        super(name, address, phoneNumber, eMail,
                office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
