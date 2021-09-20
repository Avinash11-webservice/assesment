package assessment;

	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Scanner;

	class ScoreAnalyzer{
		
		private LinkedList<Integer> runData;
		
		public ScoreAnalyzer() {
			
			runData = new LinkedList<Integer>();
		}
		
		public void addRunsToList(int run) {
		runData.add(run);
	}
		public double calcRunRate() {
			double sum = 0.0;
			for (Integer run : runData) {
			sum =	sum + run;
			}
			double runRate = sum/50;
			return runRate;
		}
		// lowest runs scored
		public int lowestRunsScored() {
			return Collections.min(runData);
		}
		// display runs  scored by all players
		public void displayRuns() {
			int c=1;
			System.out.println("Runs Scored ");
			for (Integer runs : runData) {
				System.out.print(c+"-"+runs+" ");
				c++;
			}
			System.out.println();
		}	
	}

	public class ScoreCardAnalyze {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer();
			
			int n = sc.nextInt();
			System.out.println("Enter Runs ");
			for(int i=0;i<n;i++) {
				
				scoreAnalyzer.addRunsToList(sc.nextInt());			
	}
			scoreAnalyzer.displayRuns();
			
			System.out.println("Lowest Runs "+scoreAnalyzer.lowestRunsScored());
			System.out.println("Run Rate "+scoreAnalyzer.calcRunRate());
			
			System.out.println("Players Who Batted "+n);		
			
			sc.close();
		}
		
	}


