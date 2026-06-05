package enums;

public enum Tecnoligia {
        ULTRAHD(8294400), CUATRO_K(8294400) , FULLHD(2073600);
        int cantPixeles;

        Tecnoligia(int cantPixeles) {
                this.cantPixeles = cantPixeles;
        }
}
