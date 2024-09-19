package vydrenkova.internship.utils;

public class GameUtils {
    public final static int startingHealth = 100;
    public final static int archerDamage = 50;
    public final static int warriorDamage = 20;
    public final static int mageDamage = 30;
    public final static int goonDamage = 30;
    public final static int witchDamage = 50;
    public final static int zombieDamage = 20;
    public final static int zombieLivesAmount = 2;

    public static void isAliveMessage(String name, boolean isAlive) {
        if (isAlive) {
            System.out.println(name + " is still alive");
        } else {
            System.out.println(name + " is dead");
        }
    }

}
