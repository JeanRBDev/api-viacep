package com.jrodrigues.viacep.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jrodrigues.viacep.dto.Endereco;

@FeignClient(url="https://viacep.com.br/ws/", name="viacep")
public interface CepClient {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}
