public class PrimaryAttribute {

    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private Integer vitality;

    private Integer totalStrength;
    private Integer totalDexterity;
    private Integer totalIntelligence;

    PrimaryAttribute(Integer strength, Integer dexterity, Integer intelligence, Integer vitality){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    PrimaryAttribute(){

    }

    public void setBaseAttribtues(Integer baseStrength, Integer baseDexterity, Integer baseIntelligence, Integer vitality){
        this.strength = baseStrength;
        this.dexterity = baseDexterity;
        this.intelligence = baseIntelligence;
    }
    public void setTotalAttribtues(Integer totalStrength, Integer totalDexterity, Integer totalIntelligence){
        this.totalStrength = totalStrength;
        this.totalDexterity = totalDexterity;
        this.totalIntelligence = totalIntelligence;
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

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }
}
