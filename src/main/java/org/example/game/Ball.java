package org.example.game;

public record Ball(Position position, Velocity velocity, float radius) implements GameObject {
    public Ball withNewPosition(Position newPos) {
        return new Ball(newPos, velocity, radius);
    }

    public Ball withNewVelocity(Velocity newVel) {
        return new Ball(position, newVel, radius);
    }
}


