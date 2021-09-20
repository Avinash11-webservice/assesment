package assessment;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.concurrent.atomic.AtomicInteger;
	import java.util.stream.Collectors;

	public class ScoreCard {
		public static void main(String[] args) {

			System.out.println("Enter Runs Scored");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine() + " ";
			String score[] = input.split(" ");
			List<String> listOfScore = new ArrayList<String>(Arrays.asList(score));

			System.out.println("Players who batted");
			listOfScore.forEach(s -> {
				System.out.println(s.split("-")[0]);
			});

			AtomicInteger totalScore = new AtomicInteger(0);
			AtomicInteger highestScore = new AtomicInteger(0);
			Map<String, Integer> highestScorer = new HashMap<>();
			System.out.println("Scores by Players");
			listOfScore.forEach(s -> {
				String scorer = s.split("-")[0];
				Integer scorr = Integer.parseInt(s.split("-")[1].toString());
				System.out.println(scorer + " : " + scorr);
				totalScore.getAndAdd(scorr);
				if (highestScore.get() < scorr) {
					highestScore.getAndSet(scorr);
					highestScorer.clear();
					highestScorer.put(scorer, scorr);
				}
			});

			System.out.println("Total Score : " + totalScore);
			System.out.println("Name of Highest Scorer : " + highestScorer.entrySet().stream().map(entry -> {
				return entry.getKey();
			}).collect(Collectors.toList()).get(0));
			sc.close();
		}
	}


