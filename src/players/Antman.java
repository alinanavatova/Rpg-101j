package players;

import General.Rpg_game;

public class Antman extends Hero {

    public Antman(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.CHANGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int number = Rpg_game.random.nextInt(2);
        if (number == 1){
            this.setHealth(this.getHealth() + 70);
            this.setDamage(this.getDamage() + 10);
        }else {
            this.setHealth(this.getHealth() - 70);
            this.setDamage(this.getDamage() - 10);
        }
    }
}
