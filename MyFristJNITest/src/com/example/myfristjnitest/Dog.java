package com.example.myfristjnitest;

public class Dog {

	
	
	public native void DogTest();
	public native void DogStringTest();
	public native int DogIntTest();
	public native String LastTest();
	
	public void hellojava(){
		System.out.println("hello world");
	}
	
	public void hellostring(String str) {
		System.out.println(str);
	}
	
	public int helloint(int a,int b){
		return a+b;
	}
	
	public String helloTotal(int x,String str){
		return str+x;
	}
	
}
