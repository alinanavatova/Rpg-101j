package players;

import General.Rpg_game;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.TAKE_HEALTH);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i].getName() != this.getName() && this.getHealth() > 0){
                boss.setHealth(boss.getHealth() - 50);
                heroes[i].setHealth(heroes[i].getHealth() + 50);
            }
        }
    }
}
