package feladat10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main10 {

    static List<Teherautó> husztonna(Autó[] tomb) {
        List<Teherautó> lista = new ArrayList<>();
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] instanceof Teherautó) {
                Teherautó a = (Teherautó) tomb[i];
                if (a.getTeherbírás() > 20000)
                    lista.add(a);
            }
        }
        return lista;
    }

    static List<Autó> top3(List<Autó> lista) {
        List<Autó> vissza = new ArrayList<>();
        Collections.sort(lista);
        if (lista.size() < 3)
            return lista;
        else {
            for (int i = 0; i < 3; i++) {
                vissza.add(lista.get(i));
            }
            return vissza;
        }
    }

    public static void main(String[] args) throws IOException {
        Autó a1 = new Autó("ABC123", 100, true);
        System.out.println(a1);
        Autó[] tomb = new Autó[4];
        List<Autó> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        String[] token;
        for (int i = 0; i < 2; i++) {
            sor = br.readLine();
            token = sor.split(" ");
            lista.add(new Autó(token[0], Integer.parseInt(token[1]),
                            Boolean.parseBoolean(token[2])));
            tomb[i] = new Autó(token[0], Integer.parseInt(token[1]),
                    Boolean.parseBoolean(token[2]));
        }
        for (int i = 2; i < 4; i++) {
            sor = br.readLine();
            token = sor.split(" ");
            lista.add(new Teherautó(token[0], Integer.parseInt(token[1]),
                    Boolean.parseBoolean(token[2]), Integer.parseInt(token[3])));
            tomb[i] = new Teherautó(token[0], Integer.parseInt(token[1]),
                    Boolean.parseBoolean(token[2]), Integer.parseInt(token[3]));
        }
    }
}