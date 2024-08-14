package com.javapro.game_service_api.controller;

import com.javapro.game_service_api.entities.Game;
import com.javapro.game_service_api.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public Game createGame(@RequestBody Game game){
        return gameService.createGame(game);
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable("id") String gameId){
        return gameService.getGameById(gameId);
    }

}
