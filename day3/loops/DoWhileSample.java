package com.technosys.datatypes;

import java.util.Scanner;

public class DoWhileSample {

	public static void main(String[] args) {

		// do { stmts ;}while(condition);
		char star = '*';
		int numer = 0;
		do {
			System.out.print(numer + " ");
			numer++; // miss this incre part infinite loop
		} while (numer < 5);

	}

}
