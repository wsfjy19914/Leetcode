import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TexTable4Column {

	public void output() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(new File("/Users/fjy/stock"));
    	int i = 0;
    	while(in.hasNext())
    	{
    		String s = in.next();
    		
    		System.out.print(s);
    		if(s.equals("T＆D"))
    			System.out.print(" " + in.next());
    		i ++;
    		if(i % 4 != 0)
    			System.out.print(" & ");
    		else
    			System.out.println(" \\\\");
    	}
		
	}

}
