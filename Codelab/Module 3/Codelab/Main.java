package Codelab;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Superman", 150);
        Enemy enemy = new Enemy("Darkseid", 200);

        System.out.println("Initial status : ");
        System.out.println(hero.getName() + " has health : " + hero.getHealth());
        System.out.println(enemy.getName() + " has health : " + enemy.getHealth());

        hero.attack(enemy);
        hero.attack(enemy);

        enemy.attack(hero);

    }
}
