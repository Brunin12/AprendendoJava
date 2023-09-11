import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // ------Texto:

        JLabel texto = new JLabel("Olá, Mundo!", JLabel.CENTER);
        // cria um Olá Mundo no centro de janela

        texto.setFont(new Font("Calibri", Font.BOLD, 90));
        // define a fonte e tamanho do texto

        texto.setForeground(Color.white);
        // define a cor da fonte


        // ------Janela:

        JFrame janela = new JFrame();
        // cria uma janela da classe JFrame

        /*

        janela.setSize(1200, 720);
        define a largura e altura da janela (Não vou usar no projeto)

        */

        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // deixa a janela em tela cheia

        janela.getContentPane().setBackground(new Color(0, 42, 255));
        // define a cor do fundo

        janela.add(texto);
        // adiciona o texto definido anteriormente

        janela.setVisible(true);
        // deixa a janela visivel



    }
}