package Tiempo;
import java.time.LocalDate;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        valida();
    }

    public Fecha(){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
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

    public void valida(){
        if (anio < 1) {
            anio = 1900;
        }

        if (mes < 1 || mes > 12) {
            mes = 1;
        }

        try {
            LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            dia = 1;
        }
    }

    public String diasMes(int mes){
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        if (mes < 1 || mes > 12) {
            return "Mes inválido";
        }

        return meses[mes - 1];
    }

    public void corta(){
        String fcorta;
        String texto = String.valueOf(dia);
        String texto2 = String.valueOf(mes);
        String texto3 = String.valueOf(anio);

        fcorta = texto + "-" + texto2 + "-" + texto3;

        System.out.println(fcorta);
    }

    public void larga(){
        Calendar.DAY_OF_WEEK
    }
}
