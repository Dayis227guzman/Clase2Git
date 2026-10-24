package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private final List<Producto> productos = new ArrayList<>();

    public void agregar(Producto carros){
        if (carros==null){
        throw new IllegalArgumentException("el producto nopuede ser nulo");
        }
        productos.add(carros);

    }
    public double total(){
        double suma=0;
        for (Producto carrosDaya:productos
             ) {
            suma += carrosDaya.getPrecio();

        }
        return suma;
    }
     public  int cantidad(){
        return productos.size();
     }

     public double aplicarDescuesto(){
        //este es la rama que va a subir alejandro
     }
}
