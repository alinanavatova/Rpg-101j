package players;

public class Witcher extends Hero{

    public Witcher(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.REVIVE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0  && this.getHealth() > 0 &&  heroes[i].getName() != this.getName()){
                heroes[i].setHealth(this.getHealth());
                this.setHealth(heroes[i].getHealth());
            }
        }
    }
}
