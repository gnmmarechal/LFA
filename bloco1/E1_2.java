import java.util.*;

public class E1_2
{
	public static void main(String[] args)
	{
		Stack<Double> calcStack = new Stack<Double>();
		Scanner sca = new Scanner(System.in);
		String[] input = sca.nextLine().split(" |\n|\t");

		// Parse input
		
		for (String i : input)
		{
			try
			{
				calcStack.push(Double.parseDouble(i));
			} catch (Exception e)
			{
				switch(i)
				{
					case "+":
						calcStack.push(calcStack.pop() + calcStack.pop());
						break;
					case "-":
						calcStack.push(calcStack.pop() - calcStack.pop());
						break;
					case "*":
						calcStack.push(calcStack.pop() * calcStack.pop());
						break;
					case "/":
						calcStack.push(calcStack.pop() / calcStack.pop());
						break;
					default:
						break;
				}
			}
			System.out.println("Stack: " + calcStack);
		}

	}
}
