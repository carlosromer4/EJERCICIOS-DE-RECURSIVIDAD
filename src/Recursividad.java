import java.util.Scanner;

public class Recursividad {

    void punto1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para el factorial: ");
        int n = scanner.nextInt();
        int resultado = factorial(n);
        System.out.println("factorial(" + n + ") -> " + resultado);
        scanner.close();
    }

    int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    void punto2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese N para la suma del 1 al N: ");
        int n = scanner.nextInt();
        int resultado = suma(n);
        System.out.println("suma(" + n + ") -> " + resultado);
        scanner.close();
    }

    int suma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    void punto3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        int resultado = potencia(base, exponente);
        System.out.println("potencia(" + base + ", " + exponente + ") -> " + resultado);
        scanner.close();
    }

    int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    void punto4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        int resultado = contarDigitos(n);
        System.out.println("contarDigitos(" + n + ") -> " + resultado);
        scanner.close();
    }

    int contarDigitos(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    void punto5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        scanner.nextLine();
        String cadena = scanner.nextLine();
        String resultado = invertir(cadena);
        System.out.println("invertir(\"" + cadena + "\") -> \"" + resultado + "\"");
        scanner.close();
    }

    String invertir(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + invertir(cadena.substring(0, cadena.length() - 1));
    }
}