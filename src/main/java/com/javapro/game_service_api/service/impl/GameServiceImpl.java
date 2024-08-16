package com.javapro.game_service_api.service.impl;

import com.javapro.game_service_api.commons.entities.Game;
import com.javapro.game_service_api.repositories.GameRepository;
import com.javapro.game_service_api.service.GameService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game createGame(Game game){
        return gameRepository.save(game);
    }


    @Override
    public Game getGameById(String id){
        return gameRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new NoSuchElementException("Game not found"));
    }

    @Override
    public Game updateGame(String id, Game game) {

        Game existingGame = gameRepository.findById(Long.valueOf(id)).orElseThrow(() ->
                new NoSuchElementException("Game not found"));
        existingGame.setName(game.getName());
        return gameRepository.save(existingGame);
    }

    @Override
    public void deleteGame(String id) {
        gameRepository.deleteById(Long.valueOf(id));
    }

}
