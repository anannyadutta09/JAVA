public class Loopy {

public static void main (String[] args) {
int x =1;
System.out.println("Before the loop");
while (true) {
	System.out.println("In the Loop");
	System.out.println("value of x is " + x++);
	 
	 if( x == 4)
		 break;
	 // x = x + 1;
}
System.out.println("This is after the loop");
}
}