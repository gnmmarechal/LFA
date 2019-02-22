import java.util.*;

public class E1_2 {
	static Scanner sca = new Scanner(System.in);
	public static void main (String[] args) {
		
		Stack<Double> calc = new Stack<Double>();
		System.out.print("Input: ");
		String[] in = sca.nextLine().split(" |\n|\t");
		for(int i = 0; i < in.length ; i++){
			String s = in[i];
			try{
				calc.push(Double.parseDouble(s));
			}catch(Exception e){
				assert calc.size() > 1 : "Too many operators.";
				switch(s){
					case "+":
						calc.push(calc.pop() + calc.pop());
						break;
					case "-":
						calc.push(calc.pop() - calc.pop());
						break;
					case "*":
						calc.push(calc.pop() * calc.pop());
						break;
					case "/":
						calc.push(calc.pop() / calc.pop());
						break;
					case "%":
						calc.push(calc.pop() % calc.pop());
						break;
					default:
						break;
				}		
			}
			System.out.println("Stack: " + calc);
			if(i == in.length - 1 && calc.size() > 1)
				System.err.println("Too few operators.");
		}
	}
}

