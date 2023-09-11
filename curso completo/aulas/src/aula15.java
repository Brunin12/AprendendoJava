import static co.brunoparreira.utils.usm.cls;
import static co.brunoparreira.utils.usm.input;

public class aula15 {

    private static boolean isLoop = true;

    public static void main(String[] args) {
        // COMPARANDO STRINGS
        String password = new String("brunin16961");
        while (isLoop) {
            cls();
            var pass = input("digite sua senha");
            // == compara a referencia, não compara o conteudo
            if (password.equals(pass)) {
                isLoop = false;

            } else {
                System.out.println("senha incorreta");
            }
        }
        System.out.println("senha coreta");
    }
}
