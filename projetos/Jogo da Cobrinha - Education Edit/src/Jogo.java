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
    private static final int TAMANHO_BLOCO = 25;
    private static final int UNIDADES = LARGURA_TELA * ALTURA_TELA / (TAMANHO_BLOCO * TAMANHO_BLOCO);
    private static final int INTERVALO = 200;
    private static final String NOME_FONTE = "Arial";
    private static final int[] eixoX = new int[UNIDADES]
;
    private static final int[] eixoY = new int[UNIDADES];
    public static int blocosComidos = 0;
    private static int corpoCobra = 6;
    private int blocoX;
    private int blocoY;
    private char direcao = 'D';
    private boolean jogando = false;
    Timer timer;
    Random random;

    Jogo() {
        random = new Random();

        setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
        setBackground(new Color(0x06A616));
        setFocusable(true);
        addKeyListener(new LeitorDeTeclasAdapter());
        iniciarJogo();
    }

    public void iniciarJogo() {

        criarBloco();
        jogando = true;
        timer = new Timer(INTERVALO, this);
        timer.start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharTela(g);
    }


    public void desenharTela(Graphics g) {


        if (jogando) {
            g.setColor(new Color(0xF51B1B));
            g.fillOval(blocoX, blocoY, TAMANHO_BLOCO, TAMANHO_BLOCO);

            for (int i = 0; i < corpoCobra; i++) {
                if (i == 0) {
                    g.setColor(new Color(0x00FF15));
                    g.fillRect(eixoX[0], eixoY[0], TAMANHO_BLOCO, TAMANHO_BLOCO);
                } else {
                    g.setColor(new Color(0x04DE16));
                    g.fillRect(eixoX[i], eixoY[i], TAMANHO_BLOCO, TAMANHO_BLOCO);
                }
            }

            g.setColor(Color.WHITE);
            g.setFont(new Font(NOME_FONTE, Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Pontos: " + blocosComidos, (LARGURA_TELA - metrics.stringWidth(("Pontuação: " + blocosComidos))) / 2, g.getFont().getSize());

        } else {

            fimDeJogo(g);


        }

    }

    private void fimDeJogo(Graphics g) {

        g.setColor(Color.red);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 40));
        FontMetrics fontePontuacao = getFontMetrics(g.getFont());
        g.drawString("Pontos: " + blocosComidos, (LARGURA_TELA - fontePontuacao.stringWidth(("Pontuação: " + blocosComidos))) / 2, g.getFont().getSize());
        g.setColor(Color.red);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 75));
        FontMetrics fontFinal = getFontMetrics(g.getFont());
        g.drawString("Fim de Jogo >:)", (LARGURA_TELA - fontFinal.stringWidth("Fim de Jogo")) / 2, ALTURA_TELA / 2);

    }


    private void criarBloco() {
        blocoX = random.nextInt(LARGURA_TELA / TAMANHO_BLOCO) * TAMANHO_BLOCO;
        blocoY = random.nextInt(ALTURA_TELA / TAMANHO_BLOCO) * TAMANHO_BLOCO;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (jogando) {
            andar();
            alcancarBloco();
            validarLimites();
        }
        repaint();

    }

    private void validarLimites() {
        // A cabeça bateu com o proprio corpo?
        for (int i = corpoCobra; i > 0; i--) {
            if (eixoX[0] == eixoX[i] && eixoY[0] == eixoY[i]) {
                jogando = false;

                break;
            }
        }

        // A cabeça bateu nas paredes?

        if (eixoX[0] < 0 || eixoX[0] > LARGURA_TELA - 1) {
            jogando = false;

        }

        // A cabeça bateu no teto
        if (eixoY[0] < 0 || eixoY[0] > ALTURA_TELA) {
            jogando = false;
        }

        if (!jogando) {
            timer.stop();
        }
    }

    private static void piscar(Graphics g) {
        for (int i = 0; i < corpoCobra; i++) {

            g.setColor(new Color(0xFFFFFF));
            g.fillRect(eixoX[i], eixoY[i], TAMANHO_BLOCO, TAMANHO_BLOCO);
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < corpoCobra; i++) {
            if (i == 0) {
                g.setColor(new Color(0x00FF15));
                g.fillRect(eixoX[0], eixoY[0], TAMANHO_BLOCO, TAMANHO_BLOCO);
            } else {
                g.setColor(new Color(0x04DE16));
                g.fillRect(eixoX[i], eixoY[i], TAMANHO_BLOCO, TAMANHO_BLOCO);
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    private void alcancarBloco() {
        if (eixoX[0] == blocoX && eixoY[0] == blocoY) {
            Pergunta init = new Pergunta();
            corpoCobra++;
            blocosComidos++;
            criarBloco();
        }
    }

    private void andar() {
        Graphics g = getGraphics();

        for (int i = corpoCobra; i > 0; i--) {
            eixoX[i] = eixoX[i - 1];
            eixoY[i] = eixoY[i - 1];
        }

        switch (direcao) {
            case 'C':
                eixoY[0] = eixoY[0] - TAMANHO_BLOCO;
                break;
            case 'B':
                eixoY[0] = eixoY[0] + TAMANHO_BLOCO;
                break;
            case 'E':
                eixoX[0] = eixoX[0] - TAMANHO_BLOCO;
                break;
            case 'D':
                eixoX[0] = eixoX[0] + TAMANHO_BLOCO;
                break;
            default:
                break;
            }
    }

    public class LeitorDeTeclasAdapter extends KeyAdapter {
        @Override
        public  void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direcao != 'D') {
                        direcao = 'E';

                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direcao != 'E') {
                        direcao = 'D';

                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direcao != 'B') {
                        direcao = 'C';

                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direcao != 'C') {
                        direcao = 'B';

                    }
                    break;
                case KeyEvent.VK_A:
                    if (direcao != 'D') {
                        direcao = 'E';

                    }
                    break;
                case KeyEvent.VK_D:
                    if (direcao != 'E') {
                        direcao = 'D';

                    }
                    break;
                case KeyEvent.VK_W:
                    if (direcao != 'B') {
                        direcao = 'C';

                    }
                    break;
                case KeyEvent.VK_S:
                    if (direcao != 'C') {
                        direcao = 'B';

                    }
                    break;
                case KeyEvent.VK_SPACE:
                    if (direcao != 'B') {
                        direcao = 'C';

                    }
                default:
                    break;
            }
        }

    }

}


