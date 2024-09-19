package vydrenkova.internship.models.enemies;

import vydrenkova.internship.interfaces.Mortal;
import vydrenkova.internship.models.heroes.Hero;

public abstract class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public abstract void attackHero(Hero hero);
}
