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
public class Exercice8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in) ;
        double note = 0;
        double totalnote = 0;
        double nbboucle = 0 ;
        double moyenne = 0;
        
        while (note != -1){
            System.out.println("Saisissez une note ou -1 pour quitter : ");
            note= sc.nextDouble();
            totalnote = totalnote + note;
            nbboucle++;
            moyenne = totalnote / nbboucle;
        }

        System.out.println("La moyenne de la classe est : "+ moyenne );
        
    }
    
}
