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
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
		
	}
	
	public static class TextInput {
		
		protected StringBuilder ch;
		public  void add(char c) {
			this.ch.append(c);
		}
		
		public TextInput() {
			ch=new StringBuilder();
		}
		
		
		public String getValue() {
			
			return this.ch.toString();
		}
	}

    public static class NumericInput extends TextInput{
    	
    	public NumericInput() {
    		super();
    	}
    	
    	@Override
    	public  void add(char c) {
			if(Character.isDigit(c)) {
				this.ch.append(c);
			}
		}
    }

}

 
