
import java.util.Date;

public class Ital {

    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        Date gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
    }

    public boolean equals(Ital pia) {

        if (this.név.compareTo(pia.név) == 0 && this.ár == pia.ár && this.kiszerelés.compareTo(pia.kiszerelés) == 0) {
            return true;
        }
        return false;
    }

    public static double getÁrEuróban() {
        return (double) (ár * 0.00298617004);
    }
}
