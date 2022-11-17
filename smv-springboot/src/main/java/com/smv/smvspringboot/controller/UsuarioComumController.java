package com.smv.smvspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smv.smvspringboot.entidade.UsuarioComumEntity;
import com.smv.smvspringboot.repositories.UsuarioComumRespository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioComumController {

	private final UsuarioComumRespository UsuarioComumRepository;

	public UsuarioComumController(UsuarioComumRespository UsuarioComumRepository) {
		this.UsuarioComumRepository = UsuarioComumRepository;
	}

	@PostMapping
	public UsuarioComumEntity create(@RequestBody UsuarioComumEntity usuario) {

		UsuarioComumEntity UCEntity = new UsuarioComumEntity();
		UCEntity.setCertidao(usuario.getCertidao());
		UCEntity.setCnh(usuario.getCnh());
		UCEntity.setEmail(usuario.getEmail());
		UCEntity.setNomeMae(usuario.getNomeMae());
		UCEntity.setNumeroSUS(usuario.getNumeroSUS());
		UCEntity.setRaca(usuario.getRaca());
		UCEntity.setRg(usuario.getRg());
		UCEntity.setId(usuario.getId());
		UCEntity.setNome(usuario.getNome());
		UCEntity.setCpf(usuario.getCpf());
		UCEntity.setSexo(usuario.getSexo());
		UCEntity.setNascimento(usuario.getNascimento());
		UCEntity.setEndereco(usuario.getEndereco());
		UCEntity.setCep(usuario.getCep());
		
		UsuarioComumRepository.save(UCEntity);

		return usuario;

	}

	@GetMapping(path = "{id}")
	public UsuarioComumEntity get(@PathVariable Long id) {

		UsuarioComumEntity entity = UsuarioComumRepository.getById(id);
		UsuarioComumEntity usuario = new UsuarioComumEntity();
		usuario.setEmail(entity.getEmail());
		usuario.setCertidao(entity.getCertidao());
		usuario.setCnh(entity.getCnh());
		usuario.setEmail(entity.getEmail());
		usuario.setNomeMae(entity.getNomeMae());
		usuario.setNumeroSUS(entity.getNumeroSUS());
		usuario.setRaca(entity.getRaca());
		usuario.setRg(entity.getRg());
		usuario.setId(entity.getId());
		usuario.setNome(entity.getNome());
		usuario.setCpf(entity.getCpf());
		usuario.setSexo(entity.getSexo());
		usuario.setNascimento(entity.getNascimento());
		usuario.setEndereco(entity.getEndereco());
		usuario.setCep(entity.getCep());

		return usuario;

	}

	@PutMapping
	public UsuarioComumEntity update(@RequestBody UsuarioComumEntity usuario) {

		UsuarioComumEntity usuarioEntity = new UsuarioComumEntity();
		usuarioEntity.setId(usuario.getId());
		usuarioEntity.setEmail(usuario.getEmail());
		usuarioEntity.setCertidao(usuario.getCertidao());
		usuarioEntity.setCnh(usuario.getCnh());
		usuarioEntity.setEmail(usuario.getEmail());
		usuarioEntity.setNomeMae(usuario.getNomeMae());
		usuarioEntity.setNumeroSUS(usuario.getNumeroSUS());
		usuarioEntity.setRaca(usuario.getRaca());
		usuarioEntity.setRg(usuario.getRg());
		usuarioEntity.setId(usuario.getId());
		usuarioEntity.setNome(usuario.getNome());
		usuarioEntity.setCpf(usuario.getCpf());
		usuarioEntity.setSexo(usuario.getSexo());
		usuarioEntity.setNascimento(usuario.getNascimento());
		usuarioEntity.setEndereco(usuario.getEndereco());
		usuarioEntity.setCep(usuario.getCep());
		
		UsuarioComumRepository.save(usuarioEntity);
		
		return usuario;
	}

	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id) {

		UsuarioComumRepository.deleteById(id);

	}

	@GetMapping
	public List<UsuarioComumEntity> listAll() {

		List<UsuarioComumEntity> listEntity = UsuarioComumRepository.findAll();
		List<UsuarioComumEntity> listPojo = new ArrayList<>();

		for (UsuarioComumEntity entity : listEntity) {

			UsuarioComumEntity usuario = new UsuarioComumEntity();
			usuario.setEmail(entity.getEmail());
			usuario.setCertidao(entity.getCertidao());
			usuario.setCnh(entity.getCnh());
			usuario.setEmail(entity.getEmail());
			usuario.setNomeMae(entity.getNomeMae());
			usuario.setNumeroSUS(entity.getNumeroSUS());
			usuario.setRaca(entity.getRaca());
			usuario.setRg(entity.getRg());
			usuario.setId(entity.getId());
			usuario.setNome(entity.getNome());
			usuario.setCpf(entity.getCpf());
			usuario.setSexo(entity.getSexo());
			usuario.setNascimento(entity.getNascimento());
			usuario.setEndereco(entity.getEndereco());
			usuario.setCep(entity.getCep());
			listPojo.add(usuario);
		}

		return listPojo;

	}

}
