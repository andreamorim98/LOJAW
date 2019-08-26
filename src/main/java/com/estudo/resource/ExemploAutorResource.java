package com.estudo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ad.exception.CampoObrigatorioException;
import com.ad.sc.entities.Autor;
import com.ad.sc.entities.Livro;
import com.ad.sc.service.AutorService;

@RestController
@RequestMapping("/autores")
public class ExemploAutorResource {
	
	
	@Autowired
	AutorService autorService;
	
	@GetMapping("/todosAutores")
	public Page<Autor> todosAutores (int nrPagina, int tamPagina){
		Page<Autor> resultado = null;
		resultado = autorService.todosAutores(nrPagina,tamPagina);
		return resultado;
	}
	
	@GetMapping("/buscaNomeAutor")
	public List<Autor> buscaNomeAutor (String nmAutor){
		List<Autor> resultado = null;
		resultado = autorService.buscaNomeAutor(nmAutor);
		return resultado;
	}
	
	
	
	@GetMapping("/pesquisar")
	public List<Autor> pesquisar (Autor filtro){
		List<Autor> resultado = null;
		resultado = autorService.pesquisar(filtro);
		return resultado;
	}
	
	
	
	@GetMapping("/buscaPorQualquerParteNomeAutor")
	public List<Autor> buscaPorQualquerParteNomeAutor (String nmAutor){
		List<Autor> resultado = null;
		resultado = autorService.buscaPorQualquerParteNomeAutor(nmAutor);
		return resultado;
	}
	
	@PostMapping("/novoAutor")
	public Autor saveAutor(@RequestBody Autor autor) throws CampoObrigatorioException {
		Autor autorSalvo = null;
		autorSalvo = autorService.save(autorSalvo);
		return autorSalvo;
	}
	
	@PutMapping("/updateAutor")
	public Autor atualiza( Autor a) {
		return autorService.atualiza(a);
	}
    
	
	@DeleteMapping("/deletarAutor")
    public void delete(@PathVariable Long idAutor) {
		autorService.delete(idAutor);
	}
	

}
