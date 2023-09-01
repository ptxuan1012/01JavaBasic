package day3;

public class FindHelloWord {
	public static void finHelloWord(String strImput) {
		//String strImput ="Hello Word";
		int i =0;
		do {
			if(strImput.charAt(i)=='r') {
				System.out.println("Index cua r"+ i);
			}			
			System.out.println("No char find");	
			i++;
		}
		while(i<strImput.length() || i==-1);
		
	}
	
	public static void Ex10(String str) {
		int index = 0;
		while (index < str.length()) {
			if (str.charAt(index) == 'r') {
				System.out.println("chi so " + index);
				return;
			}
			index++;
		}
		System.out.println("khong tim thay");
	}

}
