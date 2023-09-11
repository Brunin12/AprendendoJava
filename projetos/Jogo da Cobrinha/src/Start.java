import javax.swing.*;

public class Start extends JFrame {
    public static void main(String[] args) {
        new Start();
    }

    Start() {
        add(new Jogo());
        setTitle("Jogo Da Cobra");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
