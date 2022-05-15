package HomeWork_1;

import java.util.Arrays;

public class Team {

    private String nameTeam;
    Player[] arrPlayer = new Player[5];

    public Team(String nameTeam, Player player1, Player player2, Player player3, Player player4, Player player5) {
        this.nameTeam = nameTeam;
        arrPlayer[0] = player1;
        arrPlayer[1] = player2;
        arrPlayer[2] = player3;
        arrPlayer[3] = player4;
        arrPlayer[4] = player5;
    }

    public void infoTeam() {
        for(Player player : arrPlayer) {
            System.out.println(player);
        }
    }

    public void infoTeamWin() {
        for(Player player : arrPlayer) {
            if(player.isWin) {
                System.out.println(player);
            }
        }
    }
}
