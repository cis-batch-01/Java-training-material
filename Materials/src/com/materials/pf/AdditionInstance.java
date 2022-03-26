package com.materials.pf;

public class AdditionInstance {

	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public static void main(String[] args) {
		System.out.println("Addition with Instance Method");
		int num1=5,num2=25;
		AdditionInstance additionObj=new AdditionInstance();
		int result=additionObj.add(num1, num2);
		System.out.println("Result is: "+result);
	}

}
