import java.util.ArrayList;

/**
 * Created by xiong on 10/2/16.
 */
public class Course {
    private String name;

    private ArrayList students = new ArrayList();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] temp = new String[students.size()];
        for (int i = 0; i < temp.length; i++)
            temp[i] = (String) students.get(i);

        return temp;
    }

    public int getNumberOfStudents() {
        return students.size();
    }
}
