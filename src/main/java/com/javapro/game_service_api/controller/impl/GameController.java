package com.javapro.game_service_api.controller.impl;

import com.javapro.game_service_api.commons.entities.Game;
import com.javapro.game_service_api.controller.GameApi;
import com.javapro.game_service_api.service.GameService;
import com.javapro.game_service_api.service.impl.GameServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController implements GameApi {

    private final GameService gameService;

    public GameController(GameServiceImpl gameServiceImpl) {
        this.gameService = gameServiceImpl;
    }

    @Override
    public Game createGame(@RequestBody Game game){
        return gameService.createGame(game);
    }

    @Override
    public Game getGameById(@PathVariable("id") String gameId){
        return gameService.getGameById(gameId);
    }

    @Override
    public Game updateGame(String id, Game game) {
        return gameService.updateGame(id, game);
    }

    @Override
    public void deleteGame(String id) {
        gameService.deleteGame(id);
    }

}
