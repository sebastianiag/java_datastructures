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
public class NodeList implements List {
    protected int numElems;
    protected DNode head, tail;
    
    public NodeList(){
        numElems = 0;
        head = new DNode(null, null, null);
        tail = new DNode(head, null, null);
        head.setNext(tail);
    }
    
    protected DNode checkPosition(Position p){
        if(p == null){
            // error null position.
            return null;
        }
        
        if(p==head){
            //error head is not a valid position
            return null;
        }
        
        if(p==tail){
            //error tail is not a valid position
            return null;
        }
        
        DNode temp = (DNode) p;
        if(temp.getNext() == null || temp.getPrevious()== null){
            //error does not belong to a list;
            return null;
        }
        return temp;
     
    }
    @Override
    public int size() {
        return numElems;
    }

    @Override
    public boolean isEmpty() {
        return (numElems == 0);
    }

    @Override
    public Position first() {
        if(isEmpty()){
            //error
            return null;
        }
        return head.getNext();
    }

    @Override
    public Position last() {
        if(isEmpty()){
            //error
            return null;
        }
        return tail.getNext();
    }

    @Override
    public Position next(Position p) {
        DNode v = checkPosition(p);
        DNode next = v.getNext();
        if(next == tail){
            //error, off the boundary
            return null;
        }
        return next;
    }

    @Override
    public Position previous(Position p) {
        DNode v = checkPosition(p);
        DNode prev = v.getPrevious();
        if(prev == head){
            //error, off the boundary
            return null;
        }
        return prev;
    }

    @Override
    public Position insertFirst(Object element) {
        numElems++;
        DNode newNode = new DNode(head, head.getNext(), element);
        head.getNext().setPrev(newNode);
        head.setNext(newNode);
        return newNode;
    }

    @Override
    public Position insertLast(Object element) {
        numElems++;
        DNode newNode = new DNode(tail.getPrevious(), tail, element);
        tail.getPrevious().setNext(newNode);
        tail.setPrev(newNode);
        return newNode;     
    }
    

    @Override
    public Position insertBefore(Position p, Object element) {
        numElems++;
        DNode v = checkPosition(p);
        DNode newNode = new DNode(v.getPrevious(), v, element);
        v.getPrevious().setNext(newNode);
        v.setPrev(newNode);
        return newNode;
    }

    @Override
    public Position insertAfter(Position p, Object element) {
        numElems++;
        DNode v = checkPosition(p);
        DNode newNode = new DNode(v, v.getNext(), element);
        v.getNext().setPrev(newNode);
        v.setNext(newNode);
        return newNode;
    }

    @Override
    public Object remove(Position p) {
        DNode v = checkPosition(p);
        DNode pr = v.getPrevious();
        DNode n = v.getNext();
        pr.setNext(n);
        n.setPrev(pr);
        Object result = v.element();
        v.setNext(null);
        v.setPrev(null);
        v.setElement(null);
        numElems--;
        return result;
    }

    @Override
    public Object replace(Position p, Object element) {
        DNode v =  checkPosition(p);
        Object oldElement = v.element();
        v.setElement(element);
        return oldElement;
    }
    
}
