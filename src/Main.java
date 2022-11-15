public class Main {
    public static void main(String[] args) {

        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");

        //testWeapon.setRequiredLvl(2);  //--- Test 1. Too high level
        testWeapon.setRequiredLvl(1);

        testWeapon.setSlot(SlotType.WEAPON);

        //testWeapon.setWeaponType(WeaponType.BOW);   //--- Test 3. Wrong type of weapon - bow
        //testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setWeaponType(WeaponType.STAFF);

        testWeapon.calculateDamagePerSecond(4,2);


        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");

        //testPlateBody.setRequiredLvl(2); //--- Test 2. Too high level
        testPlateBody.setRequiredLvl(1);

        testPlateBody.setSlot(SlotType.BODY);

        //testPlateBody.setArmorType(ArmorType.CLOTH); //--- Test 4. Wrong type of armour - cloth
        testPlateBody.setArmorType(ArmorType.PLATE);


        testPlateBody.setArmorAttributes(new PrimaryAttribute(1,1,1,2));


        Warrior aWarrior = new Warrior();
        try {
            aWarrior.equipWeapon(SlotType.WEAPON,testWeapon);
        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }
        System.out.println(aWarrior.checkEquipLvl(SlotType.WEAPON, testWeapon)); //Test 4 - return true if everything OK

        try {
            aWarrior.equipArmor(SlotType.HEAD,testPlateBody);
        } catch (InvalidArmorException e) {
            System.out.println(e);
        }
        System.out.println(aWarrior.checkEquipLvl(SlotType.HEAD,testPlateBody)); //Test 5 - return true if everything OK

    }




}
