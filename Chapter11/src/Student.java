/**
 * Created by xiong on 10/2/16.
 */
public class Student extends Person {
    protected static String state;

    public Student() {
    }

    public Student(String name, String address,
                   String phoneNumber, String eMail, String state) {
        super(name, address, phoneNumber, eMail);
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
