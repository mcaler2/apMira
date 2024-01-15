/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author m.caler
 */

public class DatosCompartidos {
    private List<String> datos = new ArrayList<>();

    public void agregarDato(String dato) {
        datos.add(dato);
    }

    public List<String> obtenerDatos() {
        return datos;
    }
}