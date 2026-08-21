package administracion.app_mascotas;

import administracion.app_mascotas.mascotas.Mascota;
import plataformas.recetas_cocina.platos.Plato;

import java.util.ArrayList;

public class AdministracionMascota {
    private ArrayList<Mascota> mascotas;

    public AdministracionMascota(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void darDeAlta(Mascota m){
        mascotas.add(m);
    }

    public void eliminar(Mascota m){
        mascotas.remove(m);
    }

    public void modificar(Mascota m1, Mascota m2){
        int index = mascotas.indexOf(m2);
        mascotas.set(index, m1);
    }

    public String saludarMenu(String nombreU, String nombreM){
        String text = "nada";

        for(Mascota m : mascotas){
            if(m.getNombre().equals(nombreM)){
                text = m.saludarUsuario(nombreU, nombreM);
            }
        }
        return text;
    }

    public void animalesMuertos(){
        for(int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).debeEliminarse()) {
                mascotas.remove(i);
                i--;
            }
        }
    }
}
