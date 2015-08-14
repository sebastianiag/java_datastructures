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
public class ArrayQueue implements Queue {
    public static final int max_capacity = 1000;
    protected int capacity;
    protected Object S[];
    protected int front = 0;
    protected int rear = 0;
    
    public ArrayQueue(int cap){
        capacity = cap;
        S = new Object[capacity];
    }
    
    public ArrayQueue(){
        this(max_capacity);
    }
    
    public void enqueue(Object obj){
        if(size() == capacity-1){
            System.out.println("Queue overflow");
            return;
        }
        S[rear] = obj;  
        rear = (rear + 1)%capacity;
    }
    
    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;     
        }
        
        Object value = S[front];
        S[front] = null;
        front = (front + 1)%capacity;
        return value;
    }
    
    public Object front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return S[front];
    }
    
    public int size(){
        return (capacity - front + rear)%capacity;
    }
    
    public boolean isEmpty(){
        return (front == rear);
    }
}
