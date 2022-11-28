public class Main {
    public static void main(String[] args) {

        //An instance of a game...

        Warrior johnTheImpaler = new Warrior();
        johnTheImpaler.setName("John the impaler");
        johnTheImpaler.levelUp();

        Weapon commonAxe = new Weapon(7, 1.1);
        commonAxe.setName("Common Axe");
        commonAxe.setRequiredLvl(1);
        commonAxe.setSlotType(SlotType.WEAPON);
        commonAxe.setWeaponType(WeaponType.AXE);
        commonAxe.calculateWeaponDPS();

        Armor plateHelmet = new Armor();
        plateHelmet.setName("Common Plate Helmet");
        plateHelmet.setRequiredLvl(1);
        plateHelmet.setSlotType(SlotType.HEAD);
        plateHelmet.setArmorType(ArmorType.PLATE);
        plateHelmet.setArmorAttributes(new PrimaryAttribute(1,0,3));

        try {
            johnTheImpaler.equipWeapon(SlotType.WEAPON, commonAxe);
        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }

        try {
            johnTheImpaler.equipArmor(SlotType.HEAD, plateHelmet);
        } catch (InvalidArmorException e) {
            System.out.println(e);
        }

        johnTheImpaler.calculateTotalAttributes();

        System.out.println(johnTheImpaler.getCharacterSheet());

    }

}
