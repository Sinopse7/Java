import java.util.InputMismatchException;
import java.util.Scanner;

public class quatroemlinha {

    private static final int numColunas = 9;
    private static final int numLinhas = 6;
    private static String ganhador;
    private static String[][] tabuleiro = new String[numColunas][numLinhas];
    private static final String jogador1 = "X", jogador2 = "O";
    private static int quemJoga = 0;

    public static void main(String[] args) {
        recomecarJogo();

        do {
            mostraTabuleiro();
            if (quemJoga == 0) jogar1();
            tabuleiroCheio();
            alguemGanhou();
            if (quemJoga == 1) jogar2();
            tabuleiroCheio();
            alguemGanhou();
            if (quemJoga == 2) quemJoga = 1;
            if (quemJoga == 3) quemJoga = 0;
        } while (!alguemGanhou());

        mostraTabuleiro();
        System.out.println(quemGanhou(ganhador));
    }

    private static void recomecarJogo() {
        for (int colunas = 0; colunas < numColunas; colunas++) {
            for (int linhas = 0; linhas < numLinhas; linhas++) {
                tabuleiro[colunas][linhas] = "~";
            }
        }
    }

    private static void jogar1() {
        Scanner scanner = new Scanner(System.in);
        int largarPeca = -1;
        boolean jogou = false;

        if (quemJoga == 0) {
            while (true) {
                try {
                    System.out.print("Jogador 1, jogar na coluna (1-9):\t");
                    largarPeca = scanner.nextInt();
                    largarPeca = largarPeca - 1; // Ajusta para índice da matriz

                    // Verifica se a coluna é válida
                    if (largarPeca >= 0 && largarPeca < numColunas) {
                        break; // Coluna válida, sai do loop
                    } else {
                        System.out.println("Coluna inválida! Escolha uma coluna entre 1 e 9.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro entre 1 e 9.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }

            for (int vDisponivel = (numLinhas - 1); !jogou; vDisponivel--) {
                if (tabuleiro[largarPeca][0] != "~") {
                    System.out.print("Coluna cheia!\n Jogador 1, jogar na coluna:\t");
                    vDisponivel = numLinhas - 1;
                    largarPeca = scanner.nextInt();
                    largarPeca = largarPeca - 1;
                }

                if (tabuleiro[largarPeca][vDisponivel] == "~") {
                    tabuleiro[largarPeca][vDisponivel] = jogador1;
                    jogou = true;
                    quemJoga = 2;
                }
            }
        }
    }

    private static void jogar2() {
        Scanner scanner = new Scanner(System.in);
        int largarPeca = -1;
        boolean jogou = false;

        if (quemJoga == 1) {
            while (true) {
                try {
                    System.out.print("Jogador 2, jogar na coluna (1-9):\t");
                    largarPeca = scanner.nextInt();
                    largarPeca = largarPeca - 1; // Ajusta para índice da matriz

                    // Verifica se a coluna é válida
                    if (largarPeca >= 0 && largarPeca < numColunas) {
                        break; // Coluna válida, sai do loop
                    } else {
                        System.out.println("Coluna inválida! Escolha uma coluna entre 1 e 9.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro entre 1 e 9.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }

            for (int vDisponivel = numLinhas - 1; !jogou; vDisponivel--) {
                if (tabuleiro[largarPeca][0] != "~") {
                    System.out.print("Coluna cheia!\n Jogador 2, jogar na coluna:\t");
                    vDisponivel = numLinhas - 1;
                    largarPeca = scanner.nextInt();
                    largarPeca = largarPeca - 1;
                }

                if (tabuleiro[largarPeca][vDisponivel] == "~") {
                    tabuleiro[largarPeca][vDisponivel] = jogador2;
                    jogou = true;
                    quemJoga = 3;
                }
            }
        }
    }

    private static void tabuleiroCheio() {
        if (tabuleiro[0][0] != "~" &&
            tabuleiro[1][0] != "~" &&
            tabuleiro[2][0] != "~" &&
            tabuleiro[3][0] != "~" &&
            tabuleiro[4][0] != "~" &&
            tabuleiro[5][0] != "~" &&
            tabuleiro[6][0] != "~" &&
            tabuleiro[7][0] != "~" &&
            tabuleiro[8][0] != "~") {
            ganhador = "Tabuleiro cheio, empate.";
        }
    }

    private static boolean alguemGanhou() {
        if (ganhador == "Tabuleiro cheio, empate.") {
            return true;
        }

        // Verifica vitória na horizontal
        for (int xColuna = 0; xColuna < (numColunas - 4); xColuna++) {
            for (int xLinha = 0; xLinha < numLinhas; xLinha++) {
                if (tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 1][xLinha]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 2][xLinha]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 3][xLinha]
                    && tabuleiro[xColuna][xLinha] != "~") {
                    if (quemJoga == 0 || quemJoga == 2) {
                        ganhador = "Jogador 2 GANHOU!";
                        return true;
                    }
                    if (quemJoga == 1 || quemJoga == 3) {
                        ganhador = "Jogador 1 GANHOU!";
                        return true;
                    }
                }
            }
        }

        // Verifica vitória na vertical
        for (int xColuna = 0; xColuna < numColunas; xColuna++) {
            for (int xLinha = 0; xLinha < (numLinhas - 4); xLinha++) {
                if (tabuleiro[xColuna][xLinha] == tabuleiro[xColuna][xLinha + 1]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna][xLinha + 2]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna][xLinha + 3]
                    && tabuleiro[xColuna][xLinha] != "~") {
                    if (quemJoga == 0 || quemJoga == 2) {
                        ganhador = "Jogador 2 GANHOU!";
                        return true;
                    }
                    if (quemJoga == 1 || quemJoga == 3) {
                        ganhador = "Jogador 1 GANHOU!";
                        return true;
                    }
                }
            }
        }

        // Verifica vitória na diagonal (descendente)
        for (int xColuna = 0; xColuna < (numColunas - 4); xColuna++) {
            for (int xLinha = 0; xLinha < (numLinhas - 4); xLinha++) {
                if (tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 1][xLinha + 1]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 2][xLinha + 2]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 3][xLinha + 3]
                    && tabuleiro[xColuna][xLinha] != "~") {
                    if (quemJoga == 0 || quemJoga == 2) {
                        ganhador = "Jogador 2 GANHOU!";
                        return true;
                    }
                    if (quemJoga == 1 || quemJoga == 3) {
                        ganhador = "Jogador 1 GANHOU!";
                        return true;
                    }
                }
            }
        }

        // Verifica vitória na diagonal (ascendente)
        for (int xColuna = 0; xColuna < (numColunas - 4); xColuna++) {
            for (int xLinha = 3; xLinha < numLinhas; xLinha++) {
                if (tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 1][xLinha - 1]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 2][xLinha - 2]
                    && tabuleiro[xColuna][xLinha] == tabuleiro[xColuna + 3][xLinha - 3]
                    && tabuleiro[xColuna][xLinha] != "~") {
                    if (quemJoga == 0 || quemJoga == 2) {
                        ganhador = "Jogador 2 GANHOU!";
                        return true;
                    }
                    if (quemJoga == 1 || quemJoga == 3) {
                        ganhador = "Jogador 1 GANHOU!";
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static String quemGanhou(String fichaGanhadora) {
        return fichaGanhadora;
    }

    private static void mostraTabuleiro() {
        System.out.println(
            "\n" +
            "| " + tabuleiro[0][0] + " | " + tabuleiro[1][0] + " | " + tabuleiro[2][0] + " | " + tabuleiro[3][0] + " | " + tabuleiro[4][0] + " | " + tabuleiro[5][0] + " | " + tabuleiro[6][0] + " | " + tabuleiro[7][0] + " | " + tabuleiro[8][0] + " |\n" +
            "| " + tabuleiro[0][1] + " | " + tabuleiro[1][1] + " | " + tabuleiro[2][1] + " | " + tabuleiro[3][1] + " | " + tabuleiro[4][1] + " | " + tabuleiro[5][1] + " | " + tabuleiro[6][1] + " | " + tabuleiro[7][1] + " | " + tabuleiro[8][1] + " |\n" +
            "| " + tabuleiro[0][2] + " | " + tabuleiro[1][2] + " | " + tabuleiro[2][2] + " | " + tabuleiro[3][2] + " | " + tabuleiro[4][2] + " | " + tabuleiro[5][2] + " | " + tabuleiro[6][2] + " | " + tabuleiro[7][2] + " | " + tabuleiro[8][2] + " |\n" +
            "| " + tabuleiro[0][3] + " | " + tabuleiro[1][3] + " | " + tabuleiro[2][3] + " | " + tabuleiro[3][3] + " | " + tabuleiro[4][3] + " | " + tabuleiro[5][3] + " | " + tabuleiro[6][3] + " | " + tabuleiro[7][3] + " | " + tabuleiro[8][3] + " |\n" +
            "| " + tabuleiro[0][4] + " | " + tabuleiro[1][4] + " | " + tabuleiro[2][4] + " | " + tabuleiro[3][4] + " | " + tabuleiro[4][4] + " | " + tabuleiro[5][4] + " | " + tabuleiro[6][4] + " | " + tabuleiro[7][4] + " | " + tabuleiro[8][4] + " |\n" +
            "| " + tabuleiro[0][5] + " | " + tabuleiro[1][5] + " | " + tabuleiro[2][5] + " | " + tabuleiro[3][5] + " | " + tabuleiro[4][5] + " | " + tabuleiro[5][5] + " | " + tabuleiro[6][5] + " | " + tabuleiro[7][5] + " | " + tabuleiro[8][5] + " |\n" +
            "-------------------------------------\n" +
            "| " + "1" + " | " + "2" + " | " + "3" + " | " + "4" + " | " + "5" + " | " + "6" + " | " + "7" + " | " + "8" + " | " + "9" + " |\n"
        );
    }
}
