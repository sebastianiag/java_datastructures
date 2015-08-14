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
public interface Deque {
    public void insertFirst(Object element);
    
    public void insertLast(Object element);
    
    public Object removeFirst();
    
    public Object removeLast();
    
    public Object first();
    
    public Object last();
    
    public int size();
    
    public boolean isEmpty();
}
