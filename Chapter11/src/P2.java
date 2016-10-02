/**
 * Created by xiong on 10/2/16.
 */
public class P2 {
    public static void main(String[] args) {
        Person person = new Person("Harold",
                "Tianjin", "13821955772", "xiongzhipeng1208@163.com");
        System.out.println(person.toString());
        Student student = new Student("Harold",
                "Tianjin", "13821955772",
                "xiongzhipeng1208@163.com", "Junior");
        System.out.println(student.toString());
        Employee employee = new Employee("Harold",
                "Tianjin", "13821955772", "xiongzhipeng1208@163.com",
                "Google", 10000, new MyDate());
        System.out.println(employee.toString());
        Faculty faculty = new Faculty("Harold",
                "Tianjin", "13821955772", "xiongzhipeng1208@163.com",
                "Google", 10000, new MyDate(), "8 hours per day", 1);
        System.out.println(faculty.toString());
        Staff staff = new Staff("Harold",
                "Tianjin", "13821955772", "xiongzhipeng1208@163.com",
                "Google", 10000, new MyDate(), "CEO");
        System.out.println(staff.toString());
    }
}
