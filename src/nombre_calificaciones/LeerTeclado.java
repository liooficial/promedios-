
package Nombre_calificaciones;

import java.io.*;


public class LeerTeclado {

    public static String leerCadena(String mensaje) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(mensaje);
        String cadena = br.readLine();

        return cadena;
    }

    public static int LeerCal(String mensaje) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(mensaje);
        String cadena = br.readLine();

        int numero = 0;
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("Por favor vuelve a intentarlo");
            numero = LeerCal(mensaje);
        }
       return numero;
    }
}
