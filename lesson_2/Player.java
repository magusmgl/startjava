public class Player {
    private String name;
    private int number;
    private boolean isTurnGuessNum = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean getTurnGuessNum() {
        return isTurnGuessNum;
    }

    public void setTurnGuessNum(boolean isTurnGuessNum) {
        this.isTurnGuessNum = isTurnGuessNum;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
}