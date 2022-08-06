package players;

import General.Rpg_game;

public class Magic extends Hero {

    public Magic(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
         int number = Rpg_game.random.nextInt(5)+1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]){
                heroes[i].setDamage(heroes[i].getDamage() + number);
            }
        }
    }
}
