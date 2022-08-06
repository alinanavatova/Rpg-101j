package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private String name;
    private SuperAbility superAbility;

    public Hero(int health, int damage, String heroName, SuperAbility heroAbility) {
        super(health, damage);
        this.name = heroName;
        this.superAbility = heroAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }
}
