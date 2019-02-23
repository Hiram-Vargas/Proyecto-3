
package Vistas;

import java.util.ArrayList;

public class Proceso {
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Vistas p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Vistas p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Vistas obtenerRegistro(int i){
        return (Vistas)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
}
