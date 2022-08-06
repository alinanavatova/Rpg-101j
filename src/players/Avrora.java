package players;

import General.Rpg_game;

public class Avrora extends Hero {
    public Avrora(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.INVISIBILITY);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        if (Rpg_game.roundNumber == 1 / 2){
            this.setHealth(this.getHealth() + boss.getDamage());
        }
        if (Rpg_game.roundNumber == 3 / 4){
            this.setDamage(this.getHealth() + boss.getDamage());
        }
    }
}
