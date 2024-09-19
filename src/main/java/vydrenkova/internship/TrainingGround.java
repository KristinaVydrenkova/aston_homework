package vydrenkova.internship;

import vydrenkova.internship.models.enemies.Enemy;
import vydrenkova.internship.models.enemies.Goon;
import vydrenkova.internship.models.enemies.Witch;
import vydrenkova.internship.models.enemies.Zombie;
import vydrenkova.internship.models.heroes.Archer;
import vydrenkova.internship.models.heroes.Mage;
import vydrenkova.internship.models.heroes.Warrior;
import vydrenkova.internship.utils.GameUtils;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy goon = new Goon("Goon", GameUtils.startingHealth);
        Enemy witch = new Witch("Witch", GameUtils.startingHealth);
        Enemy zombie = new Zombie("Zombie", GameUtils.startingHealth);

        Warrior warrior = new Warrior("Wilson", GameUtils.startingHealth);
        warrior.attackEnemy(goon);

        Mage mage = new Mage("Mike", GameUtils.startingHealth);
        mage.attackEnemy(witch);

        Archer archer = new Archer("Archie", GameUtils.startingHealth);
        archer.attackEnemy(zombie);

    }
}
