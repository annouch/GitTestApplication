package com.fh2.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication implements CommandLineRunner{
	
	public static int countNumbers(int[] sortedArray, int lessThan) {
		int count =0;
		if (sortedArray==null || lessThan<=0) {
			return 0;
		}
		for (int i = 0; i < sortedArray.length; i++) {
			if(sortedArray[i] < 4) {
				count=count+1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is a just a test !!");
        System.out.println(countNumbers(new int[] { 1, 3, 3, 7 }, 4));

		
		
	}
	
	

    

}

 
