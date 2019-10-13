/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngolMagyarSzotar2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class Szotar
{
    String angol,magyar;

    public Szotar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Szotar> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String sor = sc.nextLine();
            String angol = sor.split(":")[0];
            String magyar = sor.split(":")[1];
            lista.add(new Szotar(angol, magyar));
        }
        lista.sort(Comparator
                .comparing(Szotar::getAngol)
                .thenComparing(Szotar::getMagyar)
        );
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).angol+":"+lista.get(i).magyar);
        }
    }
    
}