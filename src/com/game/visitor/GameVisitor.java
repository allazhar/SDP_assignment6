package com.game.visitor;

import com.game.element.Chest;
import com.game.element.Monster;
import com.game.element.QuestItem;

public interface GameVisitor {
    void visit(Monster monster);
    void visit(Chest chest);
    void visit(QuestItem questItem);
}
