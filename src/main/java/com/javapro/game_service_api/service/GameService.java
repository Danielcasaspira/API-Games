package com.javapro.game_service_api.service;

import com.javapro.game_service_api.commons.entities.Game;

public interface GameService {

    public Game createGame(Game game);

    public Game getGameById(String id);

    public Game updateGame(String id, Game game);

    public void deleteGame(String id);

}
