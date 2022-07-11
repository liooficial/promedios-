
package Nombre_calificaciones;

import java.io.*;


public class EscribirA {
public static void main(String args[]) {
    String Nombre = null;
    File n = new File("Nombres.txt");
    File c1 = new File("Calificaciones1.dat");
    File c2 = new File("Calificaciones2.dat");
    File c3 = new File("Calificaciones3.dat");
    int i = 0;

        do {

           try {
            Nombre = LeerTeclado.leerCadena("Escribe el nombre del alumno que deseas almacenar: ");

            FileWriter fw = new FileWriter(n, true); //si append es false, sobreeescribe, si es true entonce agrega
            PrintWriter out = new PrintWriter(fw);

            out.println(Nombre);

            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //-------
        try{
            FileOutputStream fos = new FileOutputStream(c1,true);
            DataOutputStream dos = new DataOutputStream(fos);
            int numero=LeerTeclado.LeerCal("Escribe la primera calificacion: ");
            
             dos.writeInt(numero);
            
            dos.flush(); 
            dos.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //
          try{
            FileOutputStream fo = new FileOutputStream(c2,true);
            DataOutputStream dis = new DataOutputStream(fo);
            int numero=LeerTeclado.LeerCal("Escribe la segunda calificacion: ");
            
            dis.writeInt(numero);
            
            dis.flush(); 
            dis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        } 
        //
          try{
            FileOutputStream f = new FileOutputStream(c3,true);
            DataOutputStream d = new DataOutputStream(f);
            int numero=LeerTeclado.LeerCal("Escribe la tercera calificacion: ");
            
            d.writeInt(numero);
            
            d.flush(); 
            d.close();
        
            
        }catch(Exception e)
        {
            e.printStackTrace();
        } 
       
        System.out.println("--------------------------------------");
        i++;
    } while (i< 8);
     
}
}
