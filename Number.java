
public class Number {
	private int value;
	private int noOfDigits = 0;
	
	public Number(int value) {
		this.value=value;
	}
	
	public void setValue (int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getNoOfDigits() {
		
		int temp = Math.abs(value);
		
		do {
			temp = temp / 10;
			noOfDigits++;
			
		}while (temp >= 1); 
		
		
		return noOfDigits;
	}
	
	public int getDigit(int digitNum)
	{
		if (digitNum<noOfDigits && digitNum>=0) {
		int Result=Math.abs(value);
		for(int i=0;i<digitNum;i++) {
		Result=Result/10;
		
		}	
		Result=Result %10;
		
		return Result;
	}
	
	
	else
		return -1;
	}
}
