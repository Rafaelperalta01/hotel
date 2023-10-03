/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoADatos.Conexion;
import accesoADatos.HuespedData;
import entidades.Huesped;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo 320
 */
public class Main {
    public static void main(String[] args) {
        Connection con=Conexion.getConexion();
     Huesped reserva1 = new Huesped(4,"Roberto","Perez",26974345,"Libertador 432","glopez@gmail.com","113445224564",true);
     HuespedData data = new HuespedData();
     
    // data.guardarHuesped(reserva1);
    
     //data.modificarHuesped(reserva1);
//     Huesped encontrado = data.buscarHuespedPorDni(26974345);
//
//     if (encontrado != null){
//         System.out.println("Apellido : "+encontrado.getApellido()+" Nombre: " + encontrado.getNombre());
//     }
//     
     
     for (Huesped huesp:data.listarHuesped()){
         System.out.println(huesp.getApellido());
         System.out.println("");
     }
     
     

        
    }
}
