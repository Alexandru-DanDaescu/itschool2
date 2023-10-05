package session12_polymorphism.practice.chanceruntimebehavior;

public class GameCharacter {

    private Weapon weapon;

    GameCharacter(Weapon weapon){
        this.weapon = weapon;
    }

     void setWeapon(Weapon weapon){
        this.weapon = weapon;
     }

     void attack(){
        if(weapon instanceof Sword){

        }
        weapon.use();
     }
}
