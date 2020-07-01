import java.util.Scanner;

public class Opt {

	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println(" + , - , * , / ");
		System.out.println("Enter One of the operator shown Above");
		char c = sc.next().charAt(0);
		switch(c){
		    case '+':System.out.println(a +"+"+ b+" = "+add(a,b));
		                break;
		    case '-':System.out.println(a+" -"+ b+" = "+sub(a,b));
		                break;
		    case '*':System.out.println(a+"*"+b+"="+mul(a,b));
		                break;
		    case '/':System.out.println(a+" /" +b+ "= "+div(a,b));
		                break;
		    default: System.out.println("Invalid operator");
		                break;
		}
		
		
		
		
        sc.close();
	}

}

