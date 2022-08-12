public class Character extends PrimaryAttribute{

    private String name;
    private Integer level;

    Character(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //All characters start at level 1
        setLevel(1);
    }

    Character(){

        //All characters start at level 1
        setLevel(1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    //Josi made the damage method here....
    public void doDamage(){

    }

    public void levelUp(){
        Integer level = 1 + getLevel();
        setLevel(level);

    }

}
