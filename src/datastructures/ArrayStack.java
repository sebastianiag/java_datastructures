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
public class ArrayStack implements Stack {
    public static final int max_capacity = 1000;
    
    protected int capacity;
    
    protected Object S[];
    
    protected int top = -1;
    
    public ArrayStack(int cap){
        capacity = cap;
        S = new Object[capacity];       
    }
    
    public ArrayStack(){
        this(max_capacity);
    }
    
    public int size(){
        return (top+1);
    }
    
    public boolean isEmpty(){
        return (top < 0);
    }
    
    public void push(Object obj){
        if (size() == capacity){
            System.out.println("Stack overflow");
            return;
        }
        else{
            S[++top] = obj;
        }
    }
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }   
        
        else{
            Object elem =  S[top];
            S[top--] = null;
            return elem;
        }
    }
    
    public Object top() {
        if(isEmpty()){
            System.out.println("Unable to see top, Stack is empty");
            return null;
        }
        else{
            return S[top];
        }
    }
}
