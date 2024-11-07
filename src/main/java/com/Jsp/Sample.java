package exceptiontopic;

public class Demo {
public static void main(String[] args) {
System.out.println("-------Main Starts-------");
try {
int i=10/0;
}
catch(ArithmeticException e)
{
	System.out.println("handled");
}

System.out.println("-------Main Ends-------");
}
}
