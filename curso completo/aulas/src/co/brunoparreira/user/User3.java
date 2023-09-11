package co.brunoparreira.user;

import static co.brunoparreira.utils.usm.capitalize;

public class User3 {

    private String firstName;
    private String lastName;
    private String fullName;

    public User3(String firstName, String lastName, boolean show) {
        this.firstName = capitalize(firstName);
        this.lastName = capitalize(lastName);
        this.fullName = firstName + " " + lastName;
        if (show) {
            System.out.println("usuario criado!");
        }
    }

    public User3(String firstName, String lastName) {
        this(firstName, lastName, true);
    }


    public String getFristName() {
        return firstName.trim();
    }

    public String getLastName() {
        return lastName.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void show() {
        System.out.println(getFullName());
    }



}
