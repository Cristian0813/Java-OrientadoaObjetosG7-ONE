import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intoduzca su nombre: ");
        String nome = scanner.nextLine();
        System.out.print("Introduzca su edad: ");
        int idade = scanner.nextInt();
        System.out.print("Introduzca el importe que desea invertir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tiene " + idade + " años, invertirá R$ " + valor + " reales este mes.");

        scanner.close();

    }
}
