/**
 * Created by xiong on 10/3/16.
 */
public class BinaryFormatException extends Exception {
    BinaryFormatException() {
        super("Illegal binary character");
    }

    BinaryFormatException(String message) {
        super(message);
    }

}
