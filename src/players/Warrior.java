package players;

import General.Rpg_game;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int number = Rpg_game.random.nextInt(4)+2;
        this.setDamage(this.getDamage()*number);

    }
}
