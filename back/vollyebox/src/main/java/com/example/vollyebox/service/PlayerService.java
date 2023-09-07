package com.example.vollyebox.service;

import com.example.vollyebox.domain.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

public Optional<Player> getPlayer(int playerId);
public Player addPlayer(Player player);
public Player updatePlayer(Player player);

public List<Player> searchPlayers(String search);

public void deletePlayer(int playerId);

}
