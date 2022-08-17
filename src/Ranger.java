public class Ranger extends Character{
    Ranger(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

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

        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality(), );

    }
    @Override
    public boolean equipItem(Slot aSlot, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlot == Slot.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.BOW) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Ranger cannot equip this type of weapon. Rangers can only equip bows");
            }
        }
        else{
            if (anItem.getArmorType() == ArmorType.LEATHER || anItem.getArmorType() == ArmorType.MAIL) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Ranger cannot equip this type of armor. They can only equip armors of type leather and mail");
            }
        }


    }
}
