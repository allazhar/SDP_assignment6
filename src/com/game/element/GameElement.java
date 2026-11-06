package com.game.element;

public interface GameElement {
    void accept(GameVisitor visitor);
}
