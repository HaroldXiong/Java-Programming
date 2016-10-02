/**
 * Created by xiong on 10/2/16.
 */
public class CheckingAccount extends Account {
    protected int overdraftLimit = 5000;

    @Override
    public String toString() {
        return "CheckingAccount{}";
    }
}
