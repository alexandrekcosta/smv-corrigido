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

import com.smv.smvspringboot.entidade.VacinaEntity;
import com.smv.smvspringboot.repositories.VacinaRepository;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

	private final VacinaRepository vacinaRepository;

	public VacinaController(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	@PostMapping

	public VacinaEntity create(@RequestBody VacinaEntity vacina) {

		VacinaEntity vacina1 = new VacinaEntity();
		vacina1.setNome(vacina.getNome());
		vacina1.setDoses(vacina.getDoses());
		vacina1.setData(vacina.getData());
		vacina1.setDosesDescricao(vacina.getDosesDescricao());
		return vacina;
	}

	@GetMapping(path = "{id}")
	public VacinaEntity get(@PathVariable Long id) {

		VacinaEntity entity = vacinaRepository.getById(id);
		VacinaEntity vacina1 = new VacinaEntity();
		vacina1.setNome(entity.getNome());
		vacina1.setDoses(entity.getDoses());
		vacina1.setData(entity.getData());
		vacina1.setDosesDescricao(entity.getDosesDescricao());

		return vacina1;

	}

	@PutMapping
	public VacinaEntity update(@RequestBody VacinaEntity vacina) {

		VacinaEntity vacina1 = new VacinaEntity();
		vacina1.setNome(vacina.getNome());
		vacina1.setDoses(vacina.getDoses());
		vacina1.setData(vacina.getData());
		vacina1.setDosesDescricao(vacina.getDosesDescricao());
		vacina1 = vacinaRepository.save(vacina1);
		vacina.setId(vacina1.getId());

		return vacina;
	}

	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id) {

		vacinaRepository.deleteById(id);

	}

	@GetMapping
	public List<VacinaEntity> listAll() {

		List<VacinaEntity> listEntity = vacinaRepository.findAll();
		List<VacinaEntity> listPojo = new ArrayList<>();

		for (VacinaEntity entity : listEntity) {

			VacinaEntity vacina1 = new VacinaEntity();
			vacina1.setNome(entity.getNome());
			vacina1.setDoses(entity.getDoses());
			vacina1.setData(entity.getData());
			vacina1.setDosesDescricao(entity.getDosesDescricao());
			listPojo.add(vacina1);
		}

		return listPojo;

	}
}
