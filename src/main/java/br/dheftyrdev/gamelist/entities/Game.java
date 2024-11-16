package br.dheftyrdev.gamelist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double score;
	private String imgUrl;
	private String curtaDescricao;
	@Column(columnDefinition = "TEXT")
	private String longaDescricao;
	
	public Game() {}

	public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double score, String imgUrl,
			String curtaDescricao, String longaDescricao) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.score = score;
		this.imgUrl = imgUrl;
		this.curtaDescricao = curtaDescricao;
		this.longaDescricao = longaDescricao;
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
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

	public void setIgmUrl(String imgUrl) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}	
}