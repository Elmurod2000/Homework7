package com.company;

public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String SuperAbilityType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilityType() {
        return SuperAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        SuperAbilityType = superAbilityType;
    }
}
