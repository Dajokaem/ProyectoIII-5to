/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author jos56
 */
public class ListaEnlazada {
    public lNodo cabeza;
    
    public class lNodo{
        public double iValor;
        public String sValor;
        public lNodo next;
        public lNodo(){
            this.next  = null;
        }

        public lNodo(double iValor, String sValor) {
            this.iValor = iValor;
            this.sValor = sValor;
            this.next = null;
        }
        
    }
    public ListaEnlazada(){
        this.cabeza = null;
    }
    
    public void Agregar(lNodo obj){
        if(this.cabeza == null){
            this.cabeza = obj;
            this.cabeza.next = null;
        }else{
            lNodo temp = cabeza;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = obj;
            
        }
    }
    
}
