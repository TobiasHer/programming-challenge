package dataClasses;

public class FootballDataSet {
	private String team;
	private int games, wins, losses, draws, goals, allowedGoals, points;
	
    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return this.games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAllowedGoals() {
        return this.allowedGoals;
    }

    public void setAllowedGoals(int allowedGoals) {
        this.allowedGoals = allowedGoals;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    @Override 
	public String toString()
	{
		return "TeamDataSet [team=" + team +
				", games=" + games + 
				", wins=" + wins + 
				", losses=" + losses + 
				", draws=" + draws + 
				", goals=" + goals +
				", allowedGoals=" + allowedGoals +
				", points=" + points +
				"]";
	}

}
