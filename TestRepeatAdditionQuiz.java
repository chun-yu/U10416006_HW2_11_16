import  java.util.*;

public class TestRepeatAdditionQuiz {
	public static void main(String[] args){
		RepeatAdditionQuiz repeatAdditionQuiz = new RepeatAdditionQuiz();
	}
}

class RepeatAdditionQuiz{
	RepeatAdditionQuiz(){
	
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int answer = number1 + number2;
    
		Scanner input = new Scanner(System.in);

		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int myAnswer = input.nextInt();
	
		ArrayList<Integer>  ans = new ArrayList<>();
		while (myAnswer  !=  answer) {
			for(int i=0 ; i < ans.size(); i++){
				int value = ans.get(i);
				if (value ==  myAnswer){
    			System.out.println("You already entered " + myAnswer);
				}
			}
		ans.add(myAnswer);
        System.out.println("Wrong   answer.   Try again.  ");
        System.out.print("What is "+ number1 + " + " + number2 + "? ");
        myAnswer = input.nextInt();
		}
		System.out.println("Y o u    g o t    i t   !  !  !  !  !  ");
	}
}
