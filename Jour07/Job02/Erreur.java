package Jour07.Job02;

// class Erreur {
//     public static void main(String[] args) {
//         E1 x = new E1();
//         E2 y = new E2();
//         E3 z = new E3();
//         E4 v = new E4();
//         E5 w = new E5();
//         System.out.println(x.a); // Correct ou faux ?
//         System.out.println(y.c); // Correct ou faux ?
//         System.out.println(z.b); // Correct ou faux ?
//         System.out.println(v.c); // Correct ou faux ?
//         System.out.println(w.a); // Correct ou faux ?
//     }
// }

// class E1 {
//     int a = 1;
// }

// class E2 extends E1 {
//     int b = 2;
// }

// class E3 extends E2 {
//     int c = 3;
// }

// class E4 extends E1{
//     int d = 4;
// }

// class E5 extends E4{
//     int e = 5;
// }

class Erreur {
    public static void main(String[] args) {
        E1 x = new E1();
        // E2 y = new E2();
        E3 z = new E3();
        // E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a); // Correct int a = 1; est défini dans E1
        // System.out.println(y.c); // Faux, c est défini dans E3, pas dans E2
        System.out.println(z.b); // Correct b est défini dans E2, et E3 hérite de E2
        // System.out.println(v.c); // Faux, c n'est défini ni dans E4 ni dans ses classes parente (E1)
        System.out.println(w.a); // Correct a est défini dans E1, et E5 hérite de E1 (via E4).
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E1 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}