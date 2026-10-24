package org.example;

public class Usuario {
    protected  final String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }
    public String describir(){
        return "usuario estandar: " +nombre;
    }
}
class UsuarioBloqueado extends Usuario{

    public UsuarioBloqueado(String nombre) {
        super(nombre);
    }

    @Override
    public String describir(){
        return "Usuario Bloqueado: "+nombre;
    }
}
