import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ЗАДАЧА №1");
        System.out.print("Введите количество строк матрицы: ");
        int r = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int c = scanner.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 20);
            }
        }

        System.out.println("Полученная матрица:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Число, которое нужно прибавить к элементу arr[" + i + "][" + j + "]: ");
                arr[i][j] += scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("Полученная матрица после преобразования:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма элементов измененой матрицы равно " + sum);
        System.out.println("******");
        System.out.println("ЗАДАЧА №2");
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = "W";
                else chess[i][j] = "B";
            }
        }
        System.out.println("Полученное шахматное поле:");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}

