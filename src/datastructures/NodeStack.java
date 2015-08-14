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
public class NodeStack implements Stack {
    protected Node top;
    protected int size;
    
    public NodeStack(){
        top = null;
        size = 0;
    }
    
    public void push(Object element){
        Node n = new Node(element, top);
        top = n;
        size++;
    }
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        
        Object element = top.getElement();
        top = top.getNext();
        size--;
        return element;
    }
    
    public boolean isEmpty(){
        return (size==0);
    }
    
    public int size(){
        return size;
    }
    
    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return top.getElement();
    }
}
