/**
 * Created by xiong on 10/5/16.
 */
public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (getRadius() > ((ComparableCircle) o).getRadius())
            return 1;
        else if (getRadius() < ((ComparableCircle) o).getRadius())
            return -1;
        else
            return 0;
    }
}
