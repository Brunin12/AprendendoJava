import co.brunoparreira.user.User3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class aula21 {
    public static void main(String[] args) {
        List<User3> users = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < random.nextDouble(3, 10); i++) {
            System.out.println("---Rodada " + (i + 1) + "---");
            User3 actual = new User3("Nome: " + (i + 1), "Sobrenome: " + (i + 2));
            users.add(actual);
            
            System.out.println(users.get(i).getFullName() + "\n");
        }
    }
}
