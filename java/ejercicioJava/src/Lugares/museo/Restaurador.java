package Lugares.museo;

public class Restaurador {
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaN;
    private int aniosXP;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public int getAniosXP() {
        return aniosXP;
    }

    public void setAniosXP(int aniosXP) {
        this.aniosXP = aniosXP;
    }

    public Restaurador(String nombre, String apellido, int dni, String fechaN, int aniosXP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaN = fechaN;
        this.aniosXP = aniosXP;
    }

    public String restaurar(Cuadro cuadro){
        int restaura;
        int antiguedad = 2026 - cuadro.getAnioCreacion();
        String txtAntes;
        String txtDespues;
        String txt;

        txtAntes = "Antes: " + cuadro.getConservacion();

        if(antiguedad > 25){
            restaura = cuadro.getConservacion() + 2;
            if(restaura > 10){restaura = 10;};
            cuadro.setConservacion(restaura);
        }
        else{
            restaura = cuadro.getConservacion() + 3;
            if(restaura > 10){restaura = 10;};
            cuadro.setConservacion(restaura);
        }
        txtDespues = "Despues: " + cuadro.getConservacion();

        txt = txtAntes + "\n" + txtDespues;

        return txt;
    }

    public static void main(String[] args) {
        Restaurador r = new Restaurador("juan3", "juanap", 211111111, "2 de abril de 1999", 18);
        Cuadro c = new Cuadro("pajaro", "juan2", 2000, 4);

        System.out.println(r.restaurar(c));
    }
}
