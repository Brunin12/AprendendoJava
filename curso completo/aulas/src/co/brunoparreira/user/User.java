package co.brunoparreira.user;

public class User {

    public String fristName;
    public String lastName;
    public String fullName;




    public String getName() {
        fullName = fristName + " " + lastName;
        return fullName;
    }




}
