package com.game.element;

import com.game.visitor.GameVisitor;

public interface GameElement {
    void accept(GameVisitor visitor);
}
