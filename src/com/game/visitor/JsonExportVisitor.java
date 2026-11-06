package com.game.visitor;

import com.game.element.Chest;
import com.game.element.Monster;
import com.game.element.QuestItem;

public class JsonExportVisitor implements GameVisitor {
    @Override
    public void visit(Monster monster) {
        System.out.println("{ \"type:\": \"Monster\", \"name\": \"" + monster.getName() +
                             "\", \"Health\": " + monster.getHealth() +
                             "\", \"Damaage\": " + monster.getDamage() + " }");
    }

    @Override
    public void visit(Chest chest) {
        System.out.println("{ \"type\": \"Chest\", \"tier\": \"" + chest.getTier() +
                             "\", \"gold\": " + chest.getGoldAmount() + " }");
    }

    @Override
    public void visit(QuestItem questItem) {
        System.out.println("{ \"type\": \"QuestItem\", \"name\": \"" + questItem.getItemName() +
                             "\" \"legendary\": " + questItem.IsLegendary() + " }");
    }
}
