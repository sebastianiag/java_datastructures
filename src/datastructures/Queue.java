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
public interface Queue {
    public void enqueue(Object obj);
    
    public Object dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public Object front();
}
