/**
 * Created by xiong on 10/2/16.
 */
public class P3 {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.toString());
        SavingAccount savingAccount = new SavingAccount();
        System.out.println(savingAccount.toString());
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println(checkingAccount.toString());
    }
}
