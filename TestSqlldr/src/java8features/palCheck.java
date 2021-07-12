package java8features;

public class palCheck {

	
	public static void main(String[] args){
		String s="dod";
		
		if(palenCheck(s)){
			System.out.println("Given string is a palindrome ");
		}
		else{
			System.out.println("Given string is not a palindrome ");
		}
	}
	
	public static boolean palenCheck(String str1){
		
		int len=str1.length();
		int hlen=len/2;
		char[] str=str1.toCharArray();
		int travlen=len-1;
		boolean flg=true;
		for(int i=0;i<hlen;i++){
			if(str[i]==str[travlen-i]){
				flg=true;
			}else{
				flg=false;
				break;
			}
			
		}
		
		return flg;
	}
	
}
