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
public class DLNode extends Node {
    protected Node previous;
    
    public DLNode(Object element, Node next, Node prev){
        super(element, next);
        previous = prev;
    }
    
    public DLNode(){
        this(null, null, null);
    }
    
    public void setPrevious(Node prev){
        previous = prev;
    }
    
    public Node getPrevious(){
        return previous;
    }
}
