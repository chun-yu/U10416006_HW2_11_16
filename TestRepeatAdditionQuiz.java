//import data
import  java.util.*;
//main class
public class TestRepeatAdditionQuiz {
	public static void main(String[] args){
		//constructor new RepeatAdditionQuiz
		RepeatAdditionQuiz repeatAdditionQuiz = new RepeatAdditionQuiz();
	}
}

class RepeatAdditionQuiz{
	RepeatAdditionQuiz(){
		//public int data
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int answer = number1 + number2;
    		//create Scanner object
		Scanner input = new Scanner(System.in);
		//print out the question
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		//Scanner input myAnswer
		int myAnswer = input.nextInt();
		//create arraylist object
		ArrayList<Integer>  ans = new ArrayList<>();
		//determine the myAnswer true or false
		while (myAnswer  !=  answer) {
			//determine the myAnswer is already input yes or no
			for(int i=0 ; i < ans.size(); i++){
				int value = ans.get(i);
				if (value ==  myAnswer){
    			System.out.println("You already entered " + myAnswer);
				}
			}
		//store myAnswer in arreylist
		ans.add(myAnswer);
	//print out wrong when wrong answer
        System.out.println("Wrong   answer.   Try again.  ");
        //ask again
        System.out.print("What is "+ number1 + " + " + number2 + "? ");
        myAnswer = input.nextInt();
		}
		//print out correct when answer is true
		System.out.println("Y o u    g o t    i t   !  !  !  !  !  ");
	}
}
