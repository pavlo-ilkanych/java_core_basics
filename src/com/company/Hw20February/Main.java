package com.company.Hw20February;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(1000, new Weapon(200), "Gladiator");
        System.out.println("Воїн: " + warrior.getName());
        System.out.println("hp: " + warrior.getHp());
        System.out.println("Weapon: sword. Damage: " + warrior.getDmg());
        System.out.println();

        Archer archer = new Archer(800, new Weapon(400), "Archer");
        System.out.println("Воїн: " + archer.getName());
        System.out.println("hp: " + archer.getHp());
        System.out.println("Weapon: bow. Damage: " + archer.getDmg());
        System.out.println();

        Rogue rogue = new Rogue(900,new Weapon(300), "Rogue");
        System.out.println("Воїн: " + rogue.getName());
        System.out.println("hp: " + rogue.getHp());
        System.out.println("Weapon: dagger. Damage: " + rogue.getDmg());
        System.out.println();

        Warrior[] warriorArr = {warrior, archer, rogue};

        System.out.println("Fight !!!");
        System.out.println();


        while (warrior.getHp() >= 0 || archer.getHp() >= 0 || rogue.getHp() >= 0) {

            int attacking = (int)Math.floor(Math.random() * warriorArr.length);
            int defending = (int)Math.floor(Math.random() * warriorArr.length);

            if (attacking != defending){
                warriorArr[attacking].attack(warriorArr[defending]);
                System.out.println(warriorArr[attacking].getName() + " hit " + warriorArr[defending].getName());
                System.out.println(warriorArr[defending].getName() + " hp: " + warriorArr[defending].getHp());
                warriorArr[defending].getDeath();
                System.out.println();
                System.out.println("Битва закінчилась! Виграв воїн " + warriorArr[attacking].getName());
            }
            else
                continue;

        }
    }
}
