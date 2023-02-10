/*Bit Manipulation -->binary(01)
//                 -->low state - 0 && High state 1 (current flow)
//1.Git-bit (check Zero OR NON_Zero)
//2.set-bit (1 bana dena )
//3.clear-bit (0 bana dena )
//4.Update-bit (0 - 1 && 1 - 0)

//1.Get-Bit
Get the 3rd bit(Position = 2) of a number n (n=0101)2
Bit Mask : 1<<i            
OPeration : AND     
		    3 2 10              //Bit Mask
		    | | ||
		    0'1'01 = (1)
                    (i)1<<2
		        |
		     0001<<2
		  01'2'3|
		     0100<--ANS
//AND 
		   0100 // AND 
		   0101
		  ------
	           0100 <-- ANS (Non-Zero No)
	 if Non-Zero -> 1
	 if Zero No -> 0	

ex. Get the 3rd bit(Position = 3) of a number n (n=0101)2
Bit Mask : 1<<i
OPeration : AND  
		  0101 = (0)
		    (i)1<<3
		        |
		     0001<<3
		        |
		     1000<--ANS
//AND                
                     1000 
		     0101
		     ----
		     0000 <--ANS (Zero-bit)

*/
/*
import java.util.*;
class Bit_Manipulation 
{
	public static void main(String args[])
	{
		int n = 5; // 0101
		int pos = 3;
		int bitMask = 1<<pos;

		if((bitMask & n) == 0)
		{
			System.out.println("Bit was Zero");
		}
		else
		{
			System.out.println("Bit was Non-Zero");
		}
	}
}

//OUTPUT --> Zero-bit

*/
/*Set-Bit 
Set the 2nd bit(position = 1) of a Numbee n. (n = 0101)
Bit Mask : 1<<i
Operattion : OR
		 32'1'0   //Bit Mask
                 || | |
		 01 0 1
		    |
		 (i)1<<1
		    |
		 0010<--ANS
//OR
                 0010 //OR
		 0101
		 ----
		 0111<--ANS (NON-Zero) --> (7)10
*/
/*
import java.util.*;
class Bit_Manipulation
{
	public static void main(String args[])
	{
		int n = 5;
		int pos = 1;
		int bitMask = 1<<pos;

		int newNumber = bitMask | n; //OR
		System.out.println(newNumber);    
	}
	
}
	
//OUTPUT --> 7
*/
/*3.Clear-Bit
Clear the 3rd bit(Position = 2) of number n (n=0101)
Bit Mask : 1<<i
Operation : AND with NOT
			(POs Zero )  //Bit-Mask
                   	3'2'10
			| | ||
			0 1 01<<2
			     |
			 0001<<2
			     |
			  0100<--ANS
//NOT                   ~(0100) 
                          1011 -->ANS
//AND                     0101
                         ------
                          0001 <--ANS (NON-Zero)
*/
/*
import java.util.*;
class Bit_Manipulation
{
	public static void main(String args[])
	{
		int n = 5;  //0101
		int pos = 2;
		int bitMask = 1<<pos;
		int notbitMask = ~(bitMask);

		int newNumber = notbitMask & n;
		System.out.println(newNumber);
	}
}
//OUTPUT --> 1
*/
/*Update-Bit
Update the 2nd bit(position = 1) of a number n to 1. (n=0101)
  	     For 0                  For 1
	Bit Mask : 1<<i         Bit Mask : 1<<i
	Operation : AND        Operation : OR
	    with NOT                   <-Set-bit
                <-Clear-bit
//set-Operation -->(for 1)
		0101  //bit-Mask
		1<<1
		  |
		0001<<1
		  |
		0010<--ANS
		0101   //OR   0---> OPsition convert to 1
		----          |				^
		0111<--ANS (0101) 			|
                  |_____________________________________|
//Clear-OPeration -->(for 0) (position 2)
			0101 //BitMask
			 1<<2
			  |
			0001<<2
			  |
			0100<--ANS
		~(0100) = (1011)  //NOT
	                   0101  //AND
			   ----
			   0001<--AND
*/
import java.util.*;
class Bit_Manipulation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int oper = sc.nextInt();

		int n = 5;
		int pos = 1;

		int bitMask = 1<<pos;
		if(oper == 1)
		{
		//set
		 int newNumber = bitMask | n;
		 System.out.println(newNumber);
		}
		else
		{
		//clear
		int newbitMask = ~(bitMask);
		int newNumber = newbitMask & n;
		System.out.println(newNumber);
		}

	}
}
			
//




















