package br.dheftyrdev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dheftyrdev.gamelist.dto.GameDTOId;
import br.dheftyrdev.gamelist.dto.GameMinDTO;
import br.dheftyrdev.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTOId findById(@PathVariable Long id){
		return gameService.findById(id);
		}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
		}
}
