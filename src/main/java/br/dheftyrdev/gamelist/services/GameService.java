package br.dheftyrdev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dheftyrdev.gamelist.dto.GameDTOId;
import br.dheftyrdev.gamelist.dto.GameMinDTO;
import br.dheftyrdev.gamelist.entities.Game;
import br.dheftyrdev.gamelist.repesitories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTOId findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTOId(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
