package administracion.app_mascotas;

import administracion.app_mascotas.mascotas.*;
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

    public static void main(String[] args) {

        ArrayList<Mascota> mascotas = new ArrayList<>();
        AdministracionMascota admin = new AdministracionMascota(mascotas);

        // Crear mascotas
        Perro perro = new Perro("Toby", "Juan", 2);
        Gato gato = new Gato("Michi", "Ana", 3);
        Pez pez = new Pez("Nemo", "Pedro", 2);
        Pajaro pajaro = new Pajaro("Piolin", "Lucia", 2, true, "kirk iriki");

        // Dar de alta
        admin.darDeAlta(perro);
        admin.darDeAlta(gato);
        admin.darDeAlta(pez);
        admin.darDeAlta(pajaro);

        // Mostrar mascotas
        for (Mascota m : admin.getMascotas()) {
            System.out.println(m.getNombre() + " - " + m.tipo());
        }

        // Saludar
        System.out.println(admin.saludarMenu("Juan", "Toby"));
        System.out.println(admin.saludarMenu("Ana", "Michi"));
        System.out.println(admin.saludarMenu("Ana", "Michi"));
        System.out.println(admin.saludarMenu("Lucia", "Piolin"));

        // Alimentar
        gato.alimentar();
        System.out.println("Alegria de Michi: " + gato.getAlegria());

        // Modificar
        Gato gatoNuevo = new Gato("Garfield", "Ana", 4);
        admin.modificar(gatoNuevo, gato);

        System.out.println("Mascota modificada: "
                + admin.getMascotas().get(1).getNombre());

        // Eliminar
        admin.eliminar(perro);

        System.out.println("Cantidad de mascotas: "
                + admin.getMascotas().size());

        // Probar pez muerto
        pez.setVida(0);
        admin.animalesMuertos();

        System.out.println("Cantidad después de eliminar muertos: "
                + admin.getMascotas().size());
    }
}
