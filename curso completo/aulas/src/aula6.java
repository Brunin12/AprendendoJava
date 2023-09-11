import co.brunoparreira.carros.Ferrari;

import java.util.Random;

public class aula6 {
    public static void main(String[] args) {
        Random gerar = new Random();

        Usuario user1 = new Usuario("Bruno parreira" ,12);
        user1.show();

        Ferrari carro1 = new Ferrari(2022, 4, "GT", "Brunin", 1500.00);
        carro1.setRodas(6);
        carro1.setModelo("Sport GT | SE Granturism Mode Default");
        carro1.setDono(user1.getNome());
        carro1.setVelocidadeMax(1445.5);
        carro1.setAno(2022);
        Ferrari.show();
    }
}
