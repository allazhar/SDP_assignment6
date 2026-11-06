package com.game.visitor;

import com.game.element.Chest;
import com.game.element.Monster;
import com.game.element.QuestItem;

public class BalanceValidationVisitor implements GameVisitor{
    @Override
    public void visit(Monster monster) {
        if(monster.getDamage() > 100) {
            System.out.println("[Balance Warning] Monster '" + monster.getName() + "' has excessive damage: " + monster.getDamage());
        } else {
            System.out.println("[Balance OK] Monster '" + monster.getName() + "' damage is balanced.");
        }
    }

    @Override
    public void visit(Chest chest) {
        if(chest.getGoldAmount() > 1000) {
            System.out.println("[Balance Warning] Chest '" + chest.getTier() + "' gives too much gold: " + chest.getGoldAmount());
        } else {
            System.out.println("[Balance OK] Chest gold reward is reasonable.");
        }
    }

    @Override
    public void visit(QuestItem questItem) {
        System.out.println("[Balance Info] Quest item '" + questItem.getItemName() + "' checked. No balance impact.");
    }
}
