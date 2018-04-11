package prj.medium;

public class AlphabetCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefghijklmnopqrstuvwxyz";
		StringBuilder cipher=new StringBuilder("");
		cipher.append(str+"\n");
		for(int i=1;i<26;i++){
			cipher.append(str.substring(i)+str.substring(0,i)+"\n");			
		}
		//System.out.println(cipher.toString());
		// Output :: JavaToScalaJavaToScalaJav
		String message = "thisisatestmessagefromtom";
		String keyword=generateKeyword("javatoscala", message);
		generateCipher(keyword, message);
		//generateAlphabetInteger('t');
	}
	
	/**
	 * 
	 * @param inputKeyword "javatoscala"
	 * @param outputMessage "thisisatestmessagefromtom"
	 * @return  "javatoscalajavatoscalajav"
	 */
	private static String generateKeyword(String inputKeyword,String outputMessage){
		int outputMessageLength=outputMessage.length();	
		StringBuilder keyMessageBuilder=new StringBuilder();
		for(int i=0;i<outputMessageLength;i++){
			keyMessageBuilder.append(inputKeyword);
		}
		keyMessageBuilder.setLength(outputMessageLength);
		return keyMessageBuilder.toString();
	}
	
	private static int generateAlphabetInteger(char findAlphabet){
		int count=0;
		for(char i='a';i<='z';i++){
			if(findAlphabet==i){
			System.out.println("Alphabet:::"+i+" and count is:"+count);
			break;
			}
			count++;
		}
		System.out.println("count is::"+count);
		return count;
	}
	
	/**
	 * 
	 * @param keyword "javatoscalajavatoscalajav"
	 * @param message "thisisatestmessagefromtom"
	 * @return "chdsbgsvedtvenstuwhrzmcoh"
	 */
	private static String generateCipher(String keyword,String message){
		int keyLength=keyword.length();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";		
		String str=alphabet.substring(alphabet.indexOf("j"))+alphabet.substring(0,alphabet.indexOf("j"));
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<keyLength;i++){
			char column=keyword.charAt(i);
			str=alphabet.substring(alphabet.indexOf(String.valueOf(column)))+alphabet.substring(0,alphabet.indexOf(String.valueOf(column)));				
			char row=message.charAt(i);
			System.out.println("Column is >:"+column+" and row is >:"+row);
			System.out.println("String is :"+str);
			sb.append(str.charAt(generateAlphabetInteger(row)));
			System.out.println((alphabet.indexOf("z"))-(alphabet.indexOf(String.valueOf(column))));
		}
		System.out.println("Cipher is::"+sb.toString());
		return "";
	}

}
