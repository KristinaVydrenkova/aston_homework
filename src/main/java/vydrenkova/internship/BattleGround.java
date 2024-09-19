package vydrenkova.internship;

import vydrenkova.internship.models.enemies.Enemy;
import vydrenkova.internship.models.enemies.Goon;
import vydrenkova.internship.models.enemies.Witch;
import vydrenkova.internship.models.enemies.Zombie;
import vydrenkova.internship.models.heroes.Archer;
import vydrenkova.internship.models.heroes.Hero;
import vydrenkova.internship.models.heroes.Mage;
import vydrenkova.internship.models.heroes.Warrior;
import vydrenkova.internship.utils.GameUtils;

public class BattleGround {
    public static void main(String[] args) {
        //создаем трех героев
        Hero warrior = new Warrior("Warrior", GameUtils.startingHealth);
        Hero mage = new Mage("Mage", GameUtils.startingHealth);
        Hero archer = new Archer("Archer", GameUtils.startingHealth);

        //создаем трех врагов
        Enemy goon = new Goon("Goon", GameUtils.startingHealth);
        Enemy witch = new Witch("Witch", GameUtils.startingHealth);
        Enemy zombie = new Zombie("Zombie", GameUtils.startingHealth);

        // первый раунд: герои атакуют врагов
        heroesRound(warrior, mage, archer, goon, witch, zombie);

        // первый раунд: враги атакуют героев
        enemiesRound(goon, witch, zombie, warrior, mage, archer);

        // второй раунд: герои атакуют врагов
        heroesRound(warrior, mage, archer, witch, zombie, goon);

        //второй раунд: враги атакуют героев
        enemiesRound(witch, zombie, goon, warrior, mage, archer);

        //третий раунд: герои атакуют врагов
        heroesRound(warrior, mage, archer, zombie, goon, witch);

    }

    //метод для атаки героев в одном раунде
    //аргументы - порядок, в котором герои атакуют врагов
    public static void heroesRound(Hero hero1, Hero hero2, Hero hero3, Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        hero1.attackEnemy(enemy1);
        GameUtils.isAliveMessage(enemy1.getName(), enemy1.isAlive());

        hero2.attackEnemy(enemy2);
        GameUtils.isAliveMessage(enemy2.getName(), enemy2.isAlive());

        hero3.attackEnemy(enemy3);
        GameUtils.isAliveMessage(enemy3.getName(), enemy3.isAlive());
    }

    //такой же метод для атаки врагов
    public static void enemiesRound(Enemy enemy1, Enemy enemy2, Enemy enemy3, Hero hero1, Hero hero2, Hero hero3) {
        enemy1.attackHero(hero1);
        GameUtils.isAliveMessage(hero1.getName(), hero1.isAlive());

        enemy2.attackHero(hero2);
        GameUtils.isAliveMessage(hero2.getName(), hero2.isAlive());

        enemy3.attackHero(hero3);
        GameUtils.isAliveMessage(hero3.getName(), hero3.isAlive());
    }

}
