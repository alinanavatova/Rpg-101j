package players;

import General.Rpg_game;

public class Thor extends Hero {
    public Thor(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.STUNNING);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int number = Rpg_game.random.nextInt(2);
        if (number == 1){
            boss.setDamage(0);
        }else {
            boss.setDamage(boss.getDamage());
        }
    }
}
