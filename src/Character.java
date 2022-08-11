public class Character extends PrimaryAttribute{

    private String name;
    private Integer level;

    Character()
    {
        super();

    }

    Character(Integer strength, Integer dexterity, Integer intelligence) {
        super(strength, dexterity, intelligence);
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
}
