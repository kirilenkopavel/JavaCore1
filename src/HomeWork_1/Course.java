package HomeWork_1;

public class Course {
    private int[] distances = new int[3];

    public Course(int d1, int d2, int d3) {
        distances[0] = d1;
        distances[1] = d2;
        distances[2] = d3;
    }

    public void doIt(Team team) {
        for(Player player : team.arrPlayer) {
            for (int distance : distances) {
                if(player.getRunMax() >= distance) {
                    player.isWin = true;
                } else {
                    player.isWin = false;
                    break;
                }
            }
        }
    }
}
