
import java.util.*;

public class E1_1{
	static Scanner sca = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.print("Operação: ");
		String[] in = sca.nextLine().split(" |\n");
		try{
			double opA = Double.parseDouble(in[0]);
			double opB = Double.parseDouble(in[2]);
			double res = 0;
			switch(in[1]){
				case "+":
					res = opA + opB;
					break;
				case "-":
					res = opA - opB;
					break;
				case "*":
					res = opA * opB;
					break;			
				case "/":
					res = opA / opB;
					break;
				case "%":
					res = opA % opB;
					break;
				default:
					break;
			}		
			System.out.printf("%.5f %s %.5f = %.5f\n",opA,in[1],opB,res);
			
		}catch(Exception e){
			System.err.println("Invalid input.");
		}	
		
	}
}

