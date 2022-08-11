public class PrimaryAttribute {

    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;

    PrimaryAttribute(Integer strength, Integer dexterity, Integer intelligence){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public PrimaryAttribute() {

    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getStrength() {
        return strength;
    }

    public PrimaryAttribute setAttributes(Integer strength, Integer dexterity, Integer intelligence){

        PrimaryAttribute attributes = new PrimaryAttribute(strength,dexterity,intelligence);

        return attributes;
    }
}
