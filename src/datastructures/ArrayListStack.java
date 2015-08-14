/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;

/**
 *
 * @author sen
 */
public class ArrayListStack implements Stack {
    
    ArrayList<Object> S = new ArrayList<>();
    
    @Override
    public int size() {
        return S.size();
    }

    @Override
    public boolean isEmpty() {
        return (S.isEmpty());
    }

    @Override
    public Object top() {
        return S.get(S.size()-1);
    }

    @Override
    public void push(Object value) {
        S.add(value);
    }

    @Override
    public Object pop() {
        if(S.isEmpty()){
            //error
            return null;
        }
        Object element = S.get(S.size()-1);
        S.remove(S.size()-1);
        return element;
    }
}
