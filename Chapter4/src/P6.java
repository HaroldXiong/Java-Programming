/**
 * Created by Xiong on 2016/8/30.
 */
public class P6 {
    public static void main(String[] args) {
        System.out.println("miles\t\tkilometers" +
                "\t\tkilometers\t\tmiles");
        for (int miles = 1, kilometers = 20;
             miles <= 10; miles++, kilometers += 5) {
            System.out.printf("%-5d\t\t%-10.3f\t\t%-10d\t\t%-5.3f\n",
                    miles, miles * 1.609,
                    kilometers, kilometers / 1.609);
        }
    }
}
