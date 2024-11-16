package br.dheftyrdev.gamelist.dto;

import br.dheftyrdev.gamelist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String nome;
	
	public GameListDTO (GameList entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}	
	
	
}
