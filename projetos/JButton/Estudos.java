/*
 Este exemplo mostra como criar um JButton e
 adicioná-lo à janela do aplicativo. Observe
 também como detectamos o clique no botão.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Estudos extends JFrame{
    public Estudos() {
        super("A classe JButton");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Cria um botão com o texto "Clique Aqui"
        JButton btn = new JButton("Clique Aqui");
        btn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(null,
                                "Fui clicado");
                    }
                }
        );

        // Adiciona o botão à janela
        c.add(btn);

        setSize(350, 250);
        setVisible(true);
    }

    public static void main(String args[]){
        Estudos app = new Estudos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}