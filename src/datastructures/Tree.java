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
public interface Tree {
    public int size();
    
    public boolean isEmpty();
    
    public Iterator elements();
    
    public Iterator positions();
    
    public Object replace(Position v, Object e);
    
    public Position root();
    
    public Position parent(Position v);
    
    public Iterator children(Position v);
    
    public boolean isInternal(Position v);
    
    public boolean isExternal(Position v);
    
    public boolean isRoot(Position v);
}
