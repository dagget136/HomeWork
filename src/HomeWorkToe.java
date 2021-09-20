import java.util.Random;
import java.util.Scanner;

/**
 * Java 1 HomeWork 4
 *
 * @author Toryanik Vladimir
 * @version 19.09
 */
class HomeWorkToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HomeWorkToe().game();
    }

    HomeWorkToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println("Game init...");
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
            }
            turnAI();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WIN");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter X Y (1..3): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean checkWin(char ch) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++)
                if ((table[y][0] == ch && table[y][1] == ch && table[y][2] == ch) ||
                        (table[0][x] == ch && table[1][x] == ch && table[2][x] == ch))
                    return true;
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
                    (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch))
                return true;
        }
        return false;
    }
}