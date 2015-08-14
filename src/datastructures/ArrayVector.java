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
public class ArrayVector implements Vector {
    private int capacity = 20;
    private int size = 0;
    private Object A[];
    
    public ArrayVector(){
        A = new Object[capacity];
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size==0); 
    }

    @Override
    public Object elemAtRank(int r) {
        if(isEmpty() || !checkRank(r, size())){
            //error
            return null;
        }
        return A[r];
    }

    @Override
    public Object replaceAtRank(int r, Object e) {
        if(isEmpty() || !checkRank(r, size)){
            //error
            return null;
        }
        Object temp = A[r];
        A[r] = e;
        return temp;
    }

    @Override
    public void insertAtRank(int r, Object e) {
        if(!checkRank(r, size()+1)){
            capacity *= 2;
            Object temp[] = new Object[capacity];
            for(int i = 0; i< size; i++){
                temp[i] = A[i];
            }
            A = temp;
        }
        
        for(int i = size-1; i>=r; i--){
            A[i+1] = A[i];
        }
        A[r]= e;
        size++;
    }

    @Override
    public Object removeAtRank(int r) {
        if(isEmpty() || !checkRank(r, size)){
            //error
            return null;
        }
        Object result = A[r];
        for(int i = r; i < size -1; i++){
            A[i] = A[i+1];
        }
        size--;
        return result;
    }
    
    public boolean checkRank(int r, int n){
        return (r>=0 && r<n);
    }
}
