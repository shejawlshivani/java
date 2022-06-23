package corejava;
import java.util.*;

public class SnakeCase {
	 public String camelToSnake(String str)
	 {
		 //Declaring String
	String stt="";
	//converting string into lower case
	stt+=Character.toLowerCase(str.charAt(0));
//using the for loop for iterating string
	for(int i=1;i<str.length();i++)
	{
	 char ch=str.charAt(i);
	if (Character.isUnicodeIdentifierPart(ch))
	{
		//adding to the string
	stt=stt+'_';
	 stt=stt+Character.toLowerCase(ch);
	 }
	else
	{
	stt=stt+ch;
	 }  
	}
	return stt;
	 }
	}

