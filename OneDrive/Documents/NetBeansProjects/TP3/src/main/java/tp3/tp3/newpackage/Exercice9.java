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
public class Exercice9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char operation =' ';
        boolean quitter = false;
        double nb1 = 0;
        double nb2 = 0;
        double resultat = 0;
        Scanner sc = new Scanner (System.in);
        while(!quitter){
            System.out.println("Saisissez une operation : ");
            if (operation == '+' || operation == '-'||operation == '*'||operation == '/'){
                switch(operation){
                    case '+':
                        resultat = nb1 + nb2;
                        break;
                    case '-':
                        resultat = nb1 - nb2;
                        break;
                    case '*':
                        resultat = nb1 * nb2;
                        break;
                    case '/':
                        resultat = nb1 / nb2;
                        break;
                }
                resultat=sc.nextDouble();
                System.out.println(resultat);
            }
            else{
                quitter = true;
            }
        }
    }
    
}
