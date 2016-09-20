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
    /**
     * pruebas para clase lista
     */
    //listaenlazada lista=new listaenlazada();
    //System.out.println("esta vacia: "+lista.estavacia());
   //lista.agregar_inicio(3);
   //lista.agregar_inicio(5);
   //lista.agregar_inicio(1);
   //lista.agregar_inicio(7);
   //lista.eliminarprimero();
   //lista.eliminar(2);
   //lista.eliminarultimo();
   //lista.recorrer();
   //System.out.println();
   //System.out.println("primero: "+lista.obtener(0));
   //System.out.println("posicion 2: "+lista.obtener(2));
   //System.out.println("ultimo: "+lista.obtener(lista.size()-1));
   //System.out.println("tamaño: "+lista.size());
   
   /**
    * pruebas para clase pila
    */
   //pila pilita=new pila();
   //pilita.push(3);
   //pilita.push(4);
   //pilita.push(5);
   //pilita.push(9);
   //pilita.pick();
   //pilita.poop();
   //pilita.pick();
   //pilita.recorrer();
   
   cola colita=new cola();
   colita.agregar(2);
   colita.agregar(8);
   colita.agregar(5);
   colita.agregar(12);
   colita.agregar(0);
   colita.agregar(3);
   colita.eliminar();
   colita.eliminar();
   colita.recorrer();
    }
}
