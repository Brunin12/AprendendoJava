import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        // define a janela

        Graficos graficos = new Graficos();
        // define uma instancia da class Graficos que eu criada anteriormente

        frame.add(graficos);
        // implementa a classe graficos na janela

        frame.setTitle("Graficos em JFrame");
        // define o titulo da janela

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // define que o programa deve parar junto com a janela assim que o (X) for apertado

        frame.setSize(900, 700);
        // define o tamanho da janela

        frame.setVisible(true);
        // deixa a janela visivel

    }
}