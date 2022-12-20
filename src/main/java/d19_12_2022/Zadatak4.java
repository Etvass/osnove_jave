package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Napisati program koji vodi evidenciju koliko je uneto sledecih
//        reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        • like
//        • smile
//        • heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1
//
//        Napomena: Ako se unese reakcija koju program ne podrzava,
//        ona ne utice na evidenciju.
//
//        POMOC: Svaka promenljiva nosi jednu informaciju,
//        to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter,
//        evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = mojs.nextInt();
        int brLike=0, brSmile=0, brHeart=0;

        for (int i = 1; i<=n; i++) {
            System.out.print("Reaguj: ");
            String reakcija = mojs.next();
            if (reakcija.contains("like")) {
                brLike++;
            }else if (reakcija.contains("smile")) {
                brSmile++;
            }else if (reakcija.contains("heart")) {
                brHeart++;
            }
        }
        System.out.println("Summary: "+"like "+brLike+" | "+"smile "+brSmile+" | "+"heart "+brHeart);
    }
}
