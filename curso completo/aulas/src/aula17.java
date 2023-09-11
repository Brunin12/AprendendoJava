import co.brunoparreira.user.User;

public class aula17 {
    public static void main(String[] args) {
        User user = new User();
        user.fristName = "marcelo";
        user.lastName = "amorim da silva";
        String fullName = user.getName();

        System.out.println(fullName);
    }
}
