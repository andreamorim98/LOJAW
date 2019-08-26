package com.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ad.exception.CampoObrigatorioException;
import com.ad.sc.entities.Autor;
import com.ad.sc.repository.AutorRepository;

@Service
public class ExemploAutorService {

	@Autowired
	AutorRepository autorRepository;
	
	final int tamPaginaDefault = 10;
	
	public Page<Autor> todosAutores(int nrPagina, int tamPagina ){
		
		if (tamPagina == 0) {
			tamPagina = tamPaginaDefault; 
		}
		
		Pageable paginaPadrao = PageRequest.of(nrPagina, tamPagina);
		
		Page<Autor> resultado = null;
		
		
		resultado = autorRepository.findAll(paginaPadrao);
		return resultado;
	}

	public Autor save(Autor autor) throws CampoObrigatorioException {
		if(autor.getNmAutor() == null || autor.getNmAutor().length() == 0 || autor.getNmAutor().equals("")) {
			  throw new CampoObrigatorioException("Nome  do autor é Obrigatório");
			 
		} else {
			return autorRepository.save(autor);
		}
	}
	
	public Autor getById(Long idAutor) {
		return autorRepository.findById(idAutor).get();
	}
	
	public void delete(Long idAutor) {
		autorRepository.deleteById(idAutor);

	}
	public Autor atualiza(Autor a)  {
		return autorRepository.save(a);
	}
	
	public List<Autor> buscaNomeAutor (String nmAutor){
		return autorRepository.findByNmAutor(nmAutor);
	}
	
	public List<Autor> buscaPorQualquerParteNomeAutor (String nmAutor){
		return autorRepository.findByNmAutor(nmAutor);
	}
	
	public List<Autor> pesquisar(Autor filtro){
		return autorRepository.pesquisar(filtro);
	} 
}
