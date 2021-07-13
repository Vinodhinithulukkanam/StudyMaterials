package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PalindromeCheck {
	
	public static void main(String[] args){
		
		String cmd="ambster";
		int len=cmd.length();
		char str[]=cmd.toCharArray();
		boolean flg=true;
		int larglen=0,prevlen=0;
		List<String> palstr =new ArrayList();
		String pal;
		String finalstr="";
		
		System.out.println(""+palCheck(cmd));
		/*for(int i=0;i<len;i++){
				for(int j=i;j<len;j++){
					if(str[i]==str[j]){
						pal=cmd.substring(i,(j+1));
						prevlen=pal.length();
						if(prevlen>larglen){
						if(palCheck(pal)){
							larglen=prevlen;
							finalstr=pal;
							}
								
						}
						
					}
				}
				
				
			}*/
		
		if(larglen > 1)
		System.out.println("largest palindromic substring is :"+finalstr+" ,its length :"+larglen);
		else
			System.out.println("No palindromic substring exist ");
		
	}

	public static boolean palCheck(String str1){
		
		
		char[] arraList=str1.toCharArray();
		
		int low=0;
		int high=arraList.length - 1;
		boolean flg=true;
		while(low<high){
			if(arraList[low]==arraList[high])
			{
				low++;
				high--;
			}else{
				flg=false;
				break;
			}
				
		}
		/*for(int i=0;i<hlen;i++){
			if(str[i]==str[travlen-i]){
				flg=true;
			}else{
				flg=false;
				break;
			}
			
		}*/
		
		return flg;
	}
}
