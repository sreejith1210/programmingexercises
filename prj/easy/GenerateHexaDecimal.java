package prj.easy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GenerateHexaDecimal {

/*
 * The hexadecimal number system is base 16 system, meaning there are 16 unique characters used
 * to define the numbers.the 16 characters used are numbers 0-9 and letters A-F.
 * Decimal     0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 * HexaDecimal 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F
 * 
 * Crimson  rgb(220,20,60)
 * 1.Take the first number 220, and divide by 16. 220/16=13.75
 *   which means the first digit of 6-digit hex color code is 13 or D
 * 2. Take the remainder of the first digit, 0.75 and multiply by 16.
 *    0.75(16)=12, which means the second digit of the 6 digit hex color code is 12 or C
 * 1.Take the first number 20, and divide by 16. 20/16=1.25
 *   which means the first digit of 6-digit hex color code is 1  
 * 2. Take the remainder of the first digit, 0.25 and multiply by 16.
 *    0.25(16)=4, which means the second digit of the 6 digit hex color code is 4
 *  1.Take the first number 60, and divide by 16. 60/16=3.75
 *   which means the first digit of 6-digit hex color code is 3  
 * 2. Take the remainder of the first digit, 0.75 and multiply by 16.
 *    0.75(16)=12, which means the second digit of the 6 digit hex color code is 12 or C       
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> colormap=new HashMap<String,String>();
		colormap.put("0", "0");
		colormap.put("1", "1");
		colormap.put("2", "2");
		colormap.put("3", "3");
		colormap.put("4", "4");
		colormap.put("5", "5");
		colormap.put("6", "6");
		colormap.put("7", "7");
		colormap.put("8", "8");
		colormap.put("9", "9");
		colormap.put("10", "A");
		colormap.put("11", "B");
		colormap.put("12", "C");
		colormap.put("13", "D");
		colormap.put("14", "E");
		colormap.put("15", "F");
		
/*System.out.println("Enter red channel value:");

System.out.println("Enter green channel value:");

System.out.println("Enter blue channel value:");*/
		StringBuilder sb=new StringBuilder();
		sb.append("#");
		sb.append(getHexValue(220,colormap));
		sb.append(getHexValue(20,colormap));
		sb.append(getHexValue(60,colormap));
		
		System.out.println("Final Hex:"+sb.toString());
}
	
	
	private static String getHexValue(int dec,Map colormap) {
		float hexf=(dec/16f);	
		//String s=String.valueOf(hexf);
		int n=(int)hexf;
		System.out.println("n:"+n);
		StringBuilder sb=new StringBuilder("");
		sb.append(colormap.get(String.valueOf(n)));
		float fractional=(hexf-n)*16;
		sb.append(colormap.get(String.valueOf(Math.round(fractional))));
		//System.out.println("fractional:"+Math.round(fractional));	

				//System.out.println(String.valueOf(hexf));
		System.out.println(sb.toString());
	return sb.toString();
	}
	
}
