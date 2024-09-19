package vydrenkova.internship.models.heroes;

import vydrenkova.internship.interfaces.Mortal;
import vydrenkova.internship.models.enemies.Enemy;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
