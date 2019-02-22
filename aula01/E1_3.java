import java.util.*;
import java.io.*;
import java.nio.file.*;

public class E1_3 {
	static Scanner sca = new Scanner(System.in);
	public static void main (String[] args) {
		
		//String[][] nums = parseNumbers("numbers.txt");
		Map<String,Integer> nums = parseNumbers("numbers.txt");
		//System.out.println(nums);
		
		while(sca.hasNextLine()){
			String[] words = sca.nextLine().split(" |-");
			System.out.println("");
			for(int i = 0; i < words.length; i++){
				if(nums.containsKey(words[i]))
					System.out.print(nums.get(words[i]));
				else
					System.out.print(words[i]);
				if(i < words.length - 1)
					System.out.print(" ");
			}
		}
		
		
		System.out.println("");
	}
	/*
	private static String[][] parseNumbers(String f){
		try{
			Path path = Paths.get(f);
			List <String> linhas = Files.readAllLines(path);
			String[][] arr = new String[linhas.size()][2];
			String[] linha;
			for(int i = 0; i < linhas.size(); i++){
				linha = linhas.get(i).split(" - ");
				assert linha.length == 2 : "Formato errado.";
				arr[i][0] = linha[0];
				arr[i][1] = linha[1];
			}
			return arr;
		}catch(IOException e){
			System.err.println(e);
			return null;
		}
		
	}
	*/
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

