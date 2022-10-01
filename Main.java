
public class Main {

	public static void main(String[] args) {
		String mesaj="today, the weather is perfect ";
		System.out.println("number of character: "+mesaj.length());//length of text 
		System.out.println("character 10th: "+mesaj.charAt(9));  // charAt(n) -> character n
		System.out.println(mesaj.concat("Yes!")); //temporary merge operation
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("t"));//verify start character
		System.out.println(mesaj.endsWith("t"));   //verify ending character
		
		char[] characters=new char[10];
	mesaj.getChars(0, 10,characters ,0 );  //string array starting with 0 and ending with 10 in 'character' array
	System.out.println(characters);
	
	System.out.println(mesaj.indexOf("o")); // index number of the letter(from the left side)
	System.out.println(mesaj.lastIndexOf("f"));  //(starts searching on the right)
	}

}
