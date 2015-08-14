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
public interface List {
    public int size();
    
    public boolean isEmpty();
    
    public Position first();
    
    public Position last();
    
    public Position next(Position p);
    
    public Position previous(Position p);
    
    public Position insertFirst(Object element);
    
    public Position insertLast(Object element);
    
    public Position insertBefore(Position p, Object element);
    
    public Position insertAfter(Position p, Object element);
    
    public Object remove(Position p);
    
    public Object replace(Position p, Object element);
}
