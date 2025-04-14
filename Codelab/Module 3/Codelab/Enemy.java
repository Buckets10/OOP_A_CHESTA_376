package Codelab;

public class Enemy extends GameCharacter {
    public Enemy(String name, int health) {
        super(name, health);
    }
    @Override
    public void attack(GameCharacter target) {
        System.out.println(Enemy.this.getName() + " attacked " + target.getName() + " using Omega Beam!! ");
        target.setHealth(target.getHealth() - 20);
        System.out.println("Superman now has : " + target.getHealth() + " hp");
    }
}
