package multiobjective;

import java.util.HashSet;

import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;
import org.moeaframework.core.variable.EncodingUtils;

public class PlayerSelection implements Problem {

	public String getName() {
		return "Player Selection";
	}

	public int getNumberOfVariables() {
		return 10;
	}

	public int getNumberOfObjectives() {
		return 3;
	}

	public int getNumberOfConstraints() {
		// TODO Auto-generated method stub
		return 4;
	}

	public void evaluate(Solution solution) {
		int team[] = EncodingUtils.getInt(solution);
		int wicketKeeper = 0;
		int foreignPlayers=0;
		int ballers = 0;
		double f1 = 0.0;
		double f2 = 0.0;
		double f3 = 0.0;
		HashSet<Integer> t = new HashSet<Integer>();
		for(int i = 0 ; i < team.length ; i++) {
			t.add(team[i]);
			Player p = DataReader.PLAYERS.get(team[i]);
			if(p.isBatsman == 1) {
				f1 += p.battingFitness;
			}
			if(p.isBaller == 1) {
				f2 += p.ballingFitness;
				ballers++;
			}
			if(p.isBaller == 0) {
				f2 += 100;
			}
			if(p.isWicketKeeper == 1) {
				wicketKeeper++;
			}
			if(p.isOutsider == 1) {
				foreignPlayers++;
			}
			f3 += p.fielderFitness;
		}
		solution.setObjective(0, -f1);
		solution.setObjective(1, f2);
		solution.setObjective(2, -f3);
		
		double c0 = (wicketKeeper >= 1) ? 0 : Math.abs(wicketKeeper - 1);
		double c1 = (t.size() == 10)? 0 : Math.abs(t.size() - 10);
		double c2 = (foreignPlayers <= 4) ? 0 : foreignPlayers - 4 ;
		double c3 = (ballers >= 5) ? 0 : 5 - ballers;
		
		solution.setConstraint(0, c0);
		solution.setConstraint(1, c1);
		solution.setConstraint(2, c2);
		solution.setConstraint(3, c3);			
	}

	public Solution newSolution() {
		// TODO Auto-generated method stub
		Solution solution = new Solution(getNumberOfVariables() , getNumberOfObjectives() , getNumberOfConstraints());
		for(int i = 0 ; i < getNumberOfVariables() ; i++) {
			solution.setVariable(i, EncodingUtils.newInt(0, DataReader.TOTAL_PLAYERS-1));
		}
		return solution;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}



//public class PlayerSelection implements Problem {
//
//	public String getName() {
//		return "Player Selection";
//	}
//
//	public int getNumberOfVariables() {
//		return 10;
//	}
//
//	public int getNumberOfObjectives() {
//		return 2;
//	}
//
//	public int getNumberOfConstraints() {
//		// TODO Auto-generated method stub
//		return 4;
//	}
//
//	public void evaluate(Solution solution) {
//		int team[] = EncodingUtils.getInt(solution);
//		int wicketKeeper = 0;
//		int foreignPlayers=0;
//		int ballers = 0;
//		double f1 = 0.0;
//		double f2 = 0.0;
//		//double f3 = 0.0;
//		HashSet<Integer> t = new HashSet<Integer>();
//		for(int i = 0 ; i < team.length ; i++) {
//			t.add(team[i]);
//			Player p = DataReader.PLAYERS.get(team[i]);
//			if(p.isBatsman == 1 && p.totalRuns >= 300) {
//				f1 += p.battingFitness;
//			}
//			if(p.isBaller == 1 && p.wickets >= 20) {
//				f2 += p.ballingFitness;
//				ballers++;
//			}
//			if(p.isBaller == 0 || (p.isBaller == 1 && p.wickets < 20)) {
//				f2 += 100;
//			}
//			if(p.isWicketKeeper == 1) {
//				wicketKeeper++;
//			}
//			if(p.isOutsider == 1) {
//				foreignPlayers++;
//			}
//		}
//		solution.setObjective(0, -f1);
//		solution.setObjective(1, f2);
//		
//		double c0 = (wicketKeeper >= 1) ? 0 : Math.abs(wicketKeeper - 1);
//		double c1 = (t.size() == 10)? 0 : Math.abs(t.size() - 10);
//		double c2 = (foreignPlayers <= 4) ? 0 : foreignPlayers - 4 ;
//		double c3 = (ballers >= 5) ? 0 : 5 - ballers;
//		
//		solution.setConstraint(0, c0);
//		solution.setConstraint(1, c1);
//		solution.setConstraint(2, c2);
//		solution.setConstraint(3, c3);			
//	}
//
//	public Solution newSolution() {
//		// TODO Auto-generated method stub
//		Solution solution = new Solution(getNumberOfVariables() , getNumberOfObjectives() , getNumberOfConstraints());
//		for(int i = 0 ; i < getNumberOfVariables() ; i++) {
//			solution.setVariable(i, EncodingUtils.newInt(0, DataReader.TOTAL_PLAYERS-1));
//		}
//		return solution;
//	}
//
//	public void close() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
//public class PlayerSelection implements Problem {
//
//	public String getName() {
//		return "Player Selection";
//	}
//
//	public int getNumberOfVariables() {
//		return 10;
//	}
//
//	public int getNumberOfObjectives() {
//		return 2;
//	}
//
//	public int getNumberOfConstraints() {
//		// TODO Auto-generated method stub
//		return 4;
//	}
//
//	public void evaluate(Solution solution) {
//		int team[] = EncodingUtils.getInt(solution);
//		int wicketKeeper = 0;
//		int foreignPlayers=0;
//		int ballers = 0;
//		double f1 = 0.0;
//		double f2 = 0.0;
//		//double f3 = 0.0;
//		HashSet<Integer> t = new HashSet<Integer>();
//		for(int i = 0 ; i < team.length ; i++) {
//			t.add(team[i]);
//			Player p = DataReader.PLAYERS.get(team[i]);
//			if(p.isBatsman == 1) {
//				f1 += p.battingFitness;
//			}
//			if(p.isBaller == 1) {
//				f2 += p.ballingFitness;
//				ballers++;
//			}
////			if(p.isBaller == 0 || (p.isBaller == 1 && p.wickets < 20)) {
////				f2 += 100;
////			}
//			if(p.isWicketKeeper == 1) {
//				wicketKeeper++;
//			}
//			if(p.isOutsider == 1) {
//				foreignPlayers++;
//			}
//		}
//		solution.setObjective(0, -f1);
//		solution.setObjective(1, f2);
//		
//		double c0 = (wicketKeeper >= 1) ? 0 : Math.abs(wicketKeeper - 1);
//		double c1 = (t.size() == 10)? 0 : Math.abs(t.size() - 10);
//		double c2 = (foreignPlayers <= 4) ? 0 : foreignPlayers - 4 ;
//		double c3 = (ballers >= 5) ? 0 : 5 - ballers;
//		
//		solution.setConstraint(0, c0);
//		solution.setConstraint(1, c1);
//		solution.setConstraint(2, c2);
//		solution.setConstraint(3, c3);			
//	}
//
//	public Solution newSolution() {
//		// TODO Auto-generated method stub
//		Solution solution = new Solution(getNumberOfVariables() , getNumberOfObjectives() , getNumberOfConstraints());
//		for(int i = 0 ; i < getNumberOfVariables() ; i++) {
//			solution.setVariable(i, EncodingUtils.newInt(0, DataReader.TOTAL_PLAYERS-1));
//		}
//		return solution;
//	}
//
//	public void close() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
