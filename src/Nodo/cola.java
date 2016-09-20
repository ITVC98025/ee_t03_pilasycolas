/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

/**
 *
 * @author alejandro
 */
public class cola<T> {
    listaenlazada C=new listaenlazada();
    
    public void agregar(T dato){
     C.agregar_inicio(dato);
    }
    
    public void eliminar(){
    C.eliminarultimo();
    }
    
    public void recorrer(){
   C.recorrer();
   }
    
}
