import java.util.InputMismatchException;
import java.util.Scanner; 

public class Bisiesto_checker {

    public static void main (String[] args)
    {
      Scanner sc = new Scanner (System.in);
      int year = 0;

        System.out.println("Bienvenido al operador de años bisiestos");
        System.out.println("Inserte el año que desea comprobar:"); 
        System.out.println("presione 1 para salir");

        while (year != 1) {
            try {
                year = sc.nextInt ();

                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 00) {
                    System.out.println ("El año presentado es bisiesto");
                    }
                    else    {
                    System.out.println ("El año presentado no es bisiesto");
                    }

            } catch (InputMismatchException e) {
                System.out.println("posiblemente no es un valor valido \n");
                sc.next();
            }
        }
      
        sc.close();
    }

}