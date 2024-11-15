package br.dheftyrdev.gamelist.dto;

import br.dheftyrdev.gamelist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String titulo;
	private String ano;
	private String imgUrl;
	private String curtaDescricao;
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		curtaDescricao = entity.getCurtaDescricao();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getCurtaDescricao() {
		return curtaDescricao;
	}
	
	
}
