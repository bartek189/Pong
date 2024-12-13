package org.example.game;

public sealed interface GameObject permits Ball, Paddle {
    record Position(float x, float y) {}
    record Velocity(float x, float y) {}

    Position position();
    Velocity velocity();
}
