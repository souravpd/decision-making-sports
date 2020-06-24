package multiobjective;

public class Node {
	double battingFitness;
	double ballingFitness;
	double fieldingFitness;
	public Node(double battingFitness, double ballingFitness, double fieldingFitness) {
		super();
		this.battingFitness = battingFitness;
		this.ballingFitness = ballingFitness;
		this.fieldingFitness = fieldingFitness;
	}
	public double getBattingFitness() {
		return battingFitness;
	}
	public void setBattingFitness(double battingFitness) {
		this.battingFitness = battingFitness;
	}
	public double getBallingFitness() {
		return ballingFitness;
	}
	public void setBallingFitness(double ballingFitness) {
		this.ballingFitness = ballingFitness;
	}
	public double getFieldingFitness() {
		return fieldingFitness;
	}
	public void setFieldingFitness(double fieldingFitness) {
		this.fieldingFitness = fieldingFitness;
	}
	
	public String toString() {
		return this.battingFitness + "," + this.ballingFitness + "," + this.fieldingFitness	;	 
	}
	
}
