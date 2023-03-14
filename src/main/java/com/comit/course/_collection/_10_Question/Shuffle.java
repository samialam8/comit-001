package com.comit.course._collection._10_Question;
/*
 * 10. Write a Java program to shuffle elements in a array list. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		List<String> newColors = new ArrayList<String>();
		
		newColors.add("Pink");//0
		newColors.add("Red");//1
		newColors.add("Orange");//2
		newColors.add("Blue");//3
		newColors.add("Black");//4
		
		System.out.println(newColors);
		Collections.shuffle(newColors);
		System.out.println(newColors);
	}

}
