package com.game.element;

public class Chest implements GameElement{
    private final String tier;
    private final int goldAmount;

    public Chest(String tier, int goldAmount) {
        this.tier = tier;
        this.goldAmount = goldAmount;
    }

    public String getTier() { return tier; }
    public int getGoldAmount() { return goldAmount; }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}
