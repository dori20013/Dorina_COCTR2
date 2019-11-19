package zh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sor;
        String iORh = "";
        String[] token;
        int n = Integer.parseInt(br.readLine());
        Hallgato[] tomb = new Hallgato[n];
        try {
            for (int i = 0; i < n; i++) {
                sor = br.readLine();
                token = sor.split(" ");
                if (token[1].equals("igaz"))
                    iORh = "true";
                else if (token[1].equals("hamis"))
                    iORh = "false";
                tomb[i] = new Hallgato(Integer.parseInt(token[0]), Boolean.parseBoolean(iORh));
            }

            for (int i = 0; i < tomb.length; i++) {
                boolean d1 = tomb[i].dolgozatotIr().megfelelt();
                boolean d2 = tomb[i].dolgozatotIr().megfelelt();
                if (d1 & d2)
                    System.out.println("megfelelt");
                else
                    System.out.println("nem felelt meg");
            }
        } catch (Exception e) {}
    }
}