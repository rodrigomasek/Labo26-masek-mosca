package practica1;

public class Alumno extends Persona{
    private char division;

    public Alumno(String nombre, String apellido, char division) {
        super(nombre, apellido);
        this.division = division;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
    @Override
    public float verDescuento()
    {
        return 0;
    }
}
