
import java.util.*;
public class E1_5 {
	static Scanner sca = new Scanner(System.in);
	public static void main (String[] args) {
		String[] in;
		while(true){	
			System.out.print("Operação: ");
			in = sca.nextLine().split(" |\n");
			if(in[0].equals("")) break;
			try{ // Operações simples
				double opA = Double.parseDouble(in[0]);
				double opB = Double.parseDouble(in[2]);
				double res = op(opA,opB,in[1]);
				System.out.printf("%.5f %s %.5f = %.5f\n",opA,in[1],opB,res);		
			}catch(Exception e){
				calcular(in);
			}
		}
	}
	/*
	 * Tipo de operações
	 * n = 2
	 * n + 1
	 * n = 1 + 2 + n ...
	 * n + 2 + 4 + 6 ... 
	 *  Obter o valor
	 * double n;
	 * try{
	 * 	n = Double.parseDouble(s);
	 * }catch(Exception ..){
	 * 	map.get(n) :))))
	 * }
	 */
	private static double calcular(String[] conta){
		return 0;
		
	}
	private static double op(double a, double b, String o){
		switch(o){
				case "+":
					return a + b;
				case "-":
					return a - b;
				case "*":
					return a * b;		
				case "/":
					return a / b;
				case "%":
					return a % b;
				default:
					System.err.println("Operador " + o + " não reconhecido.");
					return -1;
			}	
	}	
}

