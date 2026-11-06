package com.game.element;

public class Monster implements GameElement{
    private final String name;
    private final int health;
    private final int damage;

    public Monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}
