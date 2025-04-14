package Codelab;

public class Hero extends GameCharacter {
    public Hero(String name, int health) {
        super(name, health);
    }
    @Override
    public void attack(GameCharacter target) {
        System.out.println(Hero.this.getName() + " attacks " + target.getName() + " using Heat vision!! ");
        target.setHealth(target.getHealth() - 20);
        System.out.println(" Darkseid now has : " + target.getHealth() + " hp");
    }
}
