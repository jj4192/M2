package edu.gatech.oad.antlab.person;

import java.lang.StringBuilder;
import java.util.Collections;
import java.util.ArrayList;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob
 * @version 1.1
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
      //Person 2 put your implementation here
      char[] characterArray = input.toCharArray();
      ArrayList<Character> characterList = new ArrayList<Character>();
      for (char current : characterArray)
      	characterList.add(current);
      Collections.shuffle(characterList);
      StringBuilder builder = new StringBuilder(characterList.size());
      for(Character ch : characterList)
      {
        builder.append(ch);
      }
    return builder.toString();
      // return Collections.shuffle(input.toCharArray());
      // return "Fix needed";
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
