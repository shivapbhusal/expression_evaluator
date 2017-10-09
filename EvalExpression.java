/******************************************************************************
 *  Author : Shiva Bhusal, Bowling Green State University 
 *  Compilation:  javac EvalExpression.java
 *  Execution:    java EvalExpression
 *  Purpose: To evaluate the arithmetic expression 
 ******************************************************************************/

public class EvalExpression {
	public static void main(String[] args ){
		String myExpString="10*10"; 
		float result=evalExp(myExpString); 
		System.out.println(result); 

	}

	public static float evalExp(String expString){
		int expLength=expString.length();
		float result=0;
		String tempResult=""; 
		for (int i=0;i<expLength;i++){

			if (expString.charAt(i)=='+'){
               result=result+Float.parseFloat(tempResult);
               tempResult="";
			}

			else if (expString.charAt(i)=='-'){
               result=result-Float.parseFloat(tempResult);
               tempResult="";
           }

            else if (expString.charAt(i)=='*'){
            	result=result*Float.parseFloat(tempResult);
            	tempResult="";
            }
            else if (expString.charAt(i)=='/'){
            	result=result/Float.parseFloat(tempResult);
            	tempResult="";
            }
			else {
				tempResult=tempResult+expString.charAt(i);
			}
		}
		result=result+Float.parseFloat(tempResult);
		return result; 
	}

}
