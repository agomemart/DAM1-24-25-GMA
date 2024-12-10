package ud2.practicando;

import java.util.Scanner;

public class TryCatch {
    
    public static void main(String[] args) {
        try {
            int num1;
            int num2;
            int resultado = 0;
    
            Scanner sc = new Scanner(System.in);
            System.out.print("Inserta el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Inserta el segundo número: ");
            num2 = sc.nextInt();
    
            System.out.println("Inserta la operación a realizar: +, -, /, *");
            char operacion = sc.nextLine().charAt(0);
            sc.close();

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    if (num2 == 0) {
                        throw new ArithmeticException("División entre 0 no permitida");
                    }
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;   
                default:
                System.out.println("Operación no válida");
                    break;
            }
            System.out.println("Resultado: " + resultado);
            
        } catch (NumberFormatException e) {
            System.out.println("Error. Inserta un número válido");
        } catch (ArithmeticException e) {
            System.out.println("Error." + e.getMessage());
        }
    }
}
