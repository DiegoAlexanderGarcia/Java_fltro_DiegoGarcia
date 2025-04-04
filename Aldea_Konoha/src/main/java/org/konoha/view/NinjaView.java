package org.konoha.view;



import org.konoha.model.Ninja;

import java.util.List;

public class NinjaView {


    public void mostrarMenuPrincipal() {
        System.out.println("\nSistema de Gestión de Konoha");
        System.out.println("1. Listar ninjas");
        System.out.println("2. Asignar misión");
        System.out.println("3. Completar misión");
        System.out.println("4. Ver misiones completadas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarNinjas(List<String> ninja) {
        System.out.println("Ninja View");
        System.out.println("-----------------------------");
        for (String n : ninja) {
            System.out.println(n);
        }
    }

    public void mostrarPorRango(List<String> Ninja){
        System.out.println("Ninja Por Rango");
        System.out.println("-----------------------------");
        for (String nin : Ninja){
            System.out.println(nin);
        }
    }
}
