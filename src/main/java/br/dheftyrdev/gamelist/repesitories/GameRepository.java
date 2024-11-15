package br.dheftyrdev.gamelist.repesitories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dheftyrdev.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
