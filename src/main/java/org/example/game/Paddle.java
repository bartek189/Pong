package org.example.game;

public record Paddle(Position position, Velocity velocity, float width, float height)
        implements GameObject {
    public Paddle moveVertically(float deltaY) {
        return new Paddle(
                new Position(position.x(), position.y() + deltaY),
                velocity,
                width,
                height
        );
    }
}
