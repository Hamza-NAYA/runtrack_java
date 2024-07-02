package Jour07.Job01;

// public class Toto {
//     int toto = 0;
//     Toto() {
//         toto = toto + 1;
//     }
//     public static void main(String[] tutu){
//         Toto t1 = new Toto();
//         Toto t2 = new Toto();
//         System.out.println("Toto : " + toto);
//     }
// }

// Le membre de classe toto est une variable d'instance (non statique), 
// mais il est utilisé dans le contexte de la méthode main, 
// qui est une méthode statique. 
// En Java, une méthode statique ne peut pas accéder directement à des variables d'instance.
// Pour résoudre le problème on doit afficher la variable toto de chaque instance ici t1 et t2

public class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] tutu){
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        
        
        System.out.println("Toto : " + t1.toto);
        System.out.println("Toto : " + t2.toto);

        t2.toto += 1;
        System.out.println("Apres modification de la variable toto dans l'instance t2");
        System.out.println("Toto : " + t1.toto);
        System.out.println("Toto : " + t2.toto);
    }
}
