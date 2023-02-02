// Operators --> +-*/%!(binary operator)
//           -->Symbols that tell compiler to perform some operation.
//           -->1 + 2 --> 1 & 2 are operand && + is operator
//binary Operator (2 operand are ues)
//1.Arithmetic Operator
    + = A + B = (10+5) = 15
    - = A - B = (10-5) = 5
    * = A * B = (10*5) = 50
    / = A / B = (10/5) = 2
    % = -|modulo  
        -|Reminder --> (10%5) = 0
                    --> (45/2) = 1	
//2.Unary (one  oprand use)
    ++ --> Increment  ex. a = a+1 = a++
    -- --> decrement  ex. a = a-1 = a--
//3.PostIncrement ex. 'a++' (use value & then change value) 
ex.
	int a = 10;
	int b = 0;

	b = a++;
	System.out.println(a); //output 11
	System.out.println(b); //output 10

//4.PreIncrement ex. '++a' (change value & then use value)
ex.
	int a = 10;
	int b = 0;

	b = ++a;
	System.out.println(a); //output 11
	System.out.println(b); //output 11

//5.PostDecreament ex. 'a--' (use value & then change value)
ex.
	int a = 10;
	int b = 0;

	b = a--;
	System.out.println(a); //output 9
	System.out.println(b); //output 10

//6.PreDecreament ex. 'a--' (change value & then use value )
ex.
        int a = 10;
        int b = 0;
        
        b = --a;
        System.out.println(a); //output 9
        System.out.println(b); //output 9

//7.Relational Operators --> (Ans: boolan)
    == --> Equal     -> A == B --> 5 == 6 :-> False
    != --> Not Equal -> A != B --> 5 != 6 :-> True 
    >  --> Greater   -> A  > B --> 5  > 6 :-> False
    <  --> Lesser    -> A  < B --> 5  < 6 :-> True
    >= --> G-equal   -> A >= B --> 5 >= 6 :-> False
    <= --> L-equal   -> A <= B --> 5 <= 6 :-> True

//8.Logical Operator -->(Ans: Boolen)
//                     A = 10 , b = 20 , c = 30

    && (Logical AND)  -> ( A < B  && B < C ) = True
		      -> ( A < B  && B > C ) = False

    || (Logical OR)   -> ( A < B  || B < C ) = True
    		      -> ( A > B  && B < C ) = True
    !  (Logical NOT)  -> (!(A < B)) = False
                      -> (!(B > C)) = True

//9.Binary Number System (Base 2) --> 0 1

    4 To Binary                      101 To Decimal 
    -----------                     ----------------
(fact)         (reminder)             1     0     1
      2	| 4     0                     *     *     *
    ----------                       2^2 + 2^1 + 2^0   
      2	| 2     0                   -----------------
    ----------                        4  +  0  + 1  
	| 1			   
                                       ANS : (5)10 base
     ANS : (100)2 base	                     
//10.Octal --> Base 8
//11.Hexadecimal --> Base 16

//12.Bitwise Operators --> in bit from
// True -> 1 , false -> 0 , A = 0101 B = 0110 
     &  (Binary AND)  --> 0101 
     			  0110 --> 0100
     |  (Binary OR)   --> 0101
                          0110 --> 0111
     ^  (Binary XOR)  -->(similar val :-false , diff val :- True)
	                  0101
                          0110 --> 0011
     ~  (Binary one's complement)  -->(1->0 0->1)
     				      0101
	                              0110 --> 1000
     << (Binary Left Shift)  --> 0101 << 1
                                 4123 1st is last = ANS 1010
     >> (Binary Right Shift)  -->0110 >> 1
                                 3214 last is last = ANS 1100
//13.Assignment Operators (A = 10 , B = 5)
     =   --> A = B         --> A = 5
     +=  --> A = A + B (A+=B)    --> 10 + 5 = A = 15
     -=  --> A = A - B (A-=B)    --> 10 - 5 = A = 5
     *=  --> A = A * B (A*=B)    --> 10 * 5 = A = 50
     /=  --> A = A / B (A/=B)    --> 10 / 5 = A = 2

	
