package com.materials.stringsamples;

public class StringEquals {

	public static void main(String[] args) {
		String name="manoj";
		String temp="manoj";
		System.out.println("String Equals method "+ name.equals("manoj"));
		//String with comparison operator
		System.out.println("String with Comparison Operator ");
		System.out.println( name == "manoj");
		System.out.println( name == temp);
		
		String word=new String("word");
		String wordCopy=word;
		System.out.println("String with Comparison");
		System.out.println(word == wordCopy);
		System.out.println("String Equals method "+word.equals(wordCopy));
		
		String newWord=new String("newWord");
		String newWordCopy=new String("newWord");
		System.out.println("String Equals with Two Objects ");
		System.out.println(newWord == newWordCopy);
		System.out.println(newWord.equals(newWordCopy));
	}

}
