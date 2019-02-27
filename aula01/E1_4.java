import java.util.*;
import java.io.*;
import java.nio.file.*;

public class E1_4 {
	static Scanner sca = new Scanner(System.in);
	public static void main (String[] args) {
		
		Map<String,Integer> nums = parseNumbers("numbers.txt");
		Queue<Integer> numeros = new LinkedList<>();
		//Adicionar os numeros lidos
		while(sca.hasNextLine()){
			String linha = sca.nextLine();
			System.out.print(linha);
			String[] words = linha.split(" |-");
			for(int i = 0; i < words.length; i++){
				if(nums.containsKey(words[i]))
					numeros.add(nums.get(words[i]));
				if(i < words.length - 1)
					System.out.print(" ");
			}
		}
		
		System.out.println("-> " + solve(numeros));
	}
	private static int solve(Queue<Integer> lista){
		assert lista.peek() != null : "There are no numbers to solve.";
		int total = 0;
		int tmp = lista.poll();
		while(lista.peek() != null){
			if(tmp < lista.element())
				tmp *= lista.poll();
			else{
				total += tmp;
				tmp = lista.poll();	
			}
			if(lista.peek() == null)
					total += tmp;
		}
		
		return total;		
	}
	
	private static Map<String,Integer> parseNumbers(String f){
		Map<String,Integer> mapa = new HashMap<>();
		Path path = Paths.get(f);
		try{
			List<String> linhas = Files.readAllLines(path);
			String[] in;
			for(String l : linhas){
				in = l.split(" - ");
				mapa.put(in[1], Integer.parseInt(in[0]));
			}			
		}catch(IOException e){
			System.out.println(e);
		}
		return mapa;
	}
	
}

