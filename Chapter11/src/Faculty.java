/**
 * Created by xiong on 10/2/16.
 */
public class Faculty extends Employee {
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;

    protected String officeHours;
    protected int rank;

    public Faculty() {
    }

    public Faculty(String name, String address,
                   String phoneNumber, String eMail,
                   String office, double salary,
                   MyDate dateHired,
                   String officeHours, int rank) {
        super(name, address, phoneNumber, eMail,
                office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{}";
    }
}
