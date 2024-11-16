package br.dheftyrdev.gamelist.dto;

import br.dheftyrdev.gamelist.entities.Game;
import br.dheftyrdev.gamelist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String curtaDescricao;
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		curtaDescricao = entity.getCurtaDescricao();
	}
	
	public GameMinDTO(GameMinProjection projectio) {
		id = projectio.getId();
		titulo = projectio.getTitulo();
		ano = projectio.getAno();
		imgUrl = projectio.getImgUrl();
		curtaDescricao = projectio.getCurtaDescricao();
		}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getCurtaDescricao() {
		return curtaDescricao;
	}
	
}
