package multiobjective;

import org.moeaframework.core.Solution;
import org.moeaframework.core.variable.EncodingUtils;

public class DataWriter {
	public static void reporter(Solution solution) {
		int team[] = EncodingUtils.getInt(solution);
		String leftAlignFormat = "| %-30s | %-15s | %-15s |%n";
		System.out.format("+----------------------------------+---------------+---------------------+%n");
		System.out.format("| Player Name                      | Player Role   | Player Natn         |%n");
		System.out.format("+----------------------------------+---------------+---------------------+%n");
		for (int i = 0; i < team.length; i++) {
			Player p = DataReader.PLAYERS.get(team[i]);
			String third = "";
			if(p.isOutsider == 1) {
				third = "International";
			}else {
				third = "National";	
			}
			StringBuilder sb = new StringBuilder();
			if(p.isBaller == 1) {	
				sb.append("/BALL");
			}
			if(p.isBatsman == 1) {
				sb.append("/BAT");
			}
			if(p.isWicketKeeper == 1) {
				sb.append("/WKT");
			}
		    System.out.format(leftAlignFormat,p.playerName,sb.toString(),third);		
		}
		System.out.format("+----------------------------------+----------------------------------+----------------------------------+%n");
		System.out.println("Batting Fitness  "+ solution.getObjective(0));
		System.out.println("Balling Fitness  "+ solution.getObjective(1));
		System.out.println("Fileding Fitness "+ solution.getObjective(2));
		System.out.println();
	}
}
