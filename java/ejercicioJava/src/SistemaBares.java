import enums.ColorDianas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaBares {
    public static class Sistema {
        private ArrayList<Bar> bares;

        public Sistema(ArrayList<Bar> bares) {
            this.bares = bares;
        }

        public ArrayList<Bar> getBares() {
            return bares;
        }

        public void setBares(ArrayList<Bar> bares) {
            this.bares = bares;
        }

        public Diana dianaConMasPuntajes() {
            Diana mayor = this.bares.getFirst().getDianas().getFirst();
            for (Bar b : this.bares) {
                for (Diana d : b.getDianas()) {
                    if (d.getPuntajeColor().size() > mayor.getPuntajeColor().size()) {
                        mayor = d;
                    }
                }
            }
            return mayor;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, ColorDianas> mapaPuntajes1 = new HashMap<>();
        mapaPuntajes1.put(10, ColorDianas.ROJO);
        mapaPuntajes1.put(50, ColorDianas.ROJO);

        HashMap<Integer, ColorDianas> mapaPuntajes2 = new HashMap<>();
        mapaPuntajes2.put(20, ColorDianas.VERDE);
        mapaPuntajes2.put(40, ColorDianas.AMARILLO);
        mapaPuntajes2.put(100, ColorDianas.NEGRO);

        Diana circular = new DianaCircular("Diana Circular 1", 3, mapaPuntajes1);
        Diana rectangular = new DianaRectangular("Diana Rectangular 1", 5, mapaPuntajes2, 10.5f, 20.0f);
        Diana cuadrada = new DianaCuadrada("Diana Cuadrada 1", 2, mapaPuntajes1, 15.0f);

        ArrayList<Diana> dianasBar1 = new ArrayList<>();
        dianasBar1.add(circular);
        dianasBar1.add(cuadrada);

        ArrayList<Diana> dianasBar2 = new ArrayList<>();
        dianasBar2.add(rectangular);

        HashSet<String> tragos = new HashSet<>();
        tragos.add("Fernet");
        tragos.add("Gancia");
        Beneficio beneficioTrago = new BeneficioTragos("Promo Tragos", "Duenio", tragos);

        HashSet<String> gaseosas = new HashSet<>();
        gaseosas.add("Cola");
        BeneficioGaseosa beneficioGaseosa = new BeneficioGaseosa("Promo Gaseosas", "Manager", gaseosas);

        HashSet<String> comidas = new HashSet<>();
        comidas.add("Papas Fritas");
        BeneficioComidas beneficioComidas = new BeneficioComidas("Promo Papas", "Chef", comidas);

        HashSet<Beneficio> beneficiosBar1 = new HashSet<>();
        beneficiosBar1.add(beneficioTrago);

        HashSet<BeneficioAcumulable> acumulablesBar1 = new HashSet<>();
        acumulablesBar1.add(beneficioGaseosa);
        acumulablesBar1.add(beneficioComidas);

        HashSet<Beneficio> beneficiosBar2 = new HashSet<>();
        HashSet<BeneficioAcumulable> acumulablesBar2 = new HashSet<>();

        Bar bar1 = new Bar(dianasBar1, 50, 150000.0, beneficiosBar1, acumulablesBar1);
        Bar bar2 = new Bar(dianasBar2, 30, 90000.0, beneficiosBar2, acumulablesBar2);

        ArrayList<Bar> listaBares = new ArrayList<>();
        listaBares.add(bar1);
        listaBares.add(bar2);

        Sistema sistema = new Sistema(listaBares);

        Diana masPuntajes = sistema.dianaConMasPuntajes();
        System.out.println("Diana con mas puntajes: " + masPuntajes.getNombre());

        System.out.println("Cantidad de beneficios de tragos en Bar 1: " + bar1.cantBeneficiosTragos());
        System.out.println("Area Diana Circular: " + circular.calcularArea());
        System.out.println("Descuento Extra Comidas: " + beneficioComidas.calcularDescuentoExtra());
    }
}
