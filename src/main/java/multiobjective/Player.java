package multiobjective;

public class Player{
	public int id;
	public String playerName;
	public int isBatsman;
	public int isBaller;
	public int isWicketKeeper;
	public int isOutsider;
	public int matches;
	public int ins;
	public int notOut;
	public int totalRuns;
	public int catchTaken;
	public int runOut;
	public int stumped;
	public int ballsBowled;
	public int runsGiven;
	public int wickets;
	public double battingFitness;
	public double ballingFitness;
	public double fielderFitness;
	public double wicketkeeperFitness;		
	
	public Player(int id, String playerName, int isBatsman, int isBaller, int isWicketKeeper, int isOutsider,
			int matches, int ins, int notOut, int totalRuns, int catchTaken, int runOut, int stumped, int ballsBowled,
			int runsGiven, int wickets, double battingFitness, double ballingFitness, double fielderFitness,
			double wicketkeeperFitness) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.isBatsman = isBatsman;
		this.isBaller = isBaller;
		this.isWicketKeeper = isWicketKeeper;
		this.isOutsider = isOutsider;
		this.matches = matches;
		this.ins = ins;
		this.notOut = notOut;
		this.totalRuns = totalRuns;
		this.catchTaken = catchTaken;
		this.runOut = runOut;
		this.stumped = stumped;
		this.ballsBowled = ballsBowled;
		this.runsGiven = runsGiven;
		this.wickets = wickets;
		this.battingFitness = battingFitness;
		this.ballingFitness = ballingFitness;
		this.fielderFitness = fielderFitness;
		this.wicketkeeperFitness = wicketkeeperFitness;
	}

	public Player(int index, String line) {
		String components[] = line.split(",");
		this.id = Integer.parseInt(components[0]);
		this.playerName = components[1];
		this.isBatsman = Integer.parseInt(components[2]);
		this.isBaller = Integer.parseInt(components[3]);
		this.isWicketKeeper = Integer.parseInt(components[4]);
		this.isOutsider = Integer.parseInt(components[5]);
		this.matches = Integer.parseInt(components[6]);
		this.ins = Integer.parseInt(components[7]);
		this.notOut = Integer.parseInt(components[8]);
		this.totalRuns = Integer.parseInt(components[9]);
		this.catchTaken = Integer.parseInt(components[10]);
		this.runOut = Integer.parseInt(components[11]);
		this.stumped = Integer.parseInt(components[12]);
		this.ballsBowled = Integer.parseInt(components[13]);
		this.runsGiven = Integer.parseInt(components[14]);
		this.wickets = Integer.parseInt(components[15]);
		this.battingFitness = Double.parseDouble(components[16]);
		this.ballingFitness = Double.parseDouble(components[17]);
		this.fielderFitness = Double.parseDouble(components[18]);
		this.wicketkeeperFitness = Double.parseDouble(components[19]);		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getIsBatsman() {
		return isBatsman;
	}

	public void setIsBatsman(int isBatsman) {
		this.isBatsman = isBatsman;
	}

	public int getIsBaller() {
		return isBaller;
	}

	public void setIsBaller(int isBaller) {
		this.isBaller = isBaller;
	}

	public int getIsWicketKeeper() {
		return isWicketKeeper;
	}

	public void setIsWicketKeeper(int isWicketKeeper) {
		this.isWicketKeeper = isWicketKeeper;
	}

	public int getIsOutsider() {
		return isOutsider;
	}

	public void setIsOutsider(int isOutsider) {
		this.isOutsider = isOutsider;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getIns() {
		return ins;
	}

	public void setIns(int ins) {
		this.ins = ins;
	}

	public int getNotOut() {
		return notOut;
	}

	public void setNotOut(int notOut) {
		this.notOut = notOut;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getCatchTaken() {
		return catchTaken;
	}

	public void setCatchTaken(int catchTaken) {
		this.catchTaken = catchTaken;
	}

	public int getRunOut() {
		return runOut;
	}

	public void setRunOut(int runOut) {
		this.runOut = runOut;
	}

	public int getStumped() {
		return stumped;
	}

	public void setStumped(int stumped) {
		this.stumped = stumped;
	}

	public int getBallsBowled() {
		return ballsBowled;
	}

	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled = ballsBowled;
	}

	public int getRunsGiven() {
		return runsGiven;
	}

	public void setRunsGiven(int runsGiven) {
		this.runsGiven = runsGiven;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
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

	public double getFielderFitness() {
		return fielderFitness;
	}

	public void setFielderFitness(double fielderFitness) {
		this.fielderFitness = fielderFitness;
	}

	public double getWicketkeeperFitness() {
		return wicketkeeperFitness;
	}

	public void setWicketkeeperFitness(double wicketkeeperFitness) {
		this.wicketkeeperFitness = wicketkeeperFitness;
	}
	
}


