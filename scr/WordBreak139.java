import java.util.Arrays;
import java.util.List;

public class WordBreak139 {

	//https://leetcode.com/problems/word-break/?fbclid=IwAR3D2Og42twAkQ-S8bJfWmPTliV1WsgYuvZeRwwvNOVJT7JYfYwMI0XwjKM
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<String> l = Arrays.asList("leet", "code");
		System.out.println(wordBreak("leetcode", l));

	}
	 public static boolean wordBreak(String s, List<String> wordDict) {
		 
	        for(String w: wordDict)
	        {            
	            s=s.replace(w,"");
	        }
	        
	        if(s.equals("")) return true;
	        else return false;
	        
	    }
	 
}
