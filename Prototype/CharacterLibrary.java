package L03.Prototype;

import java.util.HashMap;
import java.util.Map;

public class CharacterLibrary {

    private Map<String, Character> characters = new HashMap<>();

    public CharacterLibrary(){
        characters.put("Warrior", new Character("WarriorX", "Warrior", "A warrior", 18, 16, 14, 10, 12, 8));
        characters.put("Mage", new Character("MageX", "Mage", "A simple mage", 8, 10, 12, 18, 16, 14));
        characters.put("Wizzard", new Character("WizzardX", "Wizzard", "A strong wizzard", 10, 12, 14, 16, 18, 8));
    }

    public Character getCharacter(String type){
        Character character = characters.get(type);

        if (character != null) {
            return character.clone();
        } else {
            return null;
        }
    }
}
