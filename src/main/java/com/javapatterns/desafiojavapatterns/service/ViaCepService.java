package com.javapatterns.desafiojavapatterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javapatterns.desafiojavapatterns.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}