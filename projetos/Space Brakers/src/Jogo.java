import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Jogo extends JPanel implements ActionListener {
    private static final int LARGURA_TELA = 1000;
    private static final int ALTURA_TELA = 600;
    private static final String NOME_FONTE = "Arial";
    private static int inimigos_sec = 2;
    private static boolean jogando = false;
    public static Jogador jogador = new Jogador();
    ;
    Random random;

    Jogo() {
        setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
        setBackground(new Color(0x1F1F1F));
        setFocusable(true);
        addKeyListener(new LeitorDeTeclasAdapter());
        iniciarJogo();
    }

    private void iniciarJogo() {
        jogando = true;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharTela(g);
    }


    public void desenharTela(Graphics g) {


        if (jogando) {
            g.setColor(new Color(0x00FF15));
            g.fillRect(jogador.x, jogador.y, 50, 30);

            g.setColor(Color.WHITE);
            g.setFont(new Font(NOME_FONTE, Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Pontos: " + jogador.pontos, (LARGURA_TELA - metrics.stringWidth(("Pontuação: " + jogador.pontos))) / 2, g.getFont().getSize());

        } else {

            fimDeJogo(g);


        }

    }

    private void fimDeJogo(Graphics g) {

        g.setColor(Color.red);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 40));
        FontMetrics fontePontuacao = getFontMetrics(g.getFont());
        g.drawString("Pontos: " + jogador.pontos, (LARGURA_TELA - fontePontuacao.stringWidth(("Pontuação: " + jogador.pontos))) / 2, g.getFont().getSize());
        g.setColor(Color.red);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 75));
        FontMetrics fontFinal = getFontMetrics(g.getFont());
        g.drawString("Fim de Jogo >:)", (LARGURA_TELA - fontFinal.stringWidth("Fim de Jogo")) / 2, ALTURA_TELA / 2);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void validarLimites() {


        // A cabeça bateu nas paredes?

        if (jogador.x < 0 || jogador.x > LARGURA_TELA - 1) {
            jogando = false;

        }

        // A cabeça bat < 0 || jogador.x > ALTURA_TELA) {
        jogando = false;

    }


    public class LeitorDeTeclasAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    jogador.x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    jogador.x += 10;
                    break;
                case KeyEvent.VK_UP:
                    jogador.y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    jogador.y -= 10;
                    break;
                case KeyEvent.VK_A:
                    jogador.x -= 10;
                    break;
                case KeyEvent.VK_D:
                    jogador.x += 10;
                    break;
                case KeyEvent.VK_W:
                    jogador.x -= 10;
                    break;
                case KeyEvent.VK_S:
                    jogador.y += 10;
                    break;
                case KeyEvent.VK_SPACE:
                    jogador.y += 10;
                    break;
                default:
                    break;
            }
        }
    }
}
