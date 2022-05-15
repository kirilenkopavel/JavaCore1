package HomeWork_1;

/**
 * Java Core
 *@author Pavel Kirilenko
 *@version 13.05.2022
 */

public class Competition {

    public static void main(String[] args) {

        Player player1 = new Player("Vasia", 400);
        Player player2 = new Player("Petya", 500);
        Player player3 = new Player("Dima", 300);
        Player player4 = new Player("Egor", 350);
        Player player5 = new Player("Yascha", 480);

        Team team = new Team("QA", player1, player2, player3, player4, player5);
        Course course = new Course(300, 400, 500);

        team.infoTeam();

        course.doIt(team);

        team.infoTeamWin();
    }
}
