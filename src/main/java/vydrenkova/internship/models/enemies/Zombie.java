package vydrenkova.internship.models.enemies;

import vydrenkova.internship.models.heroes.Hero;
import vydrenkova.internship.utils.GameUtils;

public class Zombie extends Enemy {
    private int lifeCount;

    public Zombie(String name, int health) {
        super(name, health);
        this.lifeCount = GameUtils.zombieLivesAmount;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        if (this.getHealth() < 0) {
            lifeCount--;
            this.setHealth(GameUtils.startingHealth);
        }
    }

    @Override
    public boolean isAlive() {
        return lifeCount > 0;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie bites");
        hero.takeDamage(GameUtils.zombieDamage);
    }
}
