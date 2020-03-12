package calculator2;

import java.util.Stack;

public class Calcul {

public static String Expression(String Expr) {
	String current=" ";
	Stack<Character> stack= new Stack<>();
	int priority;
	
	for(int i=0; i<Expr.length(); i++) {
		priority=getP(Expr.charAt(i));
		if (priority==0)  current+=Expr.charAt(i);
		if (priority==1){current+=' '; stack.push(Expr.charAt(i));}
		
		if(priority >1) {
			current+=' ';
			while(!stack.empty()) {
				
				if(getP(stack.peek())>=priority)current+=stack.pop();
				else break;
			}
				stack.push(Expr.charAt(i));
		}
		if (priority == -1) {
			current+=' ';
			while(getP(stack.peek()) != 1)current+=stack.pop();
			stack.pop(); 
		}
	}
	while(!stack.empty())current+=stack.pop();
	return current;
}
public static double Answer(String rpn) {
	String operand= new String();
	Stack<Double> stack=new Stack<>();
	
	for(int i=0; i<rpn.length(); i++) {
		if((rpn.charAt(i))==' ') continue;
		if(getP(rpn.charAt(i)) ==0){
			while(rpn.charAt(i) !=' ' && getP(rpn.charAt(i))==0) {
				operand+=rpn.charAt(i++);
				if(i==rpn.length()) break;
			}
			stack.push(Double.parseDouble(operand));
			operand= new String();
			
		}
		if(getP(rpn.charAt(i))>1) {
			double a= stack.pop(), b=stack.pop();
			if (rpn.charAt(i)=='+')stack.push(a+b);
			if (rpn.charAt(i)=='-')stack.push(a-b);
			if (rpn.charAt(i)=='*')stack.push(a*b);
			if (rpn.charAt(i)=='/')stack.push(a/b);
		}
	}
	
	return stack.pop();
}

private static int getP(char token) {
	if(token=='*' || token== '/')      return 3;
	else if(token=='+' || token== '-') return 2;
	else if(token=='(')                return 1;
	else if(token==')')                return -1;
	else                               return 0;
	
	
	
}
}
