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
public interface Stack{
    
  public int size();
  
  public boolean isEmpty();
  
  public Object top();
  
  public void push(Object value);
  
  public Object pop();
}
