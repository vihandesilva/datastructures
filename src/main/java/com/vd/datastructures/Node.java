/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vd.datastructures;

/**
 *
 * @author Vihan De Silva
 */
public class Node<T> {
    public T item;
    public Node next;
    
    public Node(T i){
        item =i;
    }
    
    public void next(Node n){
        next = n;
    }
    
    public Node next(){
        return next;
    }
    
    public T value(){
        return item;
    }
}
