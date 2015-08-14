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
public class ArrayRBStack implements RBStack {
    private static final int max_capacity = 1000;
    private int red_capacity;
    private int blue_capacity;
    private int red_top;
    private int blue_top;
    private Object S[];
    
    public ArrayRBStack(int cap){
        red_capacity = cap/2;
        blue_capacity = (cap%2 == 0) ? cap/2 : cap/2 + 1;
        red_top = 0;
        blue_top = red_capacity;
        S = new Object[cap];
    }
    
    public ArrayRBStack(){
        this(max_capacity);
    }

    @Override
    public void redPush(Object element) {
        if(red_top == red_capacity){
            //error
            return;
        }
        else{
         S[++red_top] = element;
         return;
        }
    }

    @Override
    public void bluePush(Object element) {
        if(blue_top == blue_capacity){
            //error
            return;
        }
        else{
            S[++blue_top] = element;
        }
    }

    @Override
    public Object redPop() {
        if(isRedEmpty()){
            //error
            return null;
        }
        else{
            return S[red_top--];
        }
    }

    @Override
    public Object bluePop() {
        if(isBlueEmpty()){
            //error
            return null;
        }
        else{
            return S[blue_top--];
        }
    }

    @Override
    public int redSize() {
        return (red_top+1);
    }

    @Override
    public int blueSize() {
        return (blue_top-red_capacity);
    }

    @Override
    public boolean isRedEmpty() {
        return (red_top<0);
    }

    @Override
    public boolean isBlueEmpty() {
        return (blue_top < red_capacity);
    }

    @Override
    public Object redFront() {
        if(isRedEmpty()){
            //error
            return null;
        }
        else{
            return S[red_top];
        }
    }

    @Override
    public Object blueFront() {
         if(isBlueEmpty()){
            //error
            return null;
        }
        else{
            return S[blue_top];
        }
    } 
}
