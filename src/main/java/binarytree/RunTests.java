/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

/**
 *
 * @author Vihan De Silva
 */
public class RunTests {

    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(BinaryTreeTest.class);
    }

}
