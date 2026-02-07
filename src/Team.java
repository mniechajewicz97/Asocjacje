import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> teamList = new ArrayList<>();

    public List<Player> getTeam() {
        return List.copyOf(teamList);
    }

    public int sumScore() {
        int score = 0;
        for (Player player : teamList) {
            score += player.getScore();
        }
        return score;
    }

    public void addPlayer(Player player) {
        this.teamList.add(player);
    }

    public void removePlayer(Player player) {
        this.teamList.remove(player);
    }

    public int theBestScore() {
        int maxScore = 0;
        for (Player player : teamList) {
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
            }
        }
        return maxScore;

    }
    public Player getBestPlayer() {
        Player best = null;
        for (Player player : teamList) {
            if (best == null || player.getScore() > best.getScore()) {
                best = player;
            }
        }
        return best;
    }


}
