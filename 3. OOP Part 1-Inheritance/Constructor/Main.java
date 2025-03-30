package Constructor;

public class Main {
    public static void main(String[] args) {
        /*Account bobsAccount = new Account("12345", 2300, "Bobs Brown", "myEmail@gmail.com", "(087) 123-4567");*/

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        Account timsAccount = new Account("Tim",
                 "tim@email.com", "12345" );
        System.out.println("AccountNo:: " + timsAccount.getNumber() +
                " name :: " + timsAccount.getCustomerName());

    }

}
