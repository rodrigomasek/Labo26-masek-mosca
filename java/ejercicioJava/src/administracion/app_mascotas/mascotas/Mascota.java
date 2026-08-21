package administracion.app_mascotas.mascotas;

import java.util.Locale;

public abstract class Mascota {
    private String nombre;
    private String dueño;
    private int alegria;

    public Mascota(String nombre, String dueño, int alegria) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.alegria = alegria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public abstract String saludo();

    public String saludoMejorado(){
        String text = "";
        for(int i = 0; i < getAlegria(); i++){
            text += saludo() + " ";
        }

        if(getAlegria() > 1){
            setAlegria(getAlegria()-1);
        }

        return text;
    }

    public abstract String tipo();

    public String saludarUsuario(String nombreU, String nombreM){
        if(nombre.equals(nombreM)){
            if(dueño.equals(nombreU)){
                return saludoMejorado();
            }
            return saludoMejorado().toUpperCase();
        }
        return "algo salio mal";
    }

    public void alimentar(){
        alegria++;
    }

    public boolean debeEliminarse(){
        return false;
    }
}
