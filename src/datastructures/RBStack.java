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
public interface RBStack {

    public void redPush(Object element);
    
    public void bluePush(Object element);
    
    public Object redPop();
    
    public Object bluePop();
    
    public int redSize();
    
    public int blueSize();
    
    public boolean isRedEmpty();
    
    public boolean isBlueEmpty();
    
    public Object redFront();
    
    public Object blueFront();
}
