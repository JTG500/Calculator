package Model;

public class CalculatorModel 
{
	public String inputOne(String equation)
	{
			String number = "1";
			if (equation.isEmpty() == true)
			{
				equation = number;
			}
			else
			{
				equation = equation + number;
			}
			return equation;
	}
	
	public String inputTwo(String equation)
	{
		String number = "2";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputThree(String equation)
	{
		String number = "3";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputFour(String equation)
	{
		String number = "4";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputFive(String equation)
	{
		String number = "5";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputSix(String equation)
	{
		String number = "6";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputSeven(String equation)
	{
		String number = "7";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputEight(String equation)
	{
		String number = "8";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputNine(String equation)
	{
		String number = "9";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputZero(String equation)
	{
		String number = "0";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputMod(String equation)
	{
		String number = "%";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputLeftBracket(String equation)
	{
		String number = "(";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputRightBracket(String equation)
	{
		String number = ")";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputSQRT(String equation)
	{
		String number = "sqrt[";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputExp(String equation)
	{
		String number = "^[";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputMinus(String equation)
	{
		String number = "-";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputPlus(String equation)
	{
		String number = "+";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputTimes(String equation)
	{
		String number = "*";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String inputDivide(String equation)
	{
		String number = "/";
		if (equation.isEmpty() == true)
		{
			equation = number;
		}
		else
		{
			equation = equation + number;
		}
		return equation;
	}
	
	public String results(String equation)
	{
		String left_side;
		String right_side;
		String inner;
		String outer;
		int left_bracket;
		int right_bracket;
		int equation_length;
		int sqrt;
		int carrot;
		int plus;
		int minus;
		int times;
		int divide;
		int mod;
		double addition_result;
		double subtraction_result;
		double exp_result = 0;
		double temp = 0;
		double multi_result = 0;
		double divide_result = 0;
		double sqrt_result = 0;
		double mod_result = 0;
		String result = "Undefined";
		equation_length = equation.length();
		if (equation.contains("("))
		{
			left_bracket = equation.indexOf("(");
			outer = equation.substring(0, left_bracket);
			right_bracket = equation.indexOf(")");
			if (equation.contains(")"))
				inner = equation.substring(left_bracket, right_bracket);
			else
				inner = equation.substring(left_bracket, equation_length);
			
			if (equation.contains("^["))
			{
				carrot = equation.indexOf("^[");
				left_side = equation.substring(0, carrot);
				right_side = equation.substring(carrot, equation_length);
			}
		}
		
		else if (equation.contains("^["))
		{
			carrot = equation.indexOf("^[");
			right_bracket = equation.indexOf(")");
			left_side = equation.substring(0, carrot);
			if (equation.contains(")"))
				right_side = equation.substring(carrot+2, right_bracket);
			else
				right_side = equation.substring(carrot+2, equation_length);
			if (left_side.isEmpty())
				left_side = "0";
			if (right_side.isEmpty())
				right_side = "0";
			exp_result = Double.parseDouble(left_side);
			for (int i = 0; i < Double.parseDouble(right_side)-1; i++)
			{
				temp = exp_result;
				for (int j = 0; j < Double.parseDouble(left_side)-1; j++)
					exp_result =  exp_result + temp;
			}
			result = Double.toString(exp_result);
			return result;
		}
		
		else if (equation.contains("sqrt["))
		{
			sqrt = equation.indexOf("sqrt[");
			right_bracket = equation.indexOf(")");
			left_side = equation.substring(0, sqrt);
			if (equation.contains(")"))
				right_side = equation.substring(sqrt+5, right_bracket);
			else
				right_side = equation.substring(sqrt+5, equation_length);
			if (left_side.isEmpty())
				left_side = "2";
			if (right_side.isEmpty())
				right_side = "0";
			sqrt_result = Double.parseDouble(right_side) / Double.parseDouble(left_side);
			
				do 
				{
						temp = sqrt_result;
						sqrt_result = (temp + (Double.parseDouble(right_side) / temp)) / Double.parseDouble(left_side);
				} 
				while ((temp - sqrt_result) != 0);
				result = Double.toString(sqrt_result);
				return result;
		}
		
		else if (equation.contains("*"))
		{
			times = equation.indexOf("*");
			left_side = equation.substring(0, times);
			right_side = equation.substring(times+1, equation_length);
			if (left_side.isEmpty())
				left_side = "0";
			if (right_side.isEmpty())
				right_side = "0";
			temp = Double.parseDouble(left_side);
			for (int i = 0; i < Integer.parseInt(right_side); i++)
			{
				multi_result = multi_result + temp;
			}
			result = Double.toString(multi_result);
			return result;
		}
		
		else if (equation.contains("/"))
		{
			divide = equation.indexOf("/");
			left_side = equation.substring(0, divide);
			right_side = equation.substring(divide+1, equation_length);
			if (left_side.isEmpty())
				left_side = "0";
			if (right_side.isEmpty())
			{
				result = "Syntax Error";
				return result;
			}
			else if (right_side.equals("0"))
			{
				result = "Divide by Zero Error";
				return result;
			}
			temp = Double.parseDouble(left_side);
			divide_result = Double.parseDouble(right_side);
			divide_result = temp / divide_result;
			result = Double.toString(divide_result);
			return result;
		}
		
		else if (equation.contains("%"))
		{
			mod = equation.indexOf("%");
			left_side = equation.substring(0, mod);
			right_side = equation.substring(mod+1, equation_length);
			if (right_side.isEmpty())
			{
				result = "Syntax Error";
				return result;
			}
			else if (right_side.equals("0"))
			{
				result = "Divide by Zero Error";
				return result;
			}
			temp = Double.parseDouble(left_side);
			mod_result = Double.parseDouble(right_side);
			mod_result = temp%mod_result;
			result = Double.toString(mod_result);
			return result;
		}
		
		else if (equation.contains("+"))
		{
			plus = equation.indexOf("+");
			left_side = equation.substring(0, plus);
			right_side = equation.substring(plus+1, equation_length);
			if (left_side.isEmpty())
				left_side = "0";
			if (right_side.isEmpty())
				right_side = "0";
			addition_result = Double.parseDouble(left_side) + Double.parseDouble(right_side);
			result = Double.toString(addition_result);
			return result;
		}
		
		else if (equation.contains("-"))
		{
			minus = equation.indexOf("-");
			left_side = equation.substring(0, minus);
			right_side = equation.substring(minus+1, equation_length);
			if (left_side.isEmpty())
				left_side = "0";
			if (right_side.isEmpty())
				right_side = "0";
			subtraction_result = Double.parseDouble(left_side) - Double.parseDouble(right_side);
			result = Double.toString(subtraction_result);
			return result;
		}
		return result;
	}
}
