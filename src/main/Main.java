/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accesoADatos.Conexion;
import accesoADatos.HabitacionData;
import accesoADatos.HuespedData;
import accesoADatos.ProductoServicioData;
import accesoADatos.ReservaData;
import accesoADatos.TipoHabitacionData;
import accesoADatos.UsuariosData;
import entidades.Consumo;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.ProductoServicio;
import entidades.Reserva;
import entidades.TipoHabitacion;
import entidades.Usuarios;
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
        
        ///////////////////////////////////PRUEBAS HUESPED DATA///////////////////////////////////
        
//     Huesped reserva1 = new Huesped(1,"Robertoooooo","Perez",26974345,"Libertador 432","glopez@gmail.com","113445224564",true);
//     HuespedData data = new HuespedData();
//     
    // data.guardarHuesped(reserva1);
    
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
//      
     //  TipoHabitacion simple1=new TipoHabitacion(8,"estandar Triple",7, 7, "simple", 230,true);
//            TipoHabitacion simple=new TipoHabitacion("DOBLE",2, 1, "QUEEN", 10000,true);// sin id, objeto para guardar tiponuevo
//        TipoHabitacionData tipoData=new TipoHabitacionData();
//       tipoData.guardarTipoHabitacion(simple1);
     //   tipoData.modificarTipoDeHabitacion(doble);
    //    tipoData.modificarPrecioTipoDeHabitacion(doble);
  //  tipoData.eliminarTipoHabitacion(8);
    
     //   TipoHabitacion buscado=tipoData.buscarTipoHabPorId(1);
           
//        if(buscado!=null){
//            System.out.println("Tipo de cama: "+ buscado.getTipoCama());
//        }
 //TipoHabitacionData habiData = new TipoHabitacionData();
   //     for(TipoHabitacion tipo:habiData.listarTipoHabitacion()){               //se listan los estado 0 y los 1...ver si ponemos la condicion en la sentencia sql
    //              System.out.println(tipo);
      //  }
    
   // habiData.guardarTipoHabitacion(simple1);
    
//    TipoHabitacion una = new TipoHabitacion();
//    TipoHabitacionData habiData = new TipoHabitacionData();
//    una = habiData.buscarTipoHabPorId(2);
//  
//    HabitacionData data = new HabitacionData();
////    Habitacion hab = new Habitacion(una,4,10,true);
////    data.guardarHabitacion(hab);
//    data.Alta_o_Baja_Habitacion(20, true);
    
    


        //***************************prueba UsuariosData**********************************
        //UsuariosData as = new UsuariosData();
        //Usuarios a = new Usuarios();
    
        //****metodo ObtenerUsuarioPorDni****
        /*a = as.obtenerUsuarioPorDni(45123619);
        System.out.println(a);*/
    
        //****metodo obtenerUsuarioPorId****
        /*a = as.obtenerUsuarioId(1);
        System.out.println(a);*/
    
        //****metodo crearUsuario****
        /*Usuarios user1 = new Usuarios("Ramiro","Diaz",45233560,"Masculino","Cuba 345","Admin",true,"hotel123");
        as.crearUsuario(user1);*/
    
        //****metodo ModificarUsuario****
        //Usuarios user1 = new Usuarios("Ramiro","Diaz",45233560,"Masculino","Cuba 345","Admin",true,"hotel123");
        //as.modificarUsuario(user1);
    
        //****metodo EliminarUsuarioPorDni****
        //as.eliminarUsuarioPorDni(45233560);
    
    
        //****Metodo ListarUsuarios(TODOS)****
        /*for(Usuarios users:as.listarUsuarios()){
            System.out.println("nombre: "+users.getNombre());
        }*/
    
        //****Metodo ListarAdministradores****
        /*for(Usuarios users:as.ListarAdninistradores()){
            System.out.println("nombre: "+users.getNombre());
        }*/
    
        //****Metodo ListarRecepcionistas****
        /*for(Usuarios users:as.ListarRecepcionistas()){
            System.out.println("nombre: "+users.getNombre());
        }*/
        //comentario  

        //***********************pruebas ReservasData******************************
        /*     HuespedData idHuesped = new HuespedData();
        Huesped x = idHuesped.buscarHuespedPorDni(29123456);
        
        TipoHabitacionData idata = new TipoHabitacionData();
        TipoHabitacion habit = idata.buscarTipoHabPorId(1);

        HabitacionData numHab = new HabitacionData();
        Habitacion vacia = numHab.buscarHabitacion(10);
        
        double precio = vacia.getIdTipoHabitacion().getPrecio();
        int cantpersonas = vacia.getIdTipoHabitacion().getCantPersonas();
        UsuariosData recepcion1 = new UsuariosData();
        
        Usuarios pepe = recepcion1.obtenerUsuarioPorDni(24555443);

        LocalDate entrada = LocalDate.now();
        LocalDate salida = LocalDate.now().plusDays(15);
        
        Reserva nueva = new Reserva(vacia, x, pepe, entrada, salida,precio, cantpersonas, true);
//public Reserva(int idReserva, Habitacion idHabitacion, Huesped idHuesped,Usuarios idUsuarios, 

        ReservaData aux = new ReservaData();
      //  aux.crearReserva(nueva);
//              aux.cancelarReserva(7);
//
//        Reserva n = aux.buscarReservaPorHuesped(2);
//        
//       
        for (Reserva res:aux.listarReserva()){
        System.out.println(res);//falta hacer buscar reserva
        }*/

    
    //*********************prueba ProductoServicioData****************************
    
    ProductoServicioData producto = new ProductoServicioData();
    ProductoServicio p = new ProductoServicio("Producto","Chocolate","Chocolate negro 50gr",10000,5);
    producto.guardarProductoServicio(p);
    
    
    }
    
}


