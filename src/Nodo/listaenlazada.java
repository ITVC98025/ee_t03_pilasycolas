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
public class listaenlazada<T> {
   Nodo inicio;
   int size=0;
   public listaenlazada(){
    inicio = null;
   }
   
 public boolean estavacia(){
 return (inicio==null)?true:false;
 }
   
 /**
  * agrega un elemento al inicio de la lista
  * @param dato el valor que va a tener nuestro nodo
  */
 
 public void agregar_inicio(T dato){
  if(inicio == null){
      inicio=new Nodo(dato);
  }
  else{
    Nodo temp = inicio;
    Nodo nuevo=new Nodo(dato);
    nuevo.setSiguiente(temp);
    inicio=nuevo;
  }
  size++;
 }
  public int size(){
  return size;
  }
 /**
  * el metodo muestra el elemento que se requiere de la lista
  * @param index posicion del elemento que quiero obtener
  * @return el elemento seleccionado
  */ 
 public T obtener(int index){
  int contador=0;
  Nodo temporal=inicio;
  while(contador<index){
   temporal=temporal.getSiguiente();
   contador++;
  }
  return (T) temporal.getDato();
 }
 
 /**
  * este metodo elimina el primero(ultimo dato ingresado)de la lista
  */
 public void eliminarprimero(){
 inicio=inicio.getSiguiente();
 size--;
 
 }
 
 /**
  * este metodo elimina un elemento en la posicion dada
  */
 public void eliminar(int index){
 if(index==0){
   inicio=inicio.getSiguiente();
 }
 else{
    int contador=0;
    Nodo aux=inicio;
    while(contador<index-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 size--;
 }
 
 /**
  * metodo donde elimina el ultimo elemento de la lista
  */
 public void eliminarultimo(){
 int contador=0;
 Nodo aux=inicio;
 while(contador<size-2){
  aux=aux.getSiguiente();
  contador++;
 }
 aux.setSiguiente(null);
 size--;
 }

 /**
  * metodo que recorre e imprime todos los elementos de la lista
  */
 public void recorrer(){
 int cont =0;
 Nodo aux=inicio;
   while(cont<size){
     System.out.print(aux.getDato()+"-->");
     aux=aux.getSiguiente();
     cont++;
   }
 }

}
