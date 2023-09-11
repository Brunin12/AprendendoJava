import java.util.Arrays;

public class aula25 {
    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "Bruno");
        System.out.println(Arrays.toString(names));
    }
}
