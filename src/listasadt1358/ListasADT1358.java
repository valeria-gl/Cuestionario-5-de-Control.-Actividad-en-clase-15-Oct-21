/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ListasADT1358 {
    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("José"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos del tipo Empleado
        lsl2.append(new Empleado(1, "José", "Pérez", "García", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Diego", "Pérez", "Hernández", 1950.5f, 2017, 5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla", "García", 2850.5f, 2010, 7));
        lsl2.append(new Empleado(1, "Daniela", "Casillas", "López", 3850.5f, 2019, 8));
        
        lsl2.transversal();
        
        ArrayList lista = new ArrayList();
        lista.add(new Empleado(1, "José", "Pérez", "García", 1850.5f, 2015, 4));
        lista.add(new Empleado(1, "Daniela", "Casillas", "López", 3850.5f, 2019, 8));
        
        Object x = lista.get(0);
        System.out.println(((Empleado)x).getNombre());
        
        //Genéricos
        ArrayList<Empleado> lista2 = new ArrayList<Empleado>();
        lista2.add(new Empleado(1, "José", "Pérez", "García", 1850.5f, 2015, 4));
        lista2.add(new Empleado(1, "Daniela", "Casillas", "López", 3850.5f, 2019, 8));
        
        for (Empleado empleado : lista2) {
            System.out.println(empleado.getNombre());
        }
    }
    
}
