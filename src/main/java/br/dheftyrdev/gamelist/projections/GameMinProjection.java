package br.dheftyrdev.gamelist.projections;

public interface GameMinProjection {
	Long getId();
	String getTitulo();
	Integer getAno();
	String getImgUrl();
	String getCurtaDescricao();
	Integer getPosicao();
}
