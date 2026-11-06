package com.game.element;

public class QuestItem implements GameElement {
    private final String itemName;
    private final boolean isLegendary;

    public QuestItem(String itemName, boolean isLegendary) {
        this.itemName = itemName;
        this.isLegendary = isLegendary;
    }

    public String getItemName() {return itemName;}
    public boolean IsLegendary() {return isLegendary;}

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}
