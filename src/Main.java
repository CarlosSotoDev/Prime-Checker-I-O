import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //Write the logic to check if the number has any divisors other than 1 and itself

        //instance de BuufferedReadear
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{

            //Enter and read a number
            System.out.println("Enter a number to evaluate");
            int number  = Integer.parseInt(reader.readLine());

            //isPrime
            boolean isPrime = true;

            //The number must to be higher than 1
            if (number <= 1) {
                isPrime = false;
            } else {
                // Verificamos si tiene divisores entre 2 y la raíz cuadrada del número
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false; // Si encontramos un divisor, no es primo
                        break; // Salimos del bucle
                    }
                }
            }

            // Resultado final
            if (isPrime) {
                System.out.println(number + " is a Prime number");
            } else {
                System.out.println(number + " is not a Prime number");
            }

        }catch(IOException e){
            System.out.println("An error ocured while reading the input" + e.getMessage());
        }

    }
}