package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PizzaOrderSystem {
    private static List<String> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema de Gestión de Pedidos de Pizza en Línea");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea nueva

            switch (option) {
                case 1:
                    realizarPedido();
                    break;
                case 2:
                    listarPedidos();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private static void realizarPedido() {
        System.out.print("Introduzca  el nombre de la pizza que desea pedir: ");
        String pizzaName = scanner.nextLine();
        System.out.print("Ingrese el dinero en función del tamaño que quiera: 8€ Pequeña / 10€ Mediana / 12€ Grande ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        int deliveryTime = 20 + random.nextInt(21); // Generar un tiempo de entrega entre 20 y 40 minutos
        String orderDetails = String.format("Pizza: %s, Precio: %.2f, Tiempo de entrega estimado: %d minutos", pizzaName, price, deliveryTime);

        orders.add(orderDetails);
        System.out.println("Pedido realizado con éxito: " + orderDetails);
    }

    private static void listarPedidos() {
        if (orders.isEmpty()) {
            System.out.println("No hay pedidos realizados.");
        } else {
            System.out.println("Pedidos:");
            orders.forEach(System.out::println);
        }
    }
}
