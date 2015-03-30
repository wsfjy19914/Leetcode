

public class IntegerToRoman {

	public String intToRoman(int num) {
        String thousand = "";
        String hundred = "";
        String tens = "";
        String units = "";
        int remainder = 0;
        
        int i = 0;
        for(i = 0; i < num / 1000; i ++)
        {
            thousand += "M";
        }
        remainder = num % 1000;
        
        if(remainder >= 900)
        {
            hundred = "CM";
            remainder -= 900;
        }
        else if(remainder >= 400 && remainder < 500)
        {
            hundred = "CD";
            remainder -= 400;
        }
        else
        {
            if(remainder >= 500)
            {
                hundred = "D";
                remainder -= 500;
            }
            for(i = 0; i < remainder / 100; i ++)
            {
                hundred += "C";
            }
            remainder = remainder % 100; 
        }
        
        
        if(remainder >= 90)
        {
            tens = "XC";
            remainder -= 90;
        }
        else if(remainder >= 40 && remainder < 50)
        {
            tens = "XL";
            remainder -= 40;
        }
        else
        {
            if(remainder >= 50 )
            {   
                tens = "L";
                remainder -= 50;
            }
            for(i = 0; i < remainder / 10; i ++)
            {
                tens += "X";
            }
            remainder = remainder % 10;
        }
        
        if(remainder == 9)
        {
            units = "IX";
        }
        else if(remainder == 4)
        {
            units = "IV";
        }
        else
        {
            if(remainder >= 5)
            {
                units = "V";
                remainder -= 5;
            }
            for(i = 0; i < remainder; i ++)
            {
                units += "I";
            }
        }
        
        return thousand + hundred + tens + units;
        
    }

}
