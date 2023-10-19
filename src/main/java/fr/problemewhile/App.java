package fr.problemewhile;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int salaireheure = 15;

        System.out.println("combien d'heures avez vous travaillez dans la semaine : ");
        int heureTravailler = clavier.nextInt();

        while(heureTravailler<0 || heureTravailler>42){
            System.out.println("combien d'heures avez vous travaillez dans la semaine : ");
            heureTravailler = clavier.nextInt();
        }

        int salairesemaine = salaireheure * heureTravailler;
        System.out.println("votre salaire est de " + salairesemaine + " euro par semaine");
    }
    
}
