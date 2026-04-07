package Tiempo;
import java.time.LocalDate;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha(){
        this.dia = 13;
        this.mes = 4;
        this.anio = 2012;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        valida();
    }

    public void valida(){
        if(!(dia <= 31 && dia >= 1)){
            dia = 1;
        }
        if(!(mes <= 12 && mes >= 1)){
            mes = 1;
        }
        if(anio > 2026){
            anio = 1900;
        }
    }

    public int diasMes(int mes){
        int dias = 0;

        if(mes == 1){dias = 31;};
        if(mes == 2){dias = 28;};
        if(mes == 3){dias = 31;};
        if(mes == 4){dias = 30;};
        if(mes == 5){dias = 31;};
        if(mes == 6){dias = 30;};
        if(mes == 7){dias = 31;};
        if(mes == 8){dias = 31;};
        if(mes == 9){dias = 30;};
        if(mes == 10){dias = 31;};
        if(mes == 11){dias = 30;};
        if(mes == 12){dias = 31;};

        return dias;
    }

    public void corta(){
        String texto1 = String.valueOf(dia);
        String texto2 = String.valueOf(mes);
        String texto3 = String.valueOf(anio);

        String texto = texto1 + " " + texto2 + " " + texto3;

        System.out.println(texto);
    }

    public void larga() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        int diaSemana = fecha.getDayOfWeek().getValue();

        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String resultado = dias[diaSemana - 1] + " " + this.dia + " de " + meses[this.mes - 1] + " de " + this.anio;

        System.out.println(resultado);
    }

    public void siguiente(){
        dia++;
    }

    public void anterior(){
        dia--;
    }

    public boolean igualQue(Fecha fecha){
        boolean igual = false;

        if(this.dia == fecha.dia && this.mes == fecha.mes && this.anio == fecha.anio){
            igual = true;

        }

        return igual;
    }

    public boolean menorQue(Fecha fecha){
        boolean igual = false;

        if (this.anio < fecha.anio) {
            igual = true;
        }

        if (this.anio == fecha.anio && this.mes < fecha.mes) {
            igual = true;
        }

        if (this.anio == fecha.anio && this.mes == fecha.mes && this.dia < fecha.dia) {
            igual = true;
        }

        return igual;
    }

    public boolean mayorQue(Fecha fecha){
        boolean igual = false;

        if (this.anio > fecha.anio) {
            igual = true;
        }

        if (this.anio == fecha.anio && this.mes > fecha.mes) {
            igual = true;
        }

        if (this.anio == fecha.anio && this.mes == fecha.mes && this.dia > fecha.dia) {
            igual = true;
        }

        return igual;
    }

    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(21, 12, 2002);

        f1.corta();
        f1.larga();
        f1.siguiente();
        f1.anterior();
        System.out.println(f1.diasMes(2));

        if(f1.igualQue(f2)){
            System.out.println("es igual");
        } else {
            System.out.println("no es igual");
        }

        if(f1.menorQue(f2)){
            System.out.println("es menor");
        } else {
            System.out.println("no es menor");
        }

        if(f1.mayorQue(f2)){
            System.out.println("es mayor");
        } else {
            System.out.println("no es mayor");
        }
    }
}
