package com.test.ctrlstmt;

public class Controlstatemmentsnestedswitch {

	public static void main(String[] args) {
char branch ='c';
int collegeYear = 4;
switch (collegeYear)
{
case 1:
System.out.println("english,maths,science");
break;
case 2:
	switch(branch)
	{
	case 'C':
		System.out.println("operating system,java,datastructure");
	break;
	case 'E':
		System.out.println("micro processors,logic,switching theory");
		break;
	case 'M':
		System.out.println("drawings,manufacturing,outlets");
		break;
	}
	break;
	
	case 3:
		switch(branch)
		{
		case 'C':
			System.out.println("computer organisation,multimedia");
			break;
		case 'E':
			System.out.println("fundamentals of logic design,microelectronics");
			break;
		}
	break;
	case 4:
		switch(branch)
		{
		case 'c':
			System.out.println("data communications and system");
			break;
		case'E':
			System.out.println("embedded system,image processing");
			break;
		case'M':
			System.out.println("production technology,thermal engineering");
			break;
			
		}
	    break;
			
	}
}

	}
	

