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
public class LinkedList<T> {
    private Node head;
    private Node tail;
    
    //--------------------------------------------------
    public LinkedList(){//default constructor
        head = null;//initially the list is empty
        tail = null;
    }
    //--------------------------------------------------
    public boolean isEmpty(){//'true' if the list is empty
        return (head==null);
    }
    //--------------------------------------------------
    public void insertFirst(T t){
        Node newNode = new Node<T>(t);
        newNode.next = head;
        head = newNode;
        if (head.next==null)
            tail = head;
    }
    //--------------------------------------------------
    public void insertLast(T t){
        Node newNode = new Node<T>(t);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{//list is not empty
            tail.next = newNode;
            tail = newNode;
        }
    }
    //--------------------------------------------------
    public Node deleteFirst(){//deletes the first Node
        if (isEmpty()){
            return null;
        }
        else{
            if (head.next==null)
                tail = null;
            Node<T> delNode = head;//delNode is a reference to the head node
            head = head.next;//head is moving to the next node
            return delNode;//return a reference to the deleted node
        }
    }
    //--------------------------------------------------
    public void displayList(){
        if (isEmpty()){
            System.out.println("Empty.");
        }
        else{
            Node<T> curr = head;
            System.out.print("Elements: ");
            while (curr!=null){
                System.out.print(curr.item + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    //--------------------------------------------------
    public Node<T> find(T searchKey){
        Node<T> curr = head;
        while (curr!=null){
            if (curr.item==searchKey)//searchKey is found
                return curr;//returns a references to the node where 'searchKey' found
            curr = curr.next;//'curr' is moving to the next node
        }
        return null;//'searchKey' is not found in the linked list
    }
    //--------------------------------------------------
    public Node<T> delete(T delKey){
        Node<T> curr = head;
        Node<T> prev = null;
        while (curr!=null){
            if (curr.item==delKey){//delKey is found
                if (curr==head){//Node to be deleted is the first node
                    head = head.next;//head is moving to the next node
                    return curr;//return a reference to the deleted node
                }
                else{//Node to be deleted is not the first node
                    prev.next = curr.next;//delete the current node
                    return curr;//return a reference to the deleted node
                }
            }
            prev = curr;//before 'curr' is moving to the next node, 'prev' is moving to the current node
            curr = curr.next;//'curr' is moving to the next node
        }
        return null;//delKey is not found in the list
    }
    //--------------------------------------------------
    public Node<T> getFirst(){//gets a reference to the first node
        return head;
    }
    //--------------------------------------------------
     public Node<T> getLast(){//gets a reference to the last node
        return tail;
    }   
    //--------------------------------------------------
} 

