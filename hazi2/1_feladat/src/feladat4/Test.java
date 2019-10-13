package feladat4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void rendezMaxSzállithatóTeherCsökkenőleg(Teherautó[] teher) {
        Arrays.sort(teher, Collections.reverseOrder(Comparator.comparing(Teherautó::getMaxSzállíthatóTeher)));
    }

    public static Autó keresMaxMotorTeljesítmény(Autó[] auto) {
        Arrays.sort(auto, Collections.reverseOrder(Comparator.comparing(Autó::getMotorTeljesítmény)));
        return auto[0];
    }

    public static void main(String[] args) {
        Autó[] autó = new Autó[10];
        autó[0] = new Autó("ABC123", 1354);
        autó[1] = new Autó("ABC123", 12);
        autó[2] = new Autó("ABC123", 13);
        autó[3] = new Autó("ABC123", 167);
        autó[4] = new Autó("ABC123", 1564);
        autó[5] = new Teherautó("TEH123", 1264, 12000);
        autó[6] = new Teherautó("TEH123", 1564, 3500);
        autó[7] = new Teherautó("TEH123", 1364, 6000);
        autó[8] = new Teherautó("TEH123", 164, 8500);
        autó[9] = new Teherautó("TEH123", 1544, 4000);
        Teherautó[] teherauto = new Teherautó[10];
        teherauto[0] = new Teherautó("TEH111", 136, 531);
        teherauto[1] = new Teherautó("TEH111", 43, 5435);
        teherauto[2] = new Teherautó("TEH111", 54, 5343);
        teherauto[3] = new Teherautó("TEH111", 64, 7567);
        teherauto[4] = new Teherautó("TEH111", 53, 4362);
        teherauto[5] = new Teherautó("TEH111", 424, 6447);
        teherauto[6] = new Teherautó("TEH111", 267, 8855);
        teherauto[7] = new Teherautó("TEH111", 341, 34404);
        teherauto[8] = new Teherautó("TEH111", 1346, 53341);
        teherauto[9] = new Teherautó("TEH111", 13, 530);
        rendezMaxSzállithatóTeherCsökkenőleg(teherauto);
        for (int i = 0; i < teherauto.length; i++) {
            System.out.println(teherauto[i].toString());
        }
        System.out.println(keresMaxMotorTeljesítmény(autó));

    }
}
