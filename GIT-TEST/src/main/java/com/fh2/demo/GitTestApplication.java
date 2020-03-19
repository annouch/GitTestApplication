package com.fh2.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication implements CommandLineRunner{
	


	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is a just a test !!");
		
		Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(BinarySearchTree.contains(n3, 3));
	}

}

 class BinarySearchTree {
    public static boolean contains(Node root, int value) {
    	
    	  if (root==null) {
    		  return false ;
    	  }
    	  
    	  if (root.value == value)
              return true;
    	  else if (root.value>value) 
    		  return contains(root.left, value) ;
    	  else 
    		  return contains(root.right, value);
			
    }
 }
    
class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}