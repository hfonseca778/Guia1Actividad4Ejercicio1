
/**
 * Programa cuenta los bits necesarios
 * para representar un numero
 * positivo en binario
 * 
 * @author hfonseca778
 * @version 05-08-2017
 */
import java.util.Scanner;
public class contador
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        int numerosolicitado = 0;
        
        System.out.println("Introduce el número que deseas calcular: ");         
        numerosolicitado=reader.nextInt();

        System.out.println("Bits necesarios para escribir "+numerosolicitado+" son "+cuentaBits(numerosolicitado));

    }
    static int cuentaBits(int numero) {
      int bits_necesarios = 0;
      while(numero > 0) {
            bits_necesarios++;
            numero = numero >> 1; // Desplazo bits (división por 2)
      }
      return bits_necesarios;
    }
}