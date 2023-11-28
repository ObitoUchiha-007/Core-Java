package com.inheritence;

//super class  
class Student  
{  
int reg_no;  
void getNo(int no)  
{  
reg_no=no;  
}  
void putNo()  
{  
System.out.println("registration number= "+reg_no);  
}  
}  
//intermediate sub class  
class Marks extends Student  
{  
float marks;  
void getMarks(float m)  
{  
marks=m;  
}  
void putMarks()  
{  
System.out.println("marks= "+marks);  
}  
}  
//derived class  
class Sports extends Marks  
{  
float score;  
void getScore(float scr)  
{  
score=scr;  
}  
void putScore()  
{  
System.out.println("score= "+score);  
}  
}  


public class Multilevelinex {

	public static void main(String args[])  
	{  
	Sports ob=new Sports();  
	ob.getNo(1001);  
	ob.putNo();  
	ob.getMarks(90);  
	ob.putMarks();  
	ob.getScore(90);  
	ob.putScore();  
	}  
	}  

