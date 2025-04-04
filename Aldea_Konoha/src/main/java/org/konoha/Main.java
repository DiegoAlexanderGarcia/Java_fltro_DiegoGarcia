package org.konoha;

import org.konoha.controller.NinjaController;
import org.konoha.controller.MisionController;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        NinjaController ninjaController = new NinjaController();
        MisionController misionController = new MisionController();

        while (true) {
            System.out.println("\n🌟 Aldea Ninja de Konoha - Sistema de Gestión 🌟");
            System.out.println("1. Listar Ninjas");
            System.out.println("2. Ver habilidades de un Ninja");
            System.out.println("3. Ver misiones disponibles para un Ninja");
            System.out.println("4. Ver misiones completadas de un Ninja");
            System.out.println("5. Asignar misión a un Ninja");
            System.out.println("6. Marcar misión como completada");
            System.out.println("7. Consultar misiones completadas desde archivo");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    ninjaController.NinjaView();
                    break;
                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 0:

            }
        }
    }
}
