package vydrenkova.internship.models.heroes;

import vydrenkova.internship.models.enemies.Enemy;
import vydrenkova.internship.utils.GameUtils;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage is casting a spell");
        enemy.takeDamage(GameUtils.mageDamage);
    }
}
