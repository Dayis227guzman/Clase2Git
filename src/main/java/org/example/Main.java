package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String,String> credenciales = new HashMap<>();
        credenciales.put("standard_user","secret_sauce");
        credenciales.put("locked_out_user", "secret_sauce");
         Carrito carrito = new Carrito() ;
         try{
             carrito.agregar(new Producto("mazda",19000));
             carrito.agregar(new Producto("renault",1000.09));
             carrito.agregar(null);
         }
         catch (IllegalArgumentException e){
             System.out.println("error de alejandro: "+e.getMessage() );
         }
         finally {
             System.out.println("Total:" +carrito.total());
         }
        for (Map.Entry<String,String> credencial : credenciales.entrySet()
             ) {
            System.out.println(credencial.getKey()+" ->" + credencial.getValue());

        }
    }
}
