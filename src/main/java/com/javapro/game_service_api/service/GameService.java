package com.javapro.game_service_api.service;

import com.javapro.game_service_api.entities.Game;
import com.javapro.game_service_api.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.NoSuchElementException;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game createGame(Game game){
        return gameRepository.save(game);
    }


    public Game getGameById(String id){
        return gameRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new NoSuchElementException("Game not found"));
    }

}
