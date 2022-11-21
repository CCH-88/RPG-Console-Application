import java.util.HashMap;

public class PrimaryAttribute {

    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;

    private Integer mainPrimaryAttribute;

    private Integer totalStrength;
    private Integer totalDexterity;
    private Integer totalIntelligence;

    PrimaryAttribute(Integer strength, Integer dexterity, Integer intelligence){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;

    }
    PrimaryAttribute(){

    }
    public void setBaseAttribtues(Integer baseStrength, Integer baseDexterity, Integer baseIntelligence, Integer mainPrimaryAttribute){
        this.strength = baseStrength;
        this.dexterity = baseDexterity;
        this.intelligence = baseIntelligence;
        this.mainPrimaryAttribute = mainPrimaryAttribute;
    }

    public int getSumOfBaseAttributes(){
        //vitality and mainPrimaryAttribute are not included...
        return strength+dexterity+intelligence;
    }

    public void setTotalAttribtues(Integer totalStrength, Integer totalDexterity, Integer totalIntelligence){
        this.totalStrength = totalStrength;
        this.totalDexterity = totalDexterity;
        this.totalIntelligence = totalIntelligence;
    }

    public HashMap<String, Integer> getAllAttributes(){

        HashMap<String, Integer> allAttributes = new HashMap<>();

        allAttributes.put("Strength", getStrength());
        allAttributes.put("Dexterity", getDexterity());
        allAttributes.put("Intelligence", getIntelligence());

        return allAttributes;

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


    public double getMainPrimaryAttribute() {
        return (double) mainPrimaryAttribute;
    }

    public void setMainPrimaryAttribute(Integer mainPrimaryAttribute) {
        this.mainPrimaryAttribute = mainPrimaryAttribute;
    }

    public void setArmorBaseAttribtues(Integer strength, Integer dexterity, Integer intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int[] getArmorBaseAttribtues() {
        int[] armorBaseAttributes = {this.strength,this.strength,this.intelligence};
        return armorBaseAttributes;
    }

    public Integer getTotalStrength() {
        return totalStrength;
    }

    public void setTotalStrength(Integer totalStrength) {
        this.totalStrength = totalStrength;
    }

    public Integer getTotalDexterity() {
        return totalDexterity;
    }

    public void setTotalDexterity(Integer totalDexterity) {

        this.totalDexterity = totalDexterity;
    }

    public Integer getTotalIntelligence() {
        return totalIntelligence;
    }

    public void setTotalIntelligence(Integer totalIntelligence) {
        this.totalIntelligence = totalIntelligence;
    }
}
