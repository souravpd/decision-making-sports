package multiobjective;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.moeaframework.Executor;
import org.moeaframework.core.*;

public class App {
	
	public static void main(String args[]) throws IOException {
		
	DataReader.generatePlayers();		 
//		
//		NondominatedPopulation resultNSGA = new Executor()
//				.withProblemClass(PlayerSelection.class)
//				.withAlgorithm("NSGAII")
//				.withProperty("populationSize", 400)
//				.withMaxEvaluations(100000)
//				.distributeOnAllCores()
//				.run();
//		
//		ArrayList<Node> NSGAValues = new ArrayList<Node>();
//		System.out.println("NSGA - II");
//		for(Solution solution : resultNSGA) {
//			if(!solution.violatesConstraints()) {
//				DataWriter.reporter(solution);
//				NSGAValues.add(new Node(solution.getObjective(0) ,solution.getObjective(1) , solution.getObjective(2)));				
//			}
//		}
//		
//		System.out.println();
//		
//		print(NSGAValues);
		
		
//		NondominatedPopulation resultGDE3 = new Executor()
//				.withProblemClass(PlayerSelection.class)
//				.withAlgorithm("GDE3")
//				.withProperty("populationSize", 400)
//				.withMaxEvaluations(100000)
//				.distributeOnAllCores()
//				.run();
//		
//		ArrayList<Node> GDE3Values = new ArrayList<Node>();
//		System.out.println("GDE3");
//		for(Solution solution : resultGDE3) {
//			if(!solution.violatesConstraints()) {
//				GDE3Values.add(new Node(solution.getObjective(0) ,solution.getObjective(1) , solution.getObjective(2)));
//				DataWriter.reporter(solution);
//			}
//		}
//		print(GDE3Values);
		
		
		
		NondominatedPopulation resultSMPSO = new Executor()
				.withProblemClass(PlayerSelection.class)
				.withAlgorithm("SMPSO")
				.withProperty("populationSize", 400)
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
		
	
//		/**
//		 * These are the Functions with 2 objectives
//		 * 
//		 */
//		
//		
//		NondominatedPopulation resultNSGA = new Executor()
//				.withProblemClass(PlayerSelection.class)
//				.withAlgorithm("NSGAII")
//				.withProperty("populationSize",100)
//				.withMaxEvaluations(90000)
//				.distributeOnAllCores()
//				.run();
//		
//		ArrayList<Node> NSGAValues = new ArrayList<Node>();
//		System.out.println("NSGA - II");
//		for(Solution solution : resultNSGA) {
//			if(!solution.violatesConstraints()) {
//				DataWriter.reporter(solution);
//				NSGAValues.add(new Node(solution.getObjective(0) ,solution.getObjective(1)));				
//			}
//		}
//		
//		System.out.println();
//		
//		print(NSGAValues);
//
//
////		NondominatedPopulation resultGDE3 = new Executor()
////				.withProblemClass(PlayerSelection.class)
////				.withAlgorithm("GDE3")
////				.withProperty("populationSize", 400)
////				.withMaxEvaluations(100000)
////				.distributeOnAllCores()
////				.run();
////		
////		ArrayList<Node> GDE3Values = new ArrayList<Node>();
////		System.out.println("GDE3");
////		for(Solution solution : resultGDE3) {
////			if(!solution.violatesConstraints()) {
////				GDE3Values.add(new Node(solution.getObjective(0) ,solution.getObjective(1)));
////				DataWriter.reporter(solution);
////			}
////		}
////		print(GDE3Values);
//
//
//////
////		NondominatedPopulation resultSMPSO = new Executor()
////				.withProblemClass(PlayerSelection.class)
////				.withAlgorithm("SMPSO")
////				.withProperty("populationSize", 400)
////				.withMaxEvaluations(100000)
////				.distributeOnAllCores()
////				.run();
////		
////		ArrayList<Node> SMPSOValues = new ArrayList<Node>();
////		System.out.println("SMPSO");
////		for(Solution solution : resultSMPSO) {
////			if(!solution.violatesConstraints()) {
////				SMPSOValues.add(new Node(solution.getObjective(0) ,solution.getObjective(1)));
////				DataWriter.reporter(solution);
////			}
////		}
////		print(SMPSOValues);
//		
	}

	private static void print(ArrayList<Node> NSGAValues) {
		for(Node n : NSGAValues) {
			System.out.println(n);	
		}
	}
}

//public class App extends JFrame{
//	
//	public App()	{
//		super("Spark IIT Roorkee");
//		XYDataset dataset = createDataset();
//		JFreeChart chart = ChartFactory.createScatterPlot(
//		        "Comparsion of Evolutionary Algorithms for Decision Making in Sports", 
//		        "Balling Fitness", "Batting Fitness", dataset, PlotOrientation.VERTICAL, true, true, false);
//
//		    
//		    //Changes background color
//		    XYPlot plot = (XYPlot)chart.getPlot();
//		    plot.setBackgroundPaint(new Color(255,228,196));
//		    
//		   
//		    // Create Panel
//		    ChartPanel panel = new ChartPanel(chart);
//		    setContentPane(panel);
//		
//	}
//	
//	private XYDataset createDataset(){
//		XYSeriesCollection dataset = new XYSeriesCollection();
//		XYSeries nsga2 = new XYSeries("NSGA-II");
//		nsga2.add(129.81,-175.93);
//		nsga2.add(192.01,-238.15);
//		nsga2.add(133.39,-204.06);
//		nsga2.add(159.05,-228.5);
//		nsga2.add(147.23999999999998,-227.83999999999997);
//		nsga2.add(131.6,-179.27);
//		nsga2.add(150.94,-227.84);
//		dataset.addSeries(nsga2);
//		
////		XYSeries gde3 = new XYSeries("GDE3");
////		gde3.add(643.00,-228.00);
////		gde3.add(494.40,-185.90);
////		gde3.add(570.00,-213.71);
////		gde3.add(566.90,-199.75);
////		dataset.addSeries(gde3);
////		
////		
////		XYSeries smpso = new XYSeries("SMPSO");
////		smpso.add(494.38,-150.99);
////		smpso.add(569.95,-191.71);
////		smpso.add(494.38,-185.62);
////		smpso.add(650.94,-205.84);
////		dataset.addSeries(smpso);		
//		return dataset;
//	}
//
//	public static void main(String args[]) throws IOException {
//		
//		DataReader.generatePlayers();
//		
//		SwingUtilities.invokeLater(() -> {
//		      App example = new App();
//		      example.setSize(800, 400);
//		      example.setLocationRelativeTo(null);
//		      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		      example.setVisible(true);
//		    });		
//		
//	}
//}
