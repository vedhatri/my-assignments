package week1.day1;

import java.util.Iterator;

public class Fibanocci {

	public static void main(String[] args) {
		int a = 11, firstTerm=0,secondTerm=1;
		System.out.println("fibanocci series up to 11 numbers");
		for (int i = 0; i <a; i++) {
			System.out.println(firstTerm);
			
			int nextTerm= firstTerm + secondTerm;
					firstTerm=secondTerm;
					secondTerm=nextTerm;
		}
		

	}

}
