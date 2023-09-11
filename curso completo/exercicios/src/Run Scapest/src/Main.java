import java.awt.*;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.util.*;
import javax.swing.*;

public class Main extends Canvas {

    private static final int largura = 500;
    private static final int altura = 500;

    // define duas constantes interas chamadas largura e altura

    private boolean gameOn = false;
    // cria um identificador para saber se o jogo esta rodando ou não


    private int x = 0;
    private int y = 0;

    Thread thread;

    public Main() {
        setPreferredSize(new Dimension(largura, altura));
        // define a altura e largura da janela
    }

    public void start() {
        gameOn = true;
        thread = new Thread(String.valueOf(this));
        thread.start();
        // inicia o jogo
    }


    public void run() {
        while (gameOn) {
            update();
            draw();
            //roda o jogo
        }
    }

    public void draw() {
        // cria um metodo chamado draw para desenhar no canvas
        BufferStrategy buffer = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = buffer.getDrawGraphics();

        g.setColor(Color.WHITE);
        g.drawRect(0, 0, altura, largura);

        g.setColor(Color.RED);
        g.drawOval(x, y, 50, 50);

        g.dispose();
        buffer.show();
    }

    public void update() {
        // cria um metodo chamado update para a parte logica
        x++;
        y++;
    }




    public static void main(String[] args) {
        JFrame janela = new JFrame();
        Main jogo = new Main();

        janela.add(jogo);
        janela.pack();
        janela.setVisible(true);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        jogo.start();

    }
}