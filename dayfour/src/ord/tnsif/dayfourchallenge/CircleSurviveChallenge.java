/* there are n people standing in a circle waiting to be executed.
  the counting out begins at some point in the circle and proceeds around the circle in a fixed direction. 
  in each step a certain no of people skipped and the next person is executed .
  the elemination proceddes around the circle( which is becomming smaller and smaller as the executed people are removed.
  until only the last person remain who is given freedom)
  
  
  given total no of person n and a no k which indecates that k-1 person are skipped and the kth person is killed in a circle the task is to choose the person in the initial that survives
 */


package ord.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {
	
	static int survive(int n,int k)
	{
		if(n==1) {
			return 1;
		}
		else
			return(survive(n-1,k)+(k-1))%n+1;
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
