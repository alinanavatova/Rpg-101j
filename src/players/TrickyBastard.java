package players;

import General.Rpg_game;

public class TrickyBastard extends Hero {
    public TrickyBastard(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.PLAY_DEAD);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int number = Rpg_game.random.nextInt(2);
        if (number == 1){
            this.setHealth(0);
            this.setDamage(0);
        }else {
            this.setHealth(this.getHealth());
            this.setDamage(this.getDamage());
        }
    }
}
