public class Weapon extends Item {

    private Integer damage = 0;
    private double attacksPerSecond = 0.0;

    private double calculatedDPS = 0;

    WeaponType weaponType;

    Weapon(String name, Integer requiredLvl) {
        super(name, requiredLvl);


    }

    public Weapon() {
        super();
    }

    public void calculateDamagePerSecond(Integer damage, double attacksPerSecond){

        setCalculatedDPS(damage * attacksPerSecond);
        setDamage(damage);
        setAttacksPerSecond(attacksPerSecond);

    }
    public void setCalculatedDPS(double calculatedDPS) {
        this.calculatedDPS = calculatedDPS;
    }

    public double getCalculatedDPS() {
        return calculatedDPS;
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

    public void setWeaponType(WeaponType weaponType){

        this.weaponType = weaponType;

    }
}
