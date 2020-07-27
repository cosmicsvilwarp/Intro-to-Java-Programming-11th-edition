import java.io.*;
import java.net.*;
import java.util.*;
/*Sebas*/
/*(Postfix notation) Postfix notation is a way of writing expressions without using parentheses. For example, the expression (1 + 2) * 3 would be written as 
 1 2 + 3 *.Apostfixexpressionisevaluatedusingastack.Scan a postfix expression from left to right. A variable or constant is pushed into the stack. When an operator is encountered, apply the operator with the top two operands in the stack and replace the two operands with the result. The following diagram shows how to evaluate 1 2 + 3 *.*/

class postfixNotation {
	public static void main(String[] args) {
		System.out.print("Enter an expression: \n");
		String expression = "1 1 + 2 2 * +";
		Queue<String> exp = new LinkedList<>(Arrays.asList(expression.split("\\s+")));
		Stack<Double> value = new Stack<>();
		
		while(!exp.isEmpty()){
			String token = exp.poll();
			if(Character.isDigit(token.charAt(0))){
				value.push(Double.parseDouble(token));
			}
			else{
				double val = value.pop();
				double result = 0;
				switch (token) {
					case "+": result = val + value.pop();
						break;
					case "-": result = val - value.pop();
						break;
					case "*": result = val * value.pop();
						break;
					case "/": result = val / value.pop();
						break;
					default : System.out.println("Wrong operand"); 
				}
				value.push(result);
			}
		}
		System.out.println(expression + " = " + value.pop());
	}
}