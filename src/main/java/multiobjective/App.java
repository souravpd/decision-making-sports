package multiobjective;

import java.io.IOException;
import java.util.ArrayList;	

import org.moeaframework.Executor;
import org.moeaframework.core.*;

public class App {
	
	public static void main(String args[]) throws IOException {
		
		DataReader.generatePlayers();		 
		
		NondominatedPopulation resultNSGA = new Executor()
				.withProblemClass(PlayerSelection.class)
				.withAlgorithm("NSGAII")
				.withMaxEvaluations(100000)
				.distributeOnAllCores()
				.run();
		
		ArrayList<Node> NSGAValues = new ArrayList<Node>();
		System.out.println("NSGA - II");
		for(Solution solution : resultNSGA) {
			if(!solution.violatesConstraints()) {
				DataWriter.reporter(solution);
				NSGAValues.add(new Node(solution.getObjective(0) ,solution.getObjective(1) , solution.getObjective(2)));				
			}
		}
		
		System.out.println();
		
		print(NSGAValues);
		
		
		NondominatedPopulation resultGDE3 = new Executor()
				.withProblemClass(PlayerSelection.class)
				.withAlgorithm("GDE3")
				.withMaxEvaluations(100000)
				.distributeOnAllCores()
				.run();
		
		ArrayList<Node> GDE3Values = new ArrayList<Node>();
		System.out.println("GDE3");
		for(Solution solution : resultGDE3) {
			if(!solution.violatesConstraints()) {
				GDE3Values.add(new Node(solution.getObjective(0) ,solution.getObjective(1) , solution.getObjective(2)));
				DataWriter.reporter(solution);
			}
		}
		print(GDE3Values);
		
		
		
		NondominatedPopulation resultSMPSO = new Executor()
				.withProblemClass(PlayerSelection.class)
				.withAlgorithm("SPEA2")
				.withMaxEvaluations(100000)
				.distributeOnAllCores()
				.run();
		
		ArrayList<Node> SMPSOValues = new ArrayList<Node>();
		System.out.println("SMPSO");
		for(Solution solution : resultSMPSO) {
			if(!solution.violatesConstraints()) {
				SMPSOValues.add(new Node(solution.getObjective(0) ,solution.getObjective(1) , solution.getObjective(2)));
				DataWriter.reporter(solution);
			}
		}
		print(SMPSOValues);
		
	}

	private static void print(ArrayList<Node> NSGAValues) {
		for(Node n : NSGAValues) {
			System.out.println(n);	
		}
	}
}
