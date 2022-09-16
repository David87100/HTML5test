/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.tp3.newpackage;
import java.util.Scanner;
/**
 *
 * @author 33647
 */
public class Exercice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char reponse = 'o';
        while (reponse == 'o'){
            System.out.println("Voulez-vous continuer ? (o / n)");
            reponse = sc.next() .charAt(0);
        }
        System.out.println("(suite ...)");
        
    }
    
}
