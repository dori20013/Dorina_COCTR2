package feladat4;

import java.util.Date;
import java.util.Objects;

public class Autó {

    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Autó{" + "rendszám=" + rendszám + ", motorTeljesítmény=" + motorTeljesítmény + ", gyártásDátuma=" + gyártásDátuma + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autó other = (Autó) obj;
        if (this.motorTeljesítmény != other.motorTeljesítmény) {
            return false;
        }
        if (!Objects.equals(this.rendszám, other.rendszám)) {
            return false;
        }
        if (!Objects.equals(this.gyártásDátuma, other.gyártásDátuma)) {
            return false;
        }
        return true;
    }

}

class Teherautó extends Autó {

    private int maxSzállíthatóTeher;
    public Teherautó(String rendszám, int motorTeljesítmény, int maxSzállíthatóTeher) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teherautó{" + " maxSzállíthatóTeher: "+maxSzállíthatóTeher+" }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzállíthatóTeher != other.maxSzállíthatóTeher) {
            return false;
        }
        return true;
    }
    
}