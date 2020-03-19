package com.fh2.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication implements CommandLineRunner{
	
	public static int procheZero(int[] list) {
		int valeurMin = list[0];
		for(int i=1; i<list.length; i++) {
		   if( list[i]<valeurMin) {
		          valeurMin=list[i];
		   }
	}
		return valeurMin;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is a just a test !!");
        System.out.println(procheZero(new int[] { 1, 3, -8, -17 }));

		
		
	}
	
	

    

}

 
