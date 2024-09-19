package vydrenkova.internship.models.heroes;

import vydrenkova.internship.models.enemies.Enemy;
import vydrenkova.internship.utils.GameUtils;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior is fighting");
        enemy.takeDamage(GameUtils.warriorDamage);
    }
}
