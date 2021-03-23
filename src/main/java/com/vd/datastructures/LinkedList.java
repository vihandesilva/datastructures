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
public class LinkedList {
    private Node head;
    
    public LinkedList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void insertFirst(int i){
        Node newNode = new Node(i);
        newNode.next(head);
        head = newNode;
    }
    
    public Node removeFirst(){
        Node temp = null;
        if(!head.equals(null)){
            temp = head;
            head = head.next();
        }       
        return temp;
    }
    
    public void displayList(){
        Node current = head;   
        
        if(isEmpty()== true){
            System.out.println("The linkedlist is empty");
        }
        
        else{
            while(current != null){
                System.out.println(current.value());
                current = current.next();
            }            
        }

    }
    
    public Node find(int value){
        Node current = head;
        Node temp = null;
        
        while(current != null){
            if(current.value() == value){
                temp = current;
            }
        }
        
        return temp;
    }
    
    public Node delete(int delKey){
        Node cur = head;
        Node prev = null;
        while (cur!=null){
            if (cur.value()==delKey){//delKey is found
                if (cur==head){//Node to be deleted is the first node
                    head = head.next();//head is moving to the next node
                    return cur;//return a reference to the deleted node
                }
                else{//Node to be deleted is not the first node
                    prev.next(cur.next());//delete the current node
                    return cur;//return a reference to the deleted node
                }
            }
            prev = cur;
            cur = cur.next();
        }
        return null;//delKey is not found in the list
    }
    
    
}
