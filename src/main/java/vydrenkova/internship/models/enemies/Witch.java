package vydrenkova.internship.models.enemies;

import vydrenkova.internship.models.heroes.Hero;
import vydrenkova.internship.utils.GameUtils;

public class Witch extends Enemy {
    public Witch(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Witch strikes with lightning");
        hero.takeDamage(GameUtils.witchDamage);
    }
}
