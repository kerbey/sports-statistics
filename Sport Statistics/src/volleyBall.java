import java.util.Scanner;
public class volleyBall extends sportStatistics
{
	public volleyBall()
	{
		super();
	}
	public void volleyBallStatistics()
	{
		int YouTotalPoints=0, opponTotalPoints=0;
		Scanner input= new Scanner(System.in);
		System.out.println(" How many points would you like to play up to?");
		int totalPoints= input.nextInt();
		for (int Point=1;Point<=totalPoints;Point++)
		{			
				int points = (int)(Math.random()*2);
				if (points==0)
				{
					YouTotalPoints=YouTotalPoints+1;
					setYourTotalPoints(YouTotalPoints);
					System.out.println("Your team earned "+getYourTotalPoints()+" points");
				}
				else
				{
					opponTotalPoints=opponTotalPoints+1;
					setOpponentsTotalPoints(opponTotalPoints);
					System.out.println("Opponnent's team earned "+getOpponentsTotalPoints()+" points");
				}
		}
		System.out.println("Your team scored "+getYourTotalPoints()+" points altogether.");
		System.out.println("Your oppponent's team scored "+getOpponentsTotalPoints()+" points altogether.");
		if (getYourTotalPoints()>getOpponentsTotalPoints())
		{
			System.out.println("your team wins the game");
		}
		else if (getYourTotalPoints()<getOpponentsTotalPoints())
		{
			System.out.println("your opponent's team wins the game");
		}
		else
		{
			System.out.println("Its a tie.");
		}
	}
}