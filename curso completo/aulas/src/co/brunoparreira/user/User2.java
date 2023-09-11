package co.brunoparreira.user;

import static co.brunoparreira.utils.usm.capitalize;

public class User2 {

    private String fristName;
    private String lastName;
    private String fullName;


    public void setFristName(String fristName) {
        this.fristName = capitalize(fristName);
    }

    public void setLastName(String lastName) {
        this.lastName = capitalize(lastName);
    }

    public String getFristName() {
        return fristName.trim();
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
