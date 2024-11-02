package L03.Prototype;

import java.util.Scanner;

public class Play {

    public static void main(String[] args) {

        CharacterLibrary library = new CharacterLibrary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("RPG Game - MAIN MENU ");
        System.out.println(" 1.Create a new character \n 2.Modify predefined character");
        String choice = scanner.nextLine();

        Character character;
        if (choice.equalsIgnoreCase("2")) {
            System.out.println("Choose your character to modify (Warrior/Mage/Wizard):");
            String type = scanner.nextLine();
            character = library.getCharacter(type);
            if (character == null) {
                System.out.println("Character NOT FOUND... * Creating a NEW CHARACTER. *");
                character = createNewCharacter(scanner);
            } else {
                modifyCharacter(character, scanner);
            }
        } else {
            character = createNewCharacter(scanner);
        }

        System.out.println("* Character info completed. *");
        System.out.println("... Loading details ...");
        System.out.println(character);
    }

    private static Character createNewCharacter(Scanner scanner) {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Class:");
        String characterClass = scanner.nextLine();
        System.out.println("Story:");
        String story = scanner.nextLine();
        System.out.println("Strength (3-20):");
        int strength = scanner.nextInt();
        System.out.println("Constitution (3-20):");
        int constitution = scanner.nextInt();
        System.out.println("Dexterity (3-20):");
        int dexterity = scanner.nextInt();
        System.out.println("Intelligence (3-20):");
        int intelligence = scanner.nextInt();
        System.out.println("Wisdom (3-20):");
        int wisdom = scanner.nextInt();
        System.out.println("Charisma (3-20):");
        int charisma = scanner.nextInt();
        scanner.nextLine();

        return new Character(name, characterClass, story, strength, constitution, dexterity, intelligence, wisdom, charisma);
    }

    private static void modifyCharacter(Character character, Scanner scanner) {
        System.out.println("Modifying character: " + character.getName());
        System.out.println("...leave *BLANK* to keep actual attribute...");
        System.out.println("New name: ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) character.setName(name);

        System.out.println("New class: ");
        String characterClass = scanner.nextLine();
        if (!characterClass.isEmpty()) character.setCharacterClass(characterClass);

        System.out.println("New story: ");
        String story = scanner.nextLine();
        if (!story.isEmpty()) character.setStory(story);

        System.out.println("New strength (3-20):");
        String strength = scanner.nextLine();
        if (!strength.isEmpty()) character.setStrength(Integer.parseInt(strength));

        System.out.println("New constitution (3-20):");
        String constitution = scanner.nextLine();
        if (!constitution.isEmpty()) character.setConstitution(Integer.parseInt(constitution));

        System.out.println("New dexterity (3-20):");
        String dexterity = scanner.nextLine();
        if (!dexterity.isEmpty()) character.setDexterity(Integer.parseInt(dexterity));

        System.out.println("New intelligence (3-20):");
        String intelligence = scanner.nextLine();
        if (!intelligence.isEmpty()) character.setIntelligence(Integer.parseInt(intelligence));

        System.out.println("New wisdom (3-20):");
        String wisdom = scanner.nextLine();
        if (!wisdom.isEmpty()) character.setWisdom(Integer.parseInt(wisdom));

        System.out.println("New charisma (3-20):");
        String charisma = scanner.nextLine();
        if (!charisma.isEmpty()) character.setCharisma(Integer.parseInt(charisma));
    }

}
