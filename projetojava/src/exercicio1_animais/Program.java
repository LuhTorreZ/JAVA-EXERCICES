package exercicio1_animais;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Animal a1 = new Cachorro();
        Animal a2 = new gato();

        a1.fazerSom();
        a2.fazerSom();

        

        sc.close();
    }
}
