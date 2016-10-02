import javafx.scene.shape.Circle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xiong on 10/2/16.
 */
public class P6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Loan());
        list.add(new Date());
        list.add(new String());
        list.add(new JFrame());
        list.add(new Circle());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
