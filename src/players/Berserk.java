package players;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String heroName) {
        super(health, damage, heroName, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        this.setDamage(this.getDamage() + (boss.getDamage()/5));

    }
}

