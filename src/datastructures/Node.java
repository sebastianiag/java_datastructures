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
public class Node {
    private Object element;
    private Node next;
    
    public Node(Object elem, Node n){
        element = elem;
        next = n;
    }
    public Node(){
        this(null, null);
    }
    
    public Object getElement(){
        return element;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setElement(Object elem){
        element = elem;
    }
    
    public void setNext(Node n){
        next = n;
    }
}
