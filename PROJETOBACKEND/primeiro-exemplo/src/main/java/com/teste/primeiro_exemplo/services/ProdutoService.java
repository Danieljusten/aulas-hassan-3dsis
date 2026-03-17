package com.teste.repository.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.repository.ProdutoRepository;

@Service

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Método para retornar uma lista de produtos.
     * @return Lista de produtos.
     */

    public List<Produto> obterTodos (){
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retorna o produto encontrado pelo seu Id.
     * @param id do produto que será localizado.
     * @return retorna um produto caso seja enocntrado.
     */

    public Optinal<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }

    /**
     * Método para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return retorna o produto que foi adicionado na lista.
     */

    public Produto adicionar(Produto produto) {
        return produtoRepository.adicionar(produto);
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto a ser deletado.
     */

    public void deletar (Integer id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto) {
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }
}