package br.dheftyrdev.gamelist.repesitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.dheftyrdev.gamelist.entities.Game;
import br.dheftyrdev.gamelist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	@Query(nativeQuery = true, value = """
		SELECT game.id, game.titulo, game.ano, game.img_url AS imgUrl,
		game.curta_descricao AS curtaDescricao, belonging.posicao
		FROM game
		INNER JOIN belonging ON game.id =  belonging.id_game
		WHERE belonging.id_list = :listId
		ORDER BY belonging.posicao
					""")
	List<GameMinProjection> searchByList(Long listId);
			
}
