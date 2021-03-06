/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cassandra;

import model.Empleado;
import ocutilidades.EntradaDatos;

/**
 *
 * @author Alberto
 */
public class MetodosVista {

    public static MetodosVista metodosVista;

    public static MetodosVista getInstance() {
        if (metodosVista == null) {
            metodosVista = new MetodosVista();
        }
        return metodosVista;
    }

    public int MostrarMenu(Empleado empleado) {
        if (empleado == null) {
            System.out.println("1.Iniciar Sesión");
        } else {
            //todos pueden ver
            System.out.println("2.Editar perfil");
            System.out.println("3.Mostrar Incidencias");
            System.out.println("4.Borrar Incidencia");
            System.out.println("5.Editar Incidencia");
            if (empleado.getNusuario().equals("amanzano")) {
                //cosas admin
                System.out.println("6.Crear empleado");
                System.out.println("7.Borrar empleado");
                System.out.println("8.Ranking");
                System.out.println("9.Ultimo login");
            }
        }
        System.out.println("0.Salir");
        int indice = EntradaDatos.pedirEntero("");
        return indice;
    }
}
