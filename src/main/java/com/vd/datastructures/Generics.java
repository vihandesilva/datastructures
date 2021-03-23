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
public class Generics {
    
   class Student implements Comparable{
       private double gpa;

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
       
       
        @Override
        public int compareTo(Object o) {
           return 0;
        }
       
   }
}
