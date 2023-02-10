//String Builder -->String are immutable(stack & heap stror)
//               -->Becoz we can't edit Or update the string if we cancan update the String then we can create new String ..
//                  and it take the time so we can use String builder ...
//               -->String Builder is change update String in less time.
//String --> String str = "h";       
//                  str = "e";
//                  str = "l";
//                  str = "l";
//                  str = "o";  
//String Builder = String str = "h'e'l'l'o"
//Syntax --> StringBuilder sb = new StringBuilder("Tony");
//1.String Builder
//2.charAt for index
//3.setCharAt
//4.Insert new value
//5.delete
//6.append -->last la insert
//7.length
import java.util.*;
class String_Builder
{
        public static void main(String args[])
        {
                StringBuilder sb = new StringBuilder("Tony");
                System.out.println(sb);
        
	//char at index 0
	  	System.out.println(sb.charAt(1));

	//setchar at index(To change the value)
	//syntax ->setCharAt(int index,char ch)
	//((0,'P')->Tony => Pony
		sb.setCharAt(0,'P');
		System.out.println(sb);
	//insert -> insert new value
	//syntax ->sb.insert(int index,char ch)
	//(0,'S') ->Pony => SPony
		sb.insert(2,'n');
		System.out.println(sb);

	//delete -> String character delete
	//Syntax ->sb.delete(index_start,index_end)
	//sb.delete(2,3) -->Ponny => SPony
		sb.delete(2,3);
		System.out.println(sb);
	
	//append ->last char insert
	//Syntax ->sb.append("character") //str = str+new char
	//sb.append("e")
		sb.append(" ");
		sb.append("S");
		sb.append("cark");
		System.out.println(sb);
	//length
		System.out.println(sb.length());
	
	}
}
//kitten -> sitten -> sittin -> sitting
