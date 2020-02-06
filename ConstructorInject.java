package com.cogni.amir;

public class ConstructorInject {
 private String name1=null;
 private int roll;
public ConstructorInject(String name1, int roll) {
	this.name1 = name1;
	this.roll = roll;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
 
 
}
