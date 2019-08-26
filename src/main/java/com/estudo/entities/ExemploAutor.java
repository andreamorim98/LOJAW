package com.estudo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOR")
public class ExemploAutor {
	
	@Id
	@Column(name = "ID_AUTOR")
	private Long idAutor;
	
	@Column(name="ID_LIVRO")
    private Long idLivro;
	
	@Column(name = "NM_AUTOR")
	private String nmAutor;
	
	@Column(name = "CPF_AUTOR")
	private String cpfAutor;
	
	@OneToMany
	@JoinColumn(name = "ID_AUTOR")
	private List< Livro> livros;

	

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setCpfAutor(String cpfAutor) {
		this.cpfAutor = cpfAutor;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNmAutor() {
		return nmAutor;
	}

	public void setNmAutor(String nmAutor) {
		this.nmAutor = nmAutor;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	

}
