package com.teste.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.teste.primeiro_exemplo.model.Produto;
import com.teste.repository.Service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> ObterTodos(){
        return produtoService.ObterTodos();

    }
    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable Integer id){
        return produtoService.obterPorId(id);
    }
    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
         return produtoService.adicionar(produto);
    }
    @DeleteMapping("/(id)")
    public Sring deletar(@PathVariable Integer id ) {
        produtoService.deletar(id);
        return "Produto com id:" + id + "foi deletado com suceso!";
    }
    @PutMapping("/(id)")
    public Produto atualizar(@RequestBody Produto produto,
        @PathVariable integer id) {
            return produtoService.atualizar(id,produto);
        }
}
