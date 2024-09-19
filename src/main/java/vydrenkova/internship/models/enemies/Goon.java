package vydrenkova.internship.models.enemies;

import vydrenkova.internship.models.heroes.Hero;
import vydrenkova.internship.utils.GameUtils;

public class Goon extends Enemy {
    public Goon(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Goon punches");
        hero.takeDamage(GameUtils.goonDamage);
    }
}
