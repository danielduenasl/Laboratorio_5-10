/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Temperatura> temps = new ArrayList();
        int a = 0;
        int cont = -20;
        while (a < 8){
            Temperatura temmp = new Temperatura();
            temmp.setGrados(cont);
            cont = cont + 5;
            temps.add(temmp);
            a++;
        }
               
        System.out.println("Temperaturas para 24 horas:");
        System.out.println("---    -30     0       30      60      90      120");
        for (Temperatura temp : temps){
            int i = 0;
            System.out.print(temp.getGrados() + "  ");
            int asteriscos = temp.getGrados() / 3;
            if (temp.getGrados() < 0){
                i = 0;
                while (i < asteriscos){
                    System.out.print("*");
                    i++;
                }
                System.out.println("|");
            } else {
                System.out.print("          |");
                i = 0;
                while (i < asteriscos){
                    System.out.print("*");
                    i++;
                }
                System.out.println("");             
            }
        }
        
    }
    
}
