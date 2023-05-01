package jogoVelha;

public class Jogo {
    private Tabuleiro tabuleiro;
    private VerificarEspaco verificarEspaco;
    private char jogadorAtual;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        verificarEspaco = new VerificarEspaco();
        jogadorAtual = 'X';
    }

    public void iniciar() {
        while (!tabuleiro.verificarEmpate() && !tabuleiro.verificarVitoria('X') && !tabuleiro.verificarVitoria('O')) {
            tabuleiro.imprimirTabuleiro();
            System.out.println("É a vez do jogador " + jogadorAtual);
            int linha = verificarEspaco.lerLinha();
            int coluna = verificarEspaco.lerColuna();
            while (tabuleiro.getTabuleiro()[linha][coluna] != ' ') {
                System.out.println("Posição ocupada. Escolha outra.");
                linha = verificarEspaco.lerLinha();
                coluna = verificarEspaco.lerColuna();
            }
            tabuleiro.marcarPosicao(linha, coluna, jogadorAtual);
            if (jogadorAtual == 'X') {
                jogadorAtual = 'O';
            } else {
                jogadorAtual = 'X';
            }
        }
        tabuleiro.imprimirTabuleiro();
        if (tabuleiro.verificarVitoria('X')) {
            System.out.println("O jogador X venceu!");
        } else if (tabuleiro.verificarVitoria('O')) {
            System.out.println("O jogador O venceu!");
        } else {
            System.out.println("Empate!");
        }
    }
}
