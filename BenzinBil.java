package BilUdlejningsOpgave;

public class BenzinBil extends Bil {

    private int OktanTal;
    private double kmPrL;

    public int getOktanTal() {
        return OktanTal;
    }

    public void setOktanTal(int OktanTal) {
        this.OktanTal = OktanTal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double KmPrL) {
        this.kmPrL = KmPrL;
    }

    public BenzinBil(int OktanTal, double KmPrL, String regNr, String mærke, String model, int årgang, int AntalDøre) {
        super(regNr, mærke, model, årgang, AntalDøre);
        this.OktanTal = OktanTal;
        this.kmPrL = KmPrL;

    }

    @Override
    public double BeregnGrønEjerAfgift() {

        if (kmPrL >= 20 && kmPrL <= 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL <= 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL <= 10) {
            return 5500;
        } else if (kmPrL < 5) {
            return 10470;
        } else {
            return 0.0;

        }
    }

    @Override
    public String toString() {
        return "Bilmærke: " + getMærke()
                + "\n" + "Model: " + getModel()
                + "\n" + "Årgang: " + getÅrgang()
                + "\n" + "Reg. nr: " + getRegNr()
                + "\n" + "Antal Døre: " + getAntalDøre()
                + "\n" + "OktanTal: " + OktanTal
                + "\n" + "kmPrL: " + kmPrL
                + "\n" + "Ejerafgift: " + BeregnGrønEjerAfgift()
                + "\n";

    }

}
