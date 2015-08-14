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
public interface Vector {
    public int size();
    
    public boolean isEmpty();
    
    public Object elemAtRank(int r);
    
    public Object replaceAtRank(int r, Object e);
    
    public void insertAtRank(int r, Object e);
    
    public Object removeAtRank(int r);
}
