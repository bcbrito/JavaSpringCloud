package br.com.bcbrito.microservice.loja.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bcbrito.microservice.loja.controller.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {
	@RequestMapping(method = RequestMethod.POST)
	public String realizaCompra(@RequestBody CompraDTO compra) 
	{
		return "Compra realizada com Sucesso!";
	}
}
