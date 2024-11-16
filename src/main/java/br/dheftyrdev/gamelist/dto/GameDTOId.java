package br.dheftyrdev.gamelist.dto;

import org.springframework.beans.BeanUtils;

import br.dheftyrdev.gamelist.entities.Game;

public class GameDTOId {
	
	private Long id;
	private String titulo;
	private String ano;
	private String genero;
	private String plataforma;
	private Double score;
	private String imgUrl;
	private String curtaDescricao;
	private String longaDescricao;
	
	public GameDTOId() {}

	public GameDTOId(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getCurtaDescricao() {
		return curtaDescricao;
	}

	public void setCurtaDescricao(String curtaDescricao) {
		this.curtaDescricao = curtaDescricao;
	}

	public String getLongaDescricao() {
		return longaDescricao;
	}

	public void setLongaDescricao(String longaDescricao) {
		this.longaDescricao = longaDescricao;
	}
	
	
	
	
}
