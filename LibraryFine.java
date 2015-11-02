package hackerrank;

import java.util.*;
public class LibraryFine {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String[] actual = stdin.nextLine().split("\\s");
		String[] retdata = stdin.nextLine().split("\\s");

		long result = 0l;
		if(Integer.parseInt(actual[2]) > Integer.parseInt(retdata[2])){ result = 10000; System.out.println(""+result); return;}
		if(Integer.parseInt(actual[1]) > Integer.parseInt(retdata[1])) { 
			result += (  Integer.parseInt(actual[1]) - Integer.parseInt(retdata[1]) )* 500;
			System.out.println(""+result);
			return;
		}
		if(Integer.parseInt(actual[0]) > Integer.parseInt(retdata[0])){
			result += ( Integer.parseInt(actual[0])-Integer.parseInt(retdata[0]))* 15;
			System.out.println(""+result);
			return;
		}
	}


}
