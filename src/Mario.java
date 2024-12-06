import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Altura da pirâmide: ");
        int n = in.nextInt();

        // Loop que vai imprimir cada linha da pirâmide
        for (int i = 1; i <= n; i++) {

            // Imprime o numero de espaços com base em (n - i) para alinhar à direita
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Imprime os espaços em branco
            }

            // Imprime # para formar a pirâmide
            for (int k = 1; k <= i; k++) {
                System.out.print("#");  // Imprime # na mesma linha
            }

            // Pula para a próxima linha após imprimir uma linha
            System.out.println();
        }

        in.close();
    }
}
