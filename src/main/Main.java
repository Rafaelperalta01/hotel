/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoADatos.Conexion;
import accesoADatos.HuespedData;
import accesoADatos.TipoHabitacionData;
import entidades.Huesped;
import entidades.TipoHabitacion;
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
//     Huesped reserva1 = new Huesped(1,"Robertoooooo","Perez",26974345,"Libertador 432","glopez@gmail.com","113445224564",true);
//     HuespedData data = new HuespedData();
//     ///////////////////////////////////PRUEBAS HUESPED DATA///////////////////////////////////
//    // data.guardarHuesped(reserva1);
//    
//    data.modificarHuesped(reserva1);
//     Huesped encontrado = data.buscarHuespedPorDni(26974345);
//
//     if (encontrado != null){
//         System.out.println("Apellido : "+encontrado.getApellido()+" Nombre: " + encontrado.getNombre());
//     }
//     
     
//     for (Huesped huesp:data.listarHuesped()){
//         System.out.println(huesp.getApellido());
//         System.out.println("");
//     }
     
      ///////////////////////////////////PRUEBAS tipo de habitacion DATA///////////////////////////////////
      
        TipoHabitacion simple1=new TipoHabitacion("estandar simple 1",1, 1, "simple", 10000,true);
         //   TipoHabitacion simple=new TipoHabitacion("DOBLE",2, 1, "QUEEN", 10000,true);// sin id, objeto para guardar tiponuevo
        TipoHabitacionData tipoData=new TipoHabitacionData();
       tipoData.guardarTipoHabitacion(simple1);
     //   tipoData.modificarTipoDeHabitacion(doble);
    //    tipoData.modificarPrecioTipoDeHabitacion(doble);
  //  tipoData.eliminarTipoHabitacion(8);
    
     //   TipoHabitacion buscado=tipoData.buscarTipoHabPorId(1);
           
//        if(buscado!=null){
//            System.out.println("Tipo de cama: "+ buscado.getTipoCama());
//        }

//        for(TipoHabitacion tipo:tipoData.listarTipoHabitacion()){               //se listan los estado 0 y los 1...ver si ponemos la condicion en la sentencia sql
//                  System.out.println("Tipo de cama: "+ tipo.getTipoCama());
//        }
    }
}
