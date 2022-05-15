package HomeWork_1;

public class Player {

    private String name;
    private int runMax;
    protected boolean isWin;

    public Player(String name, int runMax) {
        this.name = name;
        this.runMax = runMax;
        isWin = false;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runMax=" + runMax +
                ", isWin=" + isWin +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunMax() {
        return runMax;
    }

    public void setRunMax(int runMax) {
        this.runMax = runMax;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }
}
