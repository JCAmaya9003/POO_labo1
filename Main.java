import java.util.*;

public class Main {
    public static void main(String[] args) {
        float a = 0, b = 0;
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    a = sc.nextFloat();

                    System.out.println("Ingrese el segundo numero");
                    b = sc.nextFloat();
                break;

                case 2:
                    System.out.println("La suma de " + a + " y " + b + " es " + (a+b));
                break;
                case 3:
                    System.out.println("La resta de " + a + " y " + b + " es " + (a-b));
                break;

                case 4:
                    System.out.println("La multiplicacion de " + a + " y " + b + " es " + (a*b));
                break;

                case 5:
                    System.out.println("La division de " + a + " y " + b + " es " + (a/b) + ", y La division de " + b + " y " + a + " es " + (b/a));
                break;

                case 6:
                    System.out.println("Saliendo...");
                break;
                default:
                    System.out.println("Opcion incorrecta!");
                break;
            }
        }while(op != 6);
    }
}