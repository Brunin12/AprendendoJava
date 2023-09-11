import javax.swing.*;
import java.awt.*;

public class Graficos extends JPanel {
    public void paintComponent(Graphics g) {
        // cria o metodo desenha

        super.paintComponent(g);
        // chama o methodo da classe JPanel como super

        this.setBackground(Color.white);
        // define a cor do fundo

        g.setColor(Color.red);
        // define a cor do pincel como vermelha

        g.drawRect(25, 25, 300, 60);
        // desenha um retangulo da cordenada x:25 ate y:25 com 300x60 de tamanho
        // (sem pre-enchimento)

        g.fillRect(25, 100, 300, 60);
        // pinta um retangulo da cordenada x:25 ate y:25 com 300x60 de tamanho
        // (com pre-enchimento)

        g.setColor(Color.blue);
        // define a cor do pincel para azul

        g.drawOval(25, 180, 100, 100);
        // desnha um circulo (sem pre-enchimento)

        g.setColor(Color.yellow);
        // define a cor do pincel para amarelo

        g.fillOval(300, 180, 100, 100);
        // desnha um circulo (com pre-enchimento)

        g.setColor(Color.black);
        // define a cor do pincel para preto

        g.setFont(new Font("Calibri", Font.BOLD, 70));
        // define a fonte do texto

        g.drawString("Olá, Mundo!", 25, 420);
        // digita "Olá, Mundo!" na tela

    }

}
