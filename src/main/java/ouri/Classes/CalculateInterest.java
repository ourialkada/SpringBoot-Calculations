package ouri.Classes;

import java.util.ArrayList;
import java.util.List;

public class CalculateInterest {
	public float IR;
	public float loan;
	public int years;
	public CalculateInterest(float ir,float loan,int years) {
		this.IR = ir;
		this.loan = loan;
		this.years = years;
	}
	
	public List<String> calculate(CalculateInterest obj)
	{
		float rateAmount = 0;
		List<String> list = new ArrayList<>();
		
		
		if (obj.years == 0 || obj.IR == 0 || obj.loan == 0)
		{
			list.add("Invalid Entry");
			
		}
		else if (obj.years == 1)
		{
			 rateAmount = (IR/100) * obj.loan;
			 list.add("Interest Rate: " + obj.IR+"%");
			 list.add("Loan Amount: $" + obj.loan);
			 list.add("Total Amount Of Years: " + obj.years);
			 list.add("Total: $" + rateAmount);
		}
		else
		{
			rateAmount = ((IR/100) * loan) * obj.years;
			 list.add("Interest Rate: " + obj.IR+"%");
			 list.add("Loan Amount: $" + obj.loan);
			 list.add("Total Amount Of Years: " + obj.years);
			 list.add("Total: $" + rateAmount);
		}
		
		return list;
	}
	

}
