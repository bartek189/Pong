package org.example.model;


public record GameState(
        String gameId,
        PlayerState player1,
        PlayerState player2,
        BallState ball,
        int scorePlayer1,
        int scorePlayer2,
        GameStatus status
) {
    public sealed interface GameStatus {
        record Playing() implements GameStatus {}
        record Paused() implements GameStatus {}
        record Finished(String winner) implements GameStatus {}
    }
}