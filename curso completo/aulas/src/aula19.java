import co.brunoparreira.user.User2;

public class aula19 {
    public static void main(String[] args) {
        User2[] users = new User2[10];



        for(int i = 0; i < users.length; i++) {
            User2 actual = new User2();
            actual.setFristName("Nome: " + i);
            actual.setLastName("Sobrenome: " + i);
            users[i] = actual;
        }

        var u = users[2];

        System.out.println(u.getFristName());
        System.out.println(u.getLastName());

    }
}
