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
public class main {
    
    
    public static void main(String args[]){
    listaenlazada lista=new listaenlazada();
    System.out.println("esta vacia: "+lista.estavacia());
    
   lista.agregar_inicio(3);
   lista.agregar_inicio(5);
   lista.agregar_inicio(1);
   lista.agregar_inicio(7);
   
   //lista.eliminarprimero();
   //lista.eliminar(2);
   //lista.eliminarultimo();
   lista.recorrer();
   
   System.out.println();
   System.out.println("primero: "+lista.obtener(0));
   //System.out.println("posicion 2: "+lista.obtener(2));
   System.out.println("ultimo: "+lista.obtener(lista.size()-1));
   System.out.println("tamaño: "+lista.size());
            
   }
}
