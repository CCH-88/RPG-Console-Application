public class Weapon extends Item {

    private Integer damage = 0;
    private double attacksPerSecond = 0.0;

    private double calculatedWeaponDPS = 0;

    public Weapon(Integer damage, double attacksPerSecond) {
        super();
        this.damage = damage;
        this.attacksPerSecond = attacksPerSecond;
        this.calculatedWeaponDPS = damage * attacksPerSecond;
    }

    public void calculateWeaponDPS(){
        this.calculatedWeaponDPS = damage * attacksPerSecond;
    }

    public double getCalculatedWeaponDPS() {
        return calculatedWeaponDPS;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getDamage(){
        return damage;
    }

    public double getAttacksPerSecond() {
        return attacksPerSecond;
    }

    public void setAttacksPerSecond(double attacksPerSecond) {
        this.attacksPerSecond = attacksPerSecond;
    }

}
