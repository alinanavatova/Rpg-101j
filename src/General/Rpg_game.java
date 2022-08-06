package General;

import players.*;

import java.util.Random;

public class Rpg_game {
    public static int roundNumber;
    public static Random random = new Random();

    public static void start(){
        Boss boss = new Boss(2000, 200);
        Warrior warrior = new Warrior(270, 15, "Warrior");
        Medic doc = new Medic(220, 5, "Doc", 15);
        Medic assistant = new Medic(250, 10, "Assistant", 5);
        Magic magic = new Magic(240, 20, "Magic");
        Berserk berserk = new Berserk(300, 20, "Berserk");
        Thor thor = new Thor(250, 15, "Thor");
        Golem golem = new Golem(500, 5, "Golem");
        Witcher witcher = new Witcher(300, 0, "Witcher");
        Avrora avrora = new Avrora(200, 15, "Avrora");
        Hacker hacker = new Hacker(180, 10, "Hacker");
        TrickyBastard trickyBastard = new TrickyBastard(170, 15, "TrickyBastard");
        Antman antman = new Antman(200, 20, "Antman");

        Hero heroes[] = {warrior, doc, assistant, magic, berserk, thor, golem, witcher, avrora, hacker, trickyBastard, antman};

        printStatistics(heroes,boss);

        while (! isGameFinished(heroes, boss)){
            round(heroes, boss);
        }

    }

    private static void round(Hero[] heroes, Boss boss){
        roundNumber++;
        bossHits(heroes, boss);
        heroesHit(heroes, boss);
        applySuperAbility(heroes, boss);
        printStatistics(heroes, boss);
    }

    private static void printStatistics(Hero[] heroes, Boss boss){
        System.out.println("********** ROUND " + roundNumber + " ***********");
        System.out.println("Boss health: " + boss.getHealth()
                + "[ " + boss.getDamage() + " ]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName() + " health: " + heroes[i].getHealth()
                    + "[ " + heroes[i].getDamage() + " ]");

        }

    }

    private static void bossHits(Hero[] heroes, Boss boss){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
            }
        }
    }

    private static void heroesHit(Hero heroes[], Boss boss){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }

    private static void applySuperAbility(Hero[] heroes, Boss boss){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].applySuperAbility(heroes,boss);
            }
        }
    }
    private static boolean isGameFinished(Hero[] heroes, Boss boss){
        if (boss.getHealth() <= 0){
            System.out.println("Heroes won!");
            return true;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 ){
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead){
            System.out.println("Boss won!");
        }
        return allHeroesDead;
    }
}
