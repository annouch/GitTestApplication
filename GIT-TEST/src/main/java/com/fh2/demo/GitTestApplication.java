package com.fh2.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication implements CommandLineRunner{
	
	public static String[] uniqueNames(String[] names1, String[] names2) {
          
        Set<String> result = new HashSet<>(Arrays.asList(names1));
        result.addAll(Arrays.asList(names2));
		return result.toArray(new String[0]);
    }

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is a just a test !!");
		
		
		
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	}

}
