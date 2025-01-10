package ClassesChallenges;

public class Main {
    public static void main(String[] args) {
        // user :: BOb Brown
        Account bobsAccount  = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@gmail.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(500);
        bobsAccount.withdrawFunds(100);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(300.50);
    }
}
