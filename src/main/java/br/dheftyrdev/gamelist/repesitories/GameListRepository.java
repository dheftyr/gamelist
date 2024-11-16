package br.dheftyrdev.gamelist.repesitories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dheftyrdev.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
