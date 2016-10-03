/**
 * Created by xiong on 10/3/16.
 */
public class HexFormatException extends Exception {
    HexFormatException() {
        super("Illegal hex character");
    }

    HexFormatException(String message) {
        super(message);
    }
}
