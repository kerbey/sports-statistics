public class Main
{
	public static void main (String []args)
	{
		System.out.println("Now looking at bowling statistics");
		bowling bowl= new bowling();
		bowl.bowlingStatistics();
		System.out.println("Now looking at tennis statistics");
		tennis Tennis= new tennis();
		Tennis.tennisStatistics();
		System.out.println("Now looking at volleyBall statistics");
		volleyBall vBall= new volleyBall();
		vBall.volleyBallStatistics();
	}
}