package ouri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


	
@RestController
	public class Resources {


		@GetMapping("/Calculate")
		@ResponseBody
		public List<Calculate> getCalc(@RequestParam(value = "hourlyWage") float salary,@RequestParam(value="hoursWorked")
		float hours)
		{
			
			List<Calculate> list = new ArrayList<>();
			float total=salary*hours;
			list.add(new Calculate(salary,hours,total));
			
			return list;

		
		}
		
		
		@GetMapping("Calculator")
		@ResponseBody 
		public String Calculator(@RequestParam(value = "type") String type,@RequestParam(value = "firstNumber") float a,@RequestParam(value = "secondNumber") float b)
		{
			
			float total = 0;
			switch (type)
			{
			case "add" : 
			 total = a+b;
			 break;
			case "subtract" : 
				 total = a-b;
				 break;
			case "multiply" : 
				 total = a*b;
				 break;
			 
			case "divide" : 
				 total = a/b;
				 break;
			}
	
			
			return "The Answer is " + total;
		}
		
		@GetMapping("InterestCalculator")
		@ResponseBody 
		public List<String> InterestCalculator(@RequestParam(value = "interestRate") float IR,@RequestParam(value = "loanAmount") float loan,@RequestParam(value = "years") int years)
		{
			float rateAmount = 0;
			List<String> list = new ArrayList<>();
			
			
			if (years == 0 || IR == 0 || loan == 0)
			{
				list.add("Invalid Entry");
				
			}
			else if (years == 1)
			{
				 rateAmount = (IR/100) * loan;
				 list.add("Interest Rate: " + IR+"%");
				 list.add("Loan Amount: $" + loan);
				 list.add("Total Amount Of Years: " + years);
				 list.add("Total: $" + rateAmount);
			}
			else
			{
				rateAmount = ((IR/100) * loan) * years;
				 list.add("Interest Rate: " + IR+"%");
				 list.add("Loan Amount: $" + loan);
				 list.add("Total Amount Of Years: " + years);
				 list.add("Total: $" + rateAmount);
			}
			
			
			
	
			
			return list;
		}
		
				
		
		

}
