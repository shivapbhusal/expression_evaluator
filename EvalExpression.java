/******************************************************************************
 *  Author : Shiva Bhusal, Bowling Green State University 
 *  Compilation:  javac EvalExpression.java
 *  Execution:    java EvalExpression
 *  Purpose: To evaluate the arithmetic expression 
 ******************************************************************************/

public class EvalExpression {
	public static void main(String[] args ){
		String myExpString="10-20"; 
		float result=evalExp(myExpString); 
		System.out.println(result); 

	}

	public static float evalExp(String expString){
		int expLength=expString.length();
		float result=0;
		String tempResult="";
		char operator='+';
		for (int i=0;i<expLength;i++){

			if (expString.charAt(i)=='+'){
               result=calculate(result,tempResult,operator);
               operator=expString.charAt(i);
               tempResult="";
			}

			else if (expString.charAt(i)=='-'){
               result=calculate(result,tempResult,operator);
               operator=expString.charAt(i);
               tempResult="";
           }

            else if (expString.charAt(i)=='*'){
            	result=calculate(result,tempResult,operator);
                operator=expString.charAt(i);
                tempResult="";
            }
            else if (expString.charAt(i)=='/'){
            	result=calculate(result,tempResult,operator);
                operator=expString.charAt(i);
                tempResult="";
            }
			else {
				tempResult=tempResult+expString.charAt(i);
				if (i==expLength-1)
				{
					result=calculate(result,tempResult,operator);
					tempResult="";

				}
			}
		}
		return result; 
	}

	public static float calculate(float result,String tempResult,char operator){
		if (operator=='+')
		{
			result=result+Float.parseFloat(tempResult);
			return result;

		}
		else if (operator=='-')
		{
			result=result-Float.parseFloat(tempResult);
			return result;

		}
		else if (operator=='*')
		{
			result=result*Float.parseFloat(tempResult);
			return result;

		}
		else 
		{
			result=result/Float.parseFloat(tempResult);
			return result;

		}
	}

}
