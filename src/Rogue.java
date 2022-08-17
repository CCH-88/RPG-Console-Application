public class Rogue extends Character{
    Rogue(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for Rogue
        super.setStrength(2);
        super.setDexterity(6);
        super.setIntelligence(1);

        //The main primary attribute of Rogue
        super.setMainPrimaryAttribute(getDexterity());
    }

    Rogue(){

        //The default attributes at level 1 for Rogue
        super.setStrength(2);
        super.setDexterity(6);
        super.setIntelligence(1);

        //The main primary attribute of Rogue
        super.setMainPrimaryAttribute(getDexterity());
    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 4 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality(), );

    }

    @Override
    public boolean equipItem(Slot aSlot, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlot == Slot.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.DAGGER || anItem.getWeaponType() == WeaponType.SWORD) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Rogues cannot equip this type of weapon. They can only equip daggers and swords");
            }
        }
        else{
            if (anItem.getArmorType() == ArmorType.LEATHER || anItem.getArmorType() == ArmorType.MAIL) {

                return super.equipItem(aSlot, anItem);
            } else {
                throw new InvalidWeaponException("Rogues cannot equip this type of armor. They can only equip armors of type leather and mail");
            }
        }


    }
}
