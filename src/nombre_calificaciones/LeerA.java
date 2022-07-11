
package Nombre_calificaciones;

import java.io.*;


public class LeerA {

    public static void main(String args[]) {
        File n = new File("Nombres.txt");
        File c1 = new File("Calificaciones1.dat");
        File c2 = new File("Calificaciones2.dat");
        File c3 = new File("Calificaciones3.dat");
        if (n.exists() & c1.exists() & c2.exists() & c3.exists()) {
            try {
                FileReader fr = new FileReader(n);
                BufferedReader bf = new BufferedReader(fr);
                String cadena;

                System.out.println("Nombre\tCalificacion1\tCalificacion2\tCalificacion3\tPromedio");

                try {

                    FileInputStream f2 = new FileInputStream(c1);
                    DataInputStream d2 = new DataInputStream(f2);

                    FileInputStream f1 = new FileInputStream(c2);
                    DataInputStream d1 = new DataInputStream(f1);

                    FileInputStream f = new FileInputStream(c3);
                    DataInputStream d = new DataInputStream(f);

                    for (;;) {
                        while ((cadena = bf.readLine()) != null) {
                            double califica1 = d2.readInt();
                            double califica2 = d1.readInt();
                            double califica3 = d.readInt();
                            double prome = (califica1 + califica2 +califica3) / 3;
                            System.out.println(cadena + "\t\t" + califica1 + "\t\t" + califica2 + "\t\t" + califica3 + "\t" + prome); //este metodo regresa un valor entero 
                        }
                    }

                } catch (EOFException e) {
                    //e.printStackTrace();
                } catch (IOException e) {
                    //e.printStackTrace();
                }

            } catch (IOException e) {
                // e.printStackTrace();
            }

        } else {
            System.out.println("El archivo no existe!!!");
        }

    }
}
