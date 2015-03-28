import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ContentInBrackets {

	public List<String> content(String A) {
		Stack<Integer> left = new Stack<Integer>();

		List<String> contents = new ArrayList<String>();
		
		for(int i = 0; i < A.length(); i ++){
			if(A.charAt(i) == '('){
				left.push(i);
			}
			if(A.charAt(i) == ')'){
				int start = left.pop();
				String s = A.substring(start + 1, i);
				contents.add(s); 	
			    
			}
		}
		
		
		return contents;
		
	}

}
