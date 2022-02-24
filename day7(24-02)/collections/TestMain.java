package corejavasamples.collections;

import java.util.Scanner;
import java.util.Stack;

public class TestMain {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a element");
	int num=scan.nextInt();
	Node n1=new Node(""+num);
	System.out.println("Enter a element");
	 num=scan.nextInt();
	 Node n2=new Node(""+num);
	 n1.setNextNode(n2);
	
	 
}
}
