package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @author Ashley
 * @version 2.0
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is null");
        }
	    Random gen = new Random();
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			int randIndex = gen.nextInt(chars.length);
			char holder = chars[i];
			chars[i] = chars[randIndex];
			chars[randIndex] = holder;
		}
		String newString = new String(chars);
		return newString;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
