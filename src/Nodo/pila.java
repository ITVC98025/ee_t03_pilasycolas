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
public class pila<T> {
    
    listaenlazada L=new listaenlazada();
    
   public void push(T dato){
    L.agregar_inicio(dato);
   }
   
   public void poop(){
   L.eliminarprimero();
   }
   
   public void pick(){
    System.out.println("ultimo : "+L.obtener(0));
   }

   public void recorrer(){
   L.recorrer();
   }

}
