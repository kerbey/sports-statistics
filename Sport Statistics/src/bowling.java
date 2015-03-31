import java.util.Scanner;
public class bowling extends sportStatistics
{
	public bowling()
	{
		super();
	}
	public void bowlingStatistics()
	{
		int YouTotalPoints=0, opponTotalPoints=0;
		Scanner input= new Scanner(System.in);
		System.out.println("how many times would you like to bowl before the game ends");
		int attempt= input.nextInt();
		for(int tempt=1;tempt<=attempt;tempt++)
		{
			int YourPins = (int)(Math.random()*10);
			System.out.println("Attempt "+(tempt)+", you knocked down "+YourPins+" pins");
			int yourPoints=YourPins;
			YouTotalPoints= YouTotalPoints+yourPoints;
			setYourTotalPoints(YouTotalPoints);
			
			int opponentsPins = (int)(Math.random()*10);
			System.out.println("Attempt "+(tempt)+", your opponent knocked down "+opponentsPins+" pins");
			int opponentspoints=opponentsPins;
			opponTotalPoints= opponTotalPoints+opponentspoints;
			setOpponentsTotalPoints(opponTotalPoints);
			
		}
		System.out.println("You scored "+getYourTotalPoints()+" points altogether.");
		System.out.println("Your oppponent scored "+getOpponentsTotalPoints()+" points altogether.");
		if (getYourTotalPoints()>getOpponentsTotalPoints())
		{
			System.out.println("you win the game");
		}
		else if (getYourTotalPoints()<getOpponentsTotalPoints())
		{
			System.out.println("your opponent wins the game");
		}
		else
		{
			System.out.println("Its a tie.");
		}
	}
}
