package ouri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ouri.Classes.*;


	
@RestController
	public class Resources {
	ObjectMapper map = new ObjectMapper();

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
			
		@PostMapping("Calculator")
		@ResponseBody 
		public String CalculatorPost(@RequestBody String body) throws JsonParseException, JsonMappingException, IOException
		{
			System.out.println(body);
			
			
			Calculator calc = map.readValue(body, Calculator.class);  
			
			
			Calculator cal = new Calculator(calc.type,calc.firstNumber,calc.secondNumber);
			String total = cal.calculate(cal);
			return "The Answer is " + total;
		}
		
		@PostMapping("InterestCalculator")
		@ResponseBody 
		public List<String> InterestCalculatorPost(@RequestBody String body) throws JsonParseException, JsonMappingException, IOException
		{
			CalculateInterest irCalc =  map.readValue(body, CalculateInterest.class);  
			CalculateInterest cal = new CalculateInterest(irCalc.IR,irCalc.loan,irCalc.years);
			List<String> list = cal.calculate(cal);
			System.out.println(list);
			return list;
		}
		
				
		
		

}
