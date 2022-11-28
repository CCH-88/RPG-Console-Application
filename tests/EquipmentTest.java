import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    @Test
    void equippingWeapon_triesToEquipTooHighLvlWeapon_invalidWeaponException(){
        //Assign
        Warrior warrior = new Warrior();
        Weapon testWeapon = new Weapon(7, 1.1);

        //Act
        testWeapon.setName("Common Axe");
        testWeapon.setRequiredLvl(2);
        testWeapon.setSlotType(SlotType.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);

        //Assert
         Exception exception = assertThrows(InvalidWeaponException.class,() -> warrior.equipWeapon(SlotType.WEAPON,testWeapon));
         assertEquals("Weapon is too high high level for the warrior...",exception.getMessage());
    }

    @Test
    void equippingArmor_triesToEquipTooHighLvlArmor_invalidArmorException(){
        //Assign
        Warrior warrior = new Warrior();
        Armor testArmor = new Armor();

        //Act
        testArmor.setName("Plate Helmet");
        testArmor.setRequiredLvl(2);
        testArmor.setSlotType(SlotType.HEAD);
        testArmor.setArmorType(ArmorType.PLATE);

        //Assert
        Exception exception = assertThrows(InvalidArmorException.class,() -> warrior.equipArmor(SlotType.HEAD, testArmor));
        assertEquals("Armor is too high level for the warrior....",exception.getMessage());
    }

    @Test
    void equippingWeapon_triesToEquipWrongTypeWeapon_invalidWeaponException(){
        //Assign
        Warrior warrior = new Warrior();
        Weapon bow = new Weapon(7, 1.1);

        //Act
        bow.setName("Bow");
        bow.setRequiredLvl(1);
        bow.setSlotType(SlotType.WEAPON);
        bow.setWeaponType(WeaponType.BOW);

        //Assert
        Exception exception = assertThrows(InvalidWeaponException.class,() -> warrior.equipWeapon(SlotType.WEAPON, bow));
        assertEquals("Warriors cannot equip the weapon type " + bow.getWeaponType() + ". They can only equip axes, hammers and swords",exception.getMessage());
    }

    @Test
    void equippingArmor_triesToEquipWrongTypeArmor_invalidArmorException(){
        //Assign
        Warrior warrior = new Warrior();
        Armor clothArmor = new Armor();

        //Act
        clothArmor.setName("Cloth hat");
        clothArmor.setRequiredLvl(1);
        clothArmor.setSlotType(SlotType.HEAD);
        clothArmor.setArmorType(ArmorType.CLOTH);

        //Assert
        Exception exception = assertThrows(InvalidArmorException.class,() -> warrior.equipArmor(SlotType.HEAD, clothArmor));
        assertEquals("Warriors cannot equip the armour type " + clothArmor.getArmorType() + ". They can only equip mail and plate",exception.getMessage());
    }

    @Test
    void equippingWeapon_triesToEquipValidWeapon_returnTrueBoolean() {
        //Assign
        Warrior warrior = new Warrior();
        Weapon sword = new Weapon(7, 1.1);

        //Act
        sword.setName("Long sword");
        sword.setRequiredLvl(1);
        sword.setSlotType(SlotType.WEAPON);
        sword.setWeaponType(WeaponType.SWORD);

        boolean equipWeapon;

        try {
            equipWeapon = warrior.equipWeapon(SlotType.WEAPON, sword);
        } catch (InvalidWeaponException e) {
            throw new RuntimeException(e);
        }

        //Assert

        assertEquals(true, equipWeapon);


    }

    @Test
    void equippingArmor_triesToEquipValidArmor_returnTrueBoolean() {
        //Assign
        Warrior warrior = new Warrior();
        Armor plateHelmet = new Armor();

        //Act
        plateHelmet.setName("Plate helmet");
        plateHelmet.setRequiredLvl(1);
        plateHelmet.setSlotType(SlotType.HEAD);
        plateHelmet.setArmorType(ArmorType.PLATE);

        boolean equipArmor;

        try {
            equipArmor = warrior.equipArmor(SlotType.HEAD, plateHelmet);
        } catch (InvalidArmorException e) {
            throw new RuntimeException(e);
        }

        //Assert

        assertEquals(true, equipArmor);


    }

    @Test
    void calculateDPS_calculateDPSWithNoWeaponCharLvlOne_onePointZeroFive() {
        //Assign
        Warrior aWarrior = new Warrior();
        aWarrior.setName("John the impaler");

        //Act
        aWarrior.calculatedCharacterDPS();

        //Assert
        assertEquals(1.05, aWarrior.getCharacterDPS());
    }


    @Test
    void calculateDPS_calculateDPSWithValidWeaponCharLvlOne_eightPointZeroEightFive() {
        //Assign
        Warrior aWarrior = new Warrior();
        Weapon bigWarriorAxe = new Weapon(7, 1.1);

        //Act
        bigWarriorAxe.setName("Big Warrior Axe");
        bigWarriorAxe.setRequiredLvl(1);
        bigWarriorAxe.setSlotType(SlotType.WEAPON);
        bigWarriorAxe.setWeaponType(WeaponType.AXE);

        aWarrior.setName("John the impaler");

        try {
            aWarrior.equipWeapon(SlotType.WEAPON, bigWarriorAxe);
        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }

        aWarrior.calculatedCharacterDPS();

        //Assert
        assertEquals(8.085, aWarrior.getCharacterDPS());
    }

    @Test
    void calculateDPS_calculateDPSWithValidWeaponAndArmorCharLvlOne_eightPointOneSixTwo() {
        //Assign
        Warrior aWarrior = new Warrior();
        Weapon bigWarriorAxe = new Weapon(7, 1.1);
        Armor plateHelmet = new Armor();

        //Act
        aWarrior.setName("John the impaler");

        bigWarriorAxe.setName("Big Warrior Axe");
        bigWarriorAxe.setRequiredLvl(1);
        bigWarriorAxe.setSlotType(SlotType.WEAPON);
        bigWarriorAxe.setWeaponType(WeaponType.AXE);

        try {
            aWarrior.equipWeapon(SlotType.WEAPON, bigWarriorAxe);
        } catch (InvalidWeaponException e) {
            System.out.println(e);
        }

        plateHelmet.setName("Common Plate Helmet");
        plateHelmet.setRequiredLvl(1);
        plateHelmet.setSlotType(SlotType.HEAD);
        plateHelmet.setArmorType(ArmorType.PLATE);
        plateHelmet.setArmorAttributes(new PrimaryAttribute(1,0,0));

        try {
            aWarrior.equipArmor(SlotType.HEAD, plateHelmet);
        } catch (InvalidArmorException e) {
            System.out.println(e);
        }

        aWarrior.calculatedCharacterDPS();

        //Assert
        assertEquals(8.162, aWarrior.getCharacterDPS());
    }


}