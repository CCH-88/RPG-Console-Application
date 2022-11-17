public class Main {
    public static void main(String[] args) {

        Weapon testWeapon = new Weapon(7, 1.1);
        testWeapon.setName("Common Axe");
        //testWeapon.setRequiredLvl(2);  //--- Test 1. Too high level
        testWeapon.setRequiredLvl(1);
        testWeapon.setSlotType(SlotType.WEAPON);
        //testWeapon.setWeaponType(WeaponType.BOW);   //--- Test 3. Wrong type of weapon - bow
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.calculateWeaponDPS();


        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        //testPlateBody.setRequiredLvl(2); //--- Test 2. Too high level
        testPlateBody.setRequiredLvl(1);
        testPlateBody.setSlotType(SlotType.BODY);
        //testPlateBody.setArmorType(ArmorType.CLOTH); //--- Test 4. Wrong type of armour - cloth
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setArmorAttributes(new PrimaryAttribute(0,0,1));

        Armor testPlateHelmet = new Armor();
        testPlateHelmet.setName("Common Plate Helmet");
        testPlateHelmet.setRequiredLvl(1);
        testPlateHelmet.setSlotType(SlotType.HEAD);
        testPlateHelmet.setArmorType(ArmorType.PLATE);
        testPlateHelmet.setArmorAttributes(new PrimaryAttribute(1,0,3));

        Warrior aWarrior = new Warrior();
        aWarrior.setName("John the impaler");

        try {
            aWarrior.equipWeapon(SlotType.WEAPON,testWeapon); //Test 4 - returns true if everything OK...
        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }

        System.out.println(aWarrior.getName() +
                " has now equipped a" + testWeapon.getName() +
                " of type " + testWeapon.getWeaponType() + " in slot " + testWeapon.getSlotType());

        try {
            aWarrior.equipArmor(SlotType.BODY, testPlateBody); //Test 5 - returns true if everything OK
            //aWarrior.equipArmor(SlotType.HEAD, testPlateHelmet);
        } catch (InvalidArmorException e) {
            System.out.println(e);
        }

        System.out.println(aWarrior.getName() + " has a Character DPS of " + aWarrior.calculatedCharacterDPS());

        /*System.out.println("The total attributes of the warrior " + aWarrior.getName() +
                " is: " + aWarrior.totalAttribute() + " (Expected 17)");*/



    }




}
