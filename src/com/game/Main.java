package com.game;

import com.game.element.Chest;
import com.game.element.GameElement;
import com.game.element.Monster;
import com.game.element.QuestItem;
import com.game.visitor.BalanceValidationVisitor;
import com.game.visitor.GameVisitor;
import com.game.visitor.JsonExportVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameElement> worldElements = new ArrayList<>();
        worldElements.add(new Monster("Dragon", 500, 120));
        worldElements.add(new Chest("Epic", 1500));
        worldElements.add(new QuestItem("Ancient Amulet", true));
        worldElements.add(new Monster("Goblin", 50 ,15));

        GameVisitor jsonExporter = new JsonExportVisitor();
        GameVisitor balanceValidator = new BalanceValidationVisitor();

        System.out.println("=== EXPORTING WORLD ELEMENTS TO JSON ===");
        for (GameElement element: worldElements) {
            element.accept(jsonExporter);
        }

        System.out.println("\n=== RUNNING BALANCE VALIDATION ===");
        for(GameElement element: worldElements) {
            element.accept(balanceValidator);
        }
    }
}
