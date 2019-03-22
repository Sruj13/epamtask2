package com.ebsco.task2;
import java.util.*;
public class Calculator {
	public double add(double a,double b)
	{
		double sum=0;
		sum=a+b;
		return sum;
		
	}
	public double multiply(double a,double b)
	{
		double product=a*b;
		return product;
	}
	public double divide(double a,double b)
	{
		if(b==0)
		{
			return 0;
		}
		double ans=a/b;
		ans=Math.round(ans*100.0)/100.0;
		return ans;
	}

}
