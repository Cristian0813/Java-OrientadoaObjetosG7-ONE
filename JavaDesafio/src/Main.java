import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 15900.99;
        int opcion = 0;

        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("\n*****************************************");

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Tipo de cuenta
                2 - Consultar saldo
                3 - Retirar
                4 - Depositar
                9 - Salir
                """;

        while (opcion != 9) {
            System.out.println("\n"+menu);
            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Su tipo de cuenta es: " + tipoDeCuenta);
                    break;
                case 2:
                    System.out.println("Su saldo actual es $" + saldo);
                    break;
                case 3:
                    System.out.println("Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Saldo restante $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Cuál es el valor que vas a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es $" + saldo );
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        teclado.close();
    }
}