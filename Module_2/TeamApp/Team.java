package Module_2.TeamApp;

public class Team {
    private String teamName;
    private String[] players = new String[20];
    private int playerCount = 0;

    public Team(String teamName, String[] players, int playerCount) {
        this.teamName = teamName;
        this.players = players;
        this.playerCount = playerCount;
    }

    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    }

    public String [] getPlayers() {
        return players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public String getTeamName() {
        return teamName;
    }
}
