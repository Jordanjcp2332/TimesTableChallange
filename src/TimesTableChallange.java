import java.util.Scanner;
import java.util.Random;
public class TimesTableChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi; 
		int low;
		int num;
		int score=0;

		//Ask for hi, low and num
		
		String dif;
		System.out.println("Welcome to the Times Table Challange!");
		System.out.println("What difficulty would you like to play?\n\nA. Easy \nB. Medium\nC. Hard");
		dif=in.nextLine();
		dif=dif.toUpperCase();
		
		if (dif.equals("A")||dif.equals("EASY")) {
			
			System.out.println("What is the biggest number you want?");
			hi=in.nextInt();
			System.out.println("What is th smallest number you want?");
			low=in.nextInt();
			System.out.println("You will be playing this until you get 10 in a row right.");
			int qnum=1;
			
			//Loop ans ask questions
			while (score<10) { 
				
				int num1=rnd.nextInt(hi-low+1)+low;
				int num2=rnd.nextInt(hi-low+1)+low; 
				System.out.println("Question "+qnum+") "+num1+" x "+num2+" = ?");
				int ans=in.nextInt(); 
				qnum++;
				if(ans==num1*num2) {
					score++;
					
					System.out.println("Right!");
					if (score==10) {
						System.out.println("Good job you got 10 in a row right!");
					}
				} else {
				
					System.out.println("Wrong! The answer is "+(num1*num2));
					score=0; 
				
				}
				
			}
			
		} else if (dif.equals("B")||dif.equals("MEDIUM")) {
			System.out.println("You have chosen the Medium difficulty!");
		} else {
			
		}
	
		
		
		
	}

}
