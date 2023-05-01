package jogoVelha;

import java.util.Scanner;

public class VerificarEspaco {
    private Scanner scanner;

    public VerificarEspaco() {
        scanner = new Scanner(System.in);
    }

    public int lerLinha() {
        System.out.print("Digite a linha (L0, L1 ou L2): ");
        int linha = scanner.nextInt();
        while (linha < 0 || linha > 2) {
            System.out.print("Linha inválida. Digite a linha (L0, L1 ou L2): ");
            linha = scanner.nextInt();
        }
        return linha;
    }

    public int lerColuna() {
        System.out.print("Digite a coluna (C0, C1 ou C2): ");
        int coluna = scanner.nextInt();
        while (coluna < 0 || coluna > 2) {
            System.out.print("Coluna inválida. Digite a coluna (C0, C1 ou C2): ");
            coluna = scanner.nextInt();
        }
        return coluna;
    }
}
