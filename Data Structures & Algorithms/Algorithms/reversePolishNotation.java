import java.io.*;
import java.net.*;
import java.util.*;
/*Sebas*/
/*(Postfix notation) Postfix notation is a way of writing expressions without using parentheses. For example, the expression (1 + 2) * 3 would be written as 
 1 2 + 3 *.Apostfixexpressionisevaluatedusingastack.Scan a postfix expression from left to right. A variable or constant is pushed into the stack. When an operator is encountered, apply the operator with the top two operands in the stack and replace the two operands with the result. The following diagram shows how to evaluate 1 2 + 3 *.*/

class Solution {
	public double evalRPN(String[] tokens) {
		Stack<Double> value = new Stack<>();
		for(String token : tokens){
			//to keep track of order of operations 
			double firstOperand;
			double secondOperand;
			
			switch (token) {
				case "+":	
					value.push(value.pop() + value.pop());
					break;
				case "-":
					secondOperand = value.pop();
					firstOperand = value.pop();
					value.push(firstOperand - secondOperand);
					break;
				case "*": 
					value.push(value.pop() * value.pop());
					break;
				case "/":
					secondOperand = value.pop();
					firstOperand = value.pop();
					value.push(firstOperand - secondOperand);
					break;
				default : 
					value.push(Double.parseDouble(token));  // Must be a number if it isn't a "+", "-", "/", or "*"
				}
		}
		 // The result will be the only item remaining on the stack
		return value.pop();
	}
}
class testSolution{
	public static void main(String[] args) {
		System.out.print("Enter an expression: \n");
		String[] input = "1 1 + 2 2 * +".split("\\s+");
		
		
		System.out.println("The solution is " + new Solution().evalRPN(input));
	}
}