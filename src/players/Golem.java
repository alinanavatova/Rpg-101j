package players;

public class Golem extends Hero{
    public Golem(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.TAKE_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getName() != this.getName() && boss.getDamage() > 0){
                this.setHealth((int) (this.getHealth() - (heroes.length * (boss.getDamage() * 0.2))));
                heroes[i].setHealth((int) (heroes[i].getHealth() + (boss.getDamage() * 0.2)));
            }
        }
    }
}
