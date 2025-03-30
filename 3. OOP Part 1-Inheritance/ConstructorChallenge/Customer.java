package ConstructorChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //Default constructor
    public Customer() {
        // call two param constructor
        this("Nobody", "nobody@email.com");
    }

    // 2 param constructor
    public Customer(String name, String email) {
        // calling 3 param constructor
        this(name, 1000, email);
    }

    // 3 Param Constructor
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
