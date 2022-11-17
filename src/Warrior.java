public class Warrior extends Character{

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
        super.setBaseAttribtues(strength, dexterity, intelligence, warriorMainPrimaryAttribute);

    }

    public double getCharacterDPS(){
        return this.calculatedCharacterDPS();
    }


    public boolean equipWeapon(SlotType aSlotType, Item anItem) throws InvalidWeaponException{

        if(aSlotType == SlotType.WEAPON)
        {
            if (super.checkEquipLvl(aSlotType, anItem))
            {
                if (anItem.getWeaponType() == WeaponType.AXE || anItem.getWeaponType() == WeaponType.HAMMER || anItem.getWeaponType() == WeaponType.SWORD) {

                    System.out.println(anItem.getWeaponType() + " equiped in slot " + aSlotType.name());
                    super.setItem(aSlotType,anItem);
                    return true;

                } else {
                    throw new InvalidWeaponException("Warriors cannot equip the weapon type " + anItem.getWeaponType() + ". They can only equip axes, hammers and swords");
                }
            }
            else{
                throw new InvalidWeaponException("Weapon is too high high level for the warrior...");
            }
        }
        else
        {
            System.out.println("Invalid slot type....");
            return false;
        }
    }

    public boolean equipArmor(SlotType aSlotType, Item anItem) throws InvalidArmorException {

        if(aSlotType == SlotType.HEAD || aSlotType == SlotType.BODY || aSlotType == SlotType.LEGS)
        {
            if (super.checkEquipLvl(aSlotType, anItem) == true)
            {
                if (anItem.getArmorType() == ArmorType.MAIL || anItem.getArmorType() == ArmorType.PLATE)
                {
                    System.out.println(anItem.getName() + " equiped in slot " + aSlotType.name());
                    super.setItem(aSlotType,anItem);
                    return true;

                }
                else
                {
                    throw new InvalidArmorException("Warriors cannot equip the armour type " + anItem.getArmorType() + ". They can only equip mail and plate");
                }
            }
            else{
                throw new InvalidArmorException("Armor is too high level for the warrior....");
            }

        }
        else
        {
            System.out.println("Invalid slot type....");
            return false;
        }

    }
}
