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

import com.smv.smvspringboot.entidade.PacienteCadastroEntity;
import com.smv.smvspringboot.pojo.PacienteCadastro;
import com.smv.smvspringboot.repositories.PacienteCadastroRepository;



@RestController
@RequestMapping("/pacientes")
public class PacienteCadastroController {

	private final PacienteCadastroRepository pacienteRepository;

	public PacienteCadastroController(PacienteCadastroRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;

	}

	@PostMapping

	public PacienteCadastroEntity create(@RequestBody PacienteCadastro paciente) {

		PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
		paciente1.setId(paciente.getId());
		paciente1.setCertidao(paciente.getCertidao());
		paciente1.setCnh(paciente.getCnh());
		paciente1.setEmail(paciente.getEmail());
		paciente1.setNomeMae(paciente.getNomeMae());
		paciente1.setNumeroSUS(paciente.getNumeroSUS());
		paciente1.setRaca(paciente.getRaca());
		paciente1.setRg(paciente.getRg());
		paciente1.setId(paciente.getId());
		paciente1.setNome(paciente.getNome());
		paciente1.setCpf(paciente.getCpf());
		paciente1.setSexo(paciente.getSexo());
		paciente1.setNascimento(paciente.getNascimento());
		paciente1.setEndereco(paciente.getEndereco());
		paciente1.setCep(paciente.getCep());
		pacienteRepository.save(paciente1);
		paciente.setId(paciente1.getId());

		return paciente1;
	}

	@GetMapping(path = "{id}")
	public PacienteCadastroEntity get(@PathVariable Long id) {

		PacienteCadastroEntity paciente = pacienteRepository.getById(id);
		PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
		paciente1.setId(paciente.getId());
		paciente1.setCertidao(paciente.getCertidao());
		paciente1.setCnh(paciente.getCnh());
		paciente1.setEmail(paciente.getEmail());
		paciente1.setNomeMae(paciente.getNomeMae());
		paciente1.setNumeroSUS(paciente.getNumeroSUS());
		paciente1.setRaca(paciente.getRaca());
		paciente1.setRg(paciente.getRg());
		paciente1.setId(paciente.getId());
		paciente1.setNome(paciente.getNome());
		paciente1.setCpf(paciente.getCpf());
		paciente1.setSexo(paciente.getSexo());
		paciente1.setNascimento(paciente.getNascimento());
		paciente1.setEndereco(paciente.getEndereco());
		paciente1.setCep(paciente.getCep());

		return paciente;

	}

	@PutMapping
	public PacienteCadastroEntity update(@RequestBody PacienteCadastroEntity paciente) {

		
		PacienteCadastroEntity paciente1 = pacienteRepository.getById(paciente.getId());
		paciente1.setCertidao(paciente.getCertidao());
		paciente1.setCnh(paciente.getCnh());
		paciente1.setEmail(paciente.getEmail());
		paciente1.setNomeMae(paciente.getNomeMae());
		paciente1.setNumeroSUS(paciente.getNumeroSUS());
		paciente1.setRaca(paciente.getRaca());
		paciente1.setRg(paciente.getRg());
		paciente1.setId(paciente.getId());
		paciente1.setNome(paciente.getNome());
		paciente1.setCpf(paciente.getCpf());
		paciente1.setSexo(paciente.getSexo());
		paciente1.setNascimento(paciente.getNascimento());
		paciente1.setEndereco(paciente.getEndereco());
		paciente1.setCep(paciente.getCep());
		paciente.setId(paciente1.getId());
		pacienteRepository.save(paciente1);

		return paciente;
	}

	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id) {

		pacienteRepository.deleteById(id);

	}

	@GetMapping
	public List<PacienteCadastroEntity> listAll() {

		List<PacienteCadastroEntity> listEntity = pacienteRepository.findAll();
		List<PacienteCadastroEntity> listPojo = new ArrayList<>();

		for (PacienteCadastroEntity entity : listEntity) {

			PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
			paciente1.setId(entity.getId());
			paciente1.setCertidao(entity.getCertidao());
			paciente1.setCnh(entity.getCnh());
			paciente1.setEmail(entity.getEmail());
			paciente1.setNomeMae(entity.getNomeMae());
			paciente1.setNumeroSUS(entity.getNumeroSUS());
			paciente1.setRaca(entity.getRaca());
			paciente1.setRg(entity.getRg());
			paciente1.setId(entity.getId());
			paciente1.setNome(entity.getNome());
			paciente1.setCpf(entity.getCpf());
			paciente1.setSexo(entity.getSexo());
			paciente1.setNascimento(entity.getNascimento());
			paciente1.setEndereco(entity.getEndereco());
			paciente1.setCep(entity.getCep());
			listPojo.add(paciente1);
		}

		return listPojo;
	}
}
