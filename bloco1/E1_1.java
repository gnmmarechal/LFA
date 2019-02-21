import java.util.*;

public class E1_1 
{
	static Scanner sca = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Operação: ");
		String[] input = sca.nextLine().split(" |\n|\t");
		try {
			double vals[] = { Double.parseDouble(input[0]), Double.parseDouble(input[2]) };
			double result = 0;
			switch(input[1])
			{
				case "+":
					result = vals[0] + vals[1];
					break;
				case "-":
					result = vals[0] - vals[1];
					break;
				case "*":
					result = vals[0] * vals[1];
					break;
				case "/":
					result = vals[0] / vals[1];
					break;
				default:
					break;

			}

			System.out.printf("%.5f %s %.5f = %.5f\n", vals[0], input[1], vals[1], result);

		} catch (Exception e)
		{
			System.err.println("Invalid thing");
		}


	}
}
