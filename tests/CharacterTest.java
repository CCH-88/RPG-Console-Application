import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {


    @Test
    void characterConstructor_levelWhenCreated_levelOne(){

        //Arrange
        Character character = new Character();

        //Act

        Integer level = character.getLevel();

        //Assert

        assertEquals(1,level);

    }

    @Test
    void levelUp_levelOneLevelUp_levelTwo(){

        //Arrange
        Character character = new Character();

        //Act
        character.levelUp();

        //Assert
        assertEquals(2,character.getLevel());
    }

    @Test
    void mageConstructor_defaultAttributes_strengthOneDexterityOneIntelligenceOne(){

        //Arrange
        Mage mage = new Mage();
        HashMap<String, Integer> defaultMageAttributes = new HashMap<>();


        //Act
        defaultMageAttributes.put("Strength", 1);
        defaultMageAttributes.put("Dexterity", 1);
        defaultMageAttributes.put("Intelligence", 8);

        //Assert
        assertTrue(defaultMageAttributes.equals(mage.getAllAttributes()));

    }

    @Test
    void rangerConstructor_defaultAttributes_strengthOneDexteritySevenIntelligenceOne(){

        //Arrange
        Ranger ranger = new Ranger();
        HashMap<String, Integer> defaultRangerAttributes = new HashMap<>();

        //Act
        defaultRangerAttributes.put("Strength", 1);
        defaultRangerAttributes.put("Dexterity", 7);
        defaultRangerAttributes.put("Intelligence", 1);

        //Assert
        assertTrue(defaultRangerAttributes.equals(ranger.getAllAttributes()));

    }

    @Test
    void rogueConstructor_defaultAttributes_strengthTwoDexteritySixIntelligenceOne(){

        //Arrange
        Rogue rogue = new Rogue();
        HashMap<String, Integer> defaultRogueAttributes = new HashMap<>();

        //Act
        defaultRogueAttributes.put("Strength", 2);
        defaultRogueAttributes.put("Dexterity", 6);
        defaultRogueAttributes.put("Intelligence", 1);

        //Assert
        assertTrue(defaultRogueAttributes.equals(rogue.getAllAttributes()));

    }

    @Test
    void warriorConstructor_defaultAttributes_strengthFiveDexterityTwoIntelligenceOne(){

        //Arrange
        Warrior warrior = new Warrior();
        HashMap<String, Integer> defaultWarriorAttributes = new HashMap<>();

        //Act
        defaultWarriorAttributes.put("Strength", 5);
        defaultWarriorAttributes.put("Dexterity", 2);
        defaultWarriorAttributes.put("Intelligence", 1);

        //Assert
        assertTrue(defaultWarriorAttributes.equals(warrior.getAllAttributes()));

    }

    @Test
    void mageLevelUp_levelUp_strengthTwoDexterityTwoIntelligenceThirteen(){
        //Arrange
        Mage mage = new Mage();
        HashMap<String, Integer> levelTwoMageAttributes = new HashMap<>();


        //Act
        levelTwoMageAttributes.put("Strength", 2);
        levelTwoMageAttributes.put("Dexterity", 2);
        levelTwoMageAttributes.put("Intelligence", 13);

        mage.levelUp();

        //Assert
        assertTrue(levelTwoMageAttributes.equals(mage.getAllAttributes()));
    }

    @Test
    void rangerLevelUp_levelUp_strengthTwoDexterityTwelveIntelligenceTwo(){
        //Arrange
        Ranger ranger = new Ranger();
        HashMap<String, Integer> levelTwoRangerAttributes = new HashMap<>();

        //Act
        levelTwoRangerAttributes.put("Strength", 2);
        levelTwoRangerAttributes.put("Dexterity", 12);
        levelTwoRangerAttributes.put("Intelligence", 2);

        ranger.levelUp();

        //Assert
        assertTrue(levelTwoRangerAttributes.equals(ranger.getAllAttributes()));
    }

    @Test
    void rogueLevelUp_levelUp_strengthTwoDexterityTwelveIntelligenceTwo(){
        //Arrange
        Rogue rogue = new Rogue();
        HashMap<String, Integer> levelTwoRogueAttributes = new HashMap<>();

        //Act
        levelTwoRogueAttributes.put("Strength", 2);
        levelTwoRogueAttributes.put("Dexterity", 12);
        levelTwoRogueAttributes.put("Intelligence", 2);

        rogue.levelUp();

        //Assert
        assertTrue(levelTwoRogueAttributes.equals(rogue.getAllAttributes()));
    }

    @Test
    void warriorLevelUp_levelUp_strengthTwoDexterityTwelveIntelligenceTwo(){
        //Arrange
        Warrior warrior = new Warrior();
        HashMap<String, Integer> levelTwoWarriorAttributes = new HashMap<>();

        //Act
        levelTwoWarriorAttributes.put("Strength", 8);
        levelTwoWarriorAttributes.put("Dexterity", 4);
        levelTwoWarriorAttributes.put("Intelligence", 2);

        warrior.levelUp();

        //Assert
        assertTrue(levelTwoWarriorAttributes.equals(warrior.getAllAttributes()));
    }

}