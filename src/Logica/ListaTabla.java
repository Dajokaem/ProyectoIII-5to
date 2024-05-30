/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author jos56
 */
public class ListaTabla {
    public tNodo inicio;
    
    class tNodo{
        public ListaEnlazada columna;
        public tNodo next;
        public tNodo(){
            this.columna = null;
        }
    }
    public ListaTabla(){
        this.inicio = null;
    }
    public void Agregar(tNodo obj){
        if(this.inicio == null){
            this.inicio = obj;
        }else{
            tNodo temp = this.inicio;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = obj;
        }
    }
}
