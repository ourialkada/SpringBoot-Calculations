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
	
	public Calculator()
	{
		
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
	public String Postcalculate(Calculator obj)
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


	public float getFirstNumber() {
		return firstNumber;
	}


	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}


	public float getSecondNumber() {
		return secondNumber;
	}


	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
