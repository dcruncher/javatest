package com.javatest;

import java.util.HashMap;

public class CalculatorTest {
	static	HashMap<Integer,String> emps=new HashMap<Integer,String>();
	public static int add(int a,int b)
	{
		return a-b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int addTrainer(int empId ,String empName)
	{
		emps.put(empId,empName);
	return	emps.size();//1
	}
	public static String  updateTrainer(int empId ,String empName)
	{
		return emps.put(empId,empName);
	//return	emps.size();//1
	}
	public static String  removeTrainer(int empId)
	{
		String result = emps.remove(empId);
		System.out.println(result);
		return result;
	//return	emps.size();//1
	}
	public static HashMap<Integer,String> fetchAllTrainers()
	{
		return emps;
	//return	emps.size();//1
	}
	
}