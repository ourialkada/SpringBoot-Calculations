package ouri.Classes;

public class Calculator {
	public float firstNumber;
	public float secondNumber;
	public String type;
	public Calculator(String type,float firstNumber,float secondNumber) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	
	
	public String calculate(Calculator obj)
	{
		float total = 0;
		switch (type)
		{
		case "add" : 
		 total = obj.firstNumber+obj.secondNumber;
		 break;
		case "subtract" : 
			 total = obj.firstNumber-obj.secondNumber;
			 break;
		case "multiply" : 
			 total = obj.firstNumber*obj.secondNumber;
			 break;
		 
		case "divide" : 
			 total = obj.firstNumber/obj.secondNumber;
			 break;
		}

		return "The Answer is " + total;
	}

}
