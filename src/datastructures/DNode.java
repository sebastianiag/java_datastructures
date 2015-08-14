/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author sen
 */
public class DNode implements Position {
    private Object element;
    private DNode prev, next;
    
    public DNode(DNode newPrev, DNode newNext, Object elem){
        prev = newPrev;
        next = newNext;
        element = elem;
    }
    
    public DNode(){
        this(null, null, null);
    }
       
    @Override
    public Object element() {
        if((prev == null) && (next == null)){
            // error, position is not in a list.
            return null;
        }
        return element;
    }
    
    public DNode getNext(){
        return next;
    }
    
    public DNode getPrevious(){
        return prev;
    }
    
    public void setNext(DNode newNext){
        next = newNext;
    }
    
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }
    
    public void setElement(Object newElement){
        element = newElement;
    }
}
