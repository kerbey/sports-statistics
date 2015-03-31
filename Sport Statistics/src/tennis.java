import java.util.Scanner;
public class tennis extends sportStatistics
{
	public tennis()
	{
		super();
	}
	public void tennisStatistics()
	{
		int YouTotalPoints=0, opponTotalPoints=0;
		Scanner input= new Scanner(System.in);
		System.out.println(" How many games would you like to play up to?");
		int games= input.nextInt();
		for (int Game=1;Game<=games;Game++)
		{
			System.out.println();
			System.out.println("match "+(Game));
			System.out.println("You have "+getYourTotalPoints()+" points.");
			System.out.println("Your oppponent has "+getOpponentsTotalPoints()+" points.");
			for(int score=1;score<=4;score++)
			{
				int points = (int)(Math.random()*2);
				if (points==0)
				{
					YouTotalPoints=YouTotalPoints+1;
					setYourTotalPoints(YouTotalPoints);
					System.out.println("You now have "+getYourTotalPoints()+" points");
				}
				else
				{
					opponTotalPoints=opponTotalPoints+1;
					setOpponentsTotalPoints(opponTotalPoints);
					System.out.println("Opponnent now has "+getOpponentsTotalPoints()+" points");
				}
			}		
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