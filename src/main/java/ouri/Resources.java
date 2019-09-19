package ouri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ouri.Classes.*;


	
@RestController
	public class Resources {


		@GetMapping("/Calculate")
		@ResponseBody
		public List<CalculateTotalWages> getCalc(@RequestParam(value = "hourlyWage") float salary,@RequestParam(value="hoursWorked")
		float hours)
		{
			
			List<CalculateTotalWages> list = new ArrayList<>();
			float total=salary*hours;
			list.add(new CalculateTotalWages(salary,hours,total));
			
			return list;

		
		}
		
		
		@GetMapping("Calculator")
		@ResponseBody 
		public String Calculator(@RequestParam(value = "type") String type,@RequestParam(value = "firstNumber") float a,@RequestParam(value = "secondNumber") float b)
		{
		
			Calculator cal = new Calculator(type,a,b);
			String total = cal.calculate(cal);
			return "The Answer is " + total;
		}
		
		@GetMapping("InterestCalculator")
		@ResponseBody 
		public List<String> InterestCalculator(@RequestParam(value = "interestRate") float IR,@RequestParam(value = "loanAmount") float loan,@RequestParam(value = "years") int years)
		{
			CalculateInterest cal = new CalculateInterest(IR,loan,years);
			List<String> list = cal.calculate(cal);
			
			return list;
		}
		
				
		
		

}
