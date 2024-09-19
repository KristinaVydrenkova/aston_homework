package vydrenkova.internship.models.heroes;

import vydrenkova.internship.models.enemies.Enemy;
import vydrenkova.internship.utils.GameUtils;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer is shooting a bow");
        enemy.takeDamage(GameUtils.archerDamage);
    }
}
