public class Warrior extends Character{
    Warrior(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for warrior
        super.setStrength(5);
        super.setDexterity(2);
        super.setIntelligence(1);

        //The main primary attribute of warrior
        super.setMainPrimaryAttribute(getStrength());
    }

    Warrior() {

        //The default attributes at level 1 for warrior
        super.setStrength(5);
        super.setDexterity(2);
        super.setIntelligence(1);

        //The main primary attribute of warrior
        super.setMainPrimaryAttribute(getStrength());

    }
    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 3 + getStrength();
        Integer dexterity = 2 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        Integer warriorMainPrimaryAttribute = strength;
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality(), warriorMainPrimaryAttribute);

    }

    @Override
    public boolean equipItem(Slot aSlot, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlot == Slot.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.AXE || anItem.getWeaponType() == WeaponType.HAMMER || anItem.getWeaponType() == WeaponType.SWORD) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Warriors cannot equip this type of weapon. They can only equip axes, hammers and swords");
            }
        }
        else{
            if (anItem.getArmorType() == ArmorType.MAIL || anItem.getArmorType() == ArmorType.PLATE) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Warriors cannot equip this type of armor. They can only equip armors of type mail and plate");
            }
        }


    }
}
