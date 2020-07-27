/*Sebas*/
//(Evaluate expression) Modify Listing 20.12, EvaluateExpression class to make all operators (+−*/) have equal precedence. For example, 4 + 3 − 2 * 10 is 50. Write a test program that prompts the user to enter an expression and displays the result.
import java.io.*;
import java.net.*;
import java.util.*;

class TestSolution{
	public static void main(String[] args) {
		System.out.println("Enter an expression: ");
		String expression = "4 + 3 - 2 * 10";

		System.out.println(expression + " = " + new Solution().evaluaExpression(expression));
	}
}

class Solution{
	public static int evaluaExpression(String tokens){
		//To keep track of order of operations
		int firstOperand;
		int secondOperand;
		Queue<String> q = new LinkedList<>(Arrays.asList(tokens.split("\\s+")));
		Stack<Integer> values = new Stack<>();
		Stack<String> ops = new Stack<>();
		
		while(!q.isEmpty()){
			String token = q.poll();
			if(Character.isDigit(token.charAt(0))){
				values.push(Integer.parseInt(token));
				if(values.size() == 2){
					switch(ops.pop()){
						case "+" : 
							values.push(values.pop() + values.pop());
							break;
						case "-" :
							secondOperand = values.pop();
							firstOperand = values.pop();
							values.push(firstOperand - secondOperand);
							break;
						case "*" : 
							values.push(values.pop() * values.pop());
							break;
						case "/" : 
							secondOperand = values.pop();
							firstOperand = values.pop();
							values.push(firstOperand / secondOperand);
							break;
					}
				}
			}
			else if(!Character.isDigit(token.charAt(0))){
					ops.push(token);
			}
		}
		return values.pop();
	}
}
