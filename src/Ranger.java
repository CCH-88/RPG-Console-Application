public class Ranger extends Character{
    Ranger(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence);

        //The default attributes at level 1 for Ranger
        super.setStrength(1);
        super.setDexterity(7);
        super.setIntelligence(1);

        //The main primary attribute of Ranger
        super.setMainPrimaryAttribute(getDexterity());
    }

    public Ranger() {

        //The default attributes at level 1 for Ranger
        super.setStrength(1);
        super.setDexterity(7);
        super.setIntelligence(1);

        //The main primary attribute of Ranger
        super.setMainPrimaryAttribute(getDexterity());

    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 5 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        Integer rangerMainPrimaryAttribute = dexterity;

        super.setBaseAttribtues(strength, dexterity, intelligence, rangerMainPrimaryAttribute);

    }

    public boolean equipItem(SlotType aSlotType, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlotType == SlotType.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.BOW) {

                return super.checkEquipLvl(aSlotType, anItem);
            } else {
                throw new InvalidWeaponException("Ranger cannot equip this type of weapon. Rangers can only equip bows");
            }
        }
        else{
            if (anItem.getArmorType() == ArmorType.LEATHER || anItem.getArmorType() == ArmorType.MAIL) {

                return super.checkEquipLvl(aSlotType, anItem);
            } else if(anItem.getArmorType() != ArmorType.LEATHER || anItem.getArmorType() != ArmorType.MAIL) {
                throw new InvalidWeaponException("Ranger cannot equip this type of armor. They can only equip armors of type leather and mail");
            }
        }
        return true;

    }
}
