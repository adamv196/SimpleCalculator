import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char premenna;
        float cislo1, cislo2, vysledok;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        cislo1 = sc.nextFloat();

        System.out.println("Vyber matematicku operaciu: -, +, /, *.");
        premenna = sc.next().charAt(0);

        System.out.println("Zadaj druhe cislo:");
        cislo2 = sc.nextFloat();
        System.out.println("Vysledok je:");

        DecimalFormat df = new DecimalFormat("##.#");
        DecimalFormat dff = new DecimalFormat("#.#");


        switch (premenna) {

            case '+':
                vysledok = cislo1 + cislo2;
                System.out.println(df.format(cislo1));
                System.out.println("+ " +dff.format(cislo2));
                System.out.println("-----------");
                System.out.println(df.format(vysledok));
                break;
            case '-':
                vysledok = cislo1 - cislo2;
                System.out.println(cislo1);
                System.out.println("- "+cislo2);
                System.out.println("-----------");
                System.out.println(vysledok);
                break;
            case '*':
                vysledok = cislo1 * cislo2;
                System.out.println(cislo1);
                System.out.println("* "+cislo2);
                System.out.println("-----------");
                System.out.println(vysledok);
                break;

            case '/':
                vysledok = cislo1 / cislo2;
                System.out.println(cislo1);
                System.out.println("* "+cislo2);
                System.out.println("-----------");
                System.out.println(vysledok);
                break;
        }

    }
}