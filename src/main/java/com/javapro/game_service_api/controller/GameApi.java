package com.javapro.game_service_api.controller;

import com.javapro.game_service_api.commons.constants.ApiPathVariables;
import com.javapro.game_service_api.commons.entities.Game;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {

    @PostMapping
    public Game createGame(@RequestBody Game game);

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable("id") String gameId);

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable String id, @RequestBody Game game);

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable String id);

}
