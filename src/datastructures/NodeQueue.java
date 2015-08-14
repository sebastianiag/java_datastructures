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
public class NodeQueue implements Queue {
    protected Node head;
    protected Node tail;
    protected int size;
    
    public NodeQueue(){
        head = tail = new Node(null, null);
        size = 0;
    }
    
    @Override
    public void enqueue(Object obj) {
        Node newNode = new Node(obj, null);
        if(size == 0){
            head = newNode;
            head.setNext(tail);
            size++;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
        
    }

    @Override
    public Object dequeue() {
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = head.getElement();
        head = head.getNext();
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public Object front() {
        if (size == 0){
            System.out.println("queue empty");
            return null;
        }
        return head.getElement();
    }
     
}
