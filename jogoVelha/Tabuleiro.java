package jogoVelha;

public class Tabuleiro {
    private char[][] tabuleiro = new char[3][3];
    
    

    public Tabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void imprimirTabuleiro() {
    	System.out.println("  C0 C1 C2");
    	System.out.println("L0 " + tabuleiro[0][0] + "| " + tabuleiro[0][1] + "| " + tabuleiro[0][2]);
    	System.out.println("  ---------");
    	System.out.println("L1 "+ tabuleiro[1][0] + "| " + tabuleiro[1][1] + "| " + tabuleiro[1][2]);
    	System.out.println("  ---------");
    	System.out.println("L2 "+ tabuleiro[2][0] + "| " + tabuleiro[2][1] + "| " + tabuleiro[2][2]);
    	System.out.println("  ----------");
        
        }


    public void marcarPosicao(int linha, int coluna, char jogador) {
        tabuleiro[linha][coluna] = jogador;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificarVitoria(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }
}

