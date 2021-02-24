package com.company.Hw20February;


public class Warrior {

    private int hp;
    private String name;
    private Weapon weapon;

    public Warrior() {
    }

    public Warrior(int hp, Weapon weapon, String name) {
        this.hp = hp;
        this.name = name;
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getDmg() {
        return weapon.getDamage();
    }

    public void attack(Warrior warrior){
        warrior.hp -= weapon.damage;
    }

    public void getDeath(){
        if (getHp() < 0){
            System.out.println(getName() + " помер.");
        }
    }
    public static boolean isOnlyOneIsAlive(Warrior[] warriorArr) {
        int aliveCount = 0;
        for (int i = 0; i < warriorArr.length; i++){
            if(warriorArr[i].hp > 0){
                aliveCount++;
            }
            if(aliveCount > 1) return false;
        }
        return aliveCount ==1;
    }
}
