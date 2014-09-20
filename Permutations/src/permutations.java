import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class permutations {
	public static void main(String [ ] args)
	{
		Scanner inFile1 = null;
		try {
			inFile1 = new Scanner(new File("JudgeInput.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> tokens = new ArrayList<String>();
		while (inFile1.hasNext()) {
		    tokens.add(inFile1.nextLine());
		}
		String[] input_lines = tokens.toArray(new String[0]);
		
		for (int i = 0; i < input_lines.length; i++)
		{
			//System.out.println(input_lines[i]); 
			String string11 = (input_lines[i].split(",")[0]).toLowerCase();
			String string22 = (input_lines[i].split(",")[1]).toLowerCase();
			String string1 = string11.replaceAll("\\s","");
			String string2 = string22.replaceAll("\\s","");
			
			char[] str1Char = string1.toCharArray(); 
			char[] str2Char = string2.toCharArray(); 
			
			Arrays.sort(str1Char); 
			Arrays.sort(str2Char); 
			//System.out.println("char[] 1: " + new String(str1Char));
			//System.out.println("char[] 2: " + new String(str2Char));
			if (Arrays.equals(str1Char, str2Char))
				System.out.println("Valid Pattern");
			else
				System.out.println("Invalid Pattern");
		}
		
 
	}
	
}
