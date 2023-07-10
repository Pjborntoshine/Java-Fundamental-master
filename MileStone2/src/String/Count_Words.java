package String;

import java.util.Scanner;
import java.util.*;
public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		String[] a =  str.split(" ");		
		String lop = a[0];
		String lop2 = a[1];
		//System.out.print("lolo "+lop.isBlank());
		if(lop.isEmpty() &&!lop2.isEmpty()) {
			
					System.out.println("2");
					return ;
//				
				}
		System.out.println(a.length);	

		/*
		 * TA HASIM
		 *  int count=0;
        if(str.length()==0){
            return count;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count+=1;
            }
        }
	return count+1;
		 * 
		 */
		
	}
	}
		
		
	


