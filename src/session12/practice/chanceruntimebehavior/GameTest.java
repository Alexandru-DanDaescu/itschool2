package session12.practice.chanceruntimebehavior;

public class GameTest {

    public static void main(String[] args) {

        GameCharacter character = new GameCharacter(new Sword());
        character.attack();

        character.setWeapon(new Bow());
        character.attack();

    }
}
