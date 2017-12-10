package P2_L6_CLASSES;

public class Enemy {
    static int aLive;
    private String name;

    public Enemy(String name) {
        this.name = name;

        aLive = aLive + 1;
    }

    public void dy() {
        aLive = aLive - 1;
    }

    public String getName() {
        return name;
    }

}
