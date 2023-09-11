import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import static java.awt.event.KeyEvent.VK_ENTER;

public class Pergunta extends JFrame {

    private static final long serialVersionUID = 1L;
    private static JLabel label;
    private static int resultado = 0;
    private JTextField entrada;

    Pergunta() {
        criarJanela();
    }

    private void criarJanela() {


        Random random = new Random();
        int tipo = random.nextInt(3);
        int n1 = random.nextInt(20);
        int n2 = random.nextInt(10);
        String simbolo = " + ";

        if (tipo == 0) {
            resultado = n1 + n2;
            simbolo = " + ";
        } else if (tipo == 1) {
            resultado = n1 - n2;
            simbolo = " - ";
        } else if (tipo == 2) {
            resultado = n1 * n2;
            simbolo = " x ";
        }


        setTitle("Pergunta!");
        JPanel painel = new JPanel();
        painel.setLayout(null);
        label = new JLabel("Pergunta rapida! quanto é " + n1 + simbolo + n2 + "?");
        add(label);
        this.setSize(300, 250);
        label.setBounds(300, 250, 300, 50);
        this.setBackground(Color.gray);
        setResizable(false);
        //Definimos o tamanho padrão do JTextField
        entrada = new JTextField(10);
    }





        public class LeitorDeTeclasAdapter extends KeyAdapter {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == VK_ENTER) {
                    int input = Integer.parseInt(entrada.getText());
                    if (input == resultado) {
                        setTitle("Acertou!");
                        Jogo.blocosComidos++;
                    } else {
                        setTitle("Errou!");
                        Jogo.blocosComidos--;
                    }

                }
            }
    }
}