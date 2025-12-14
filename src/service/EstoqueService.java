package service;

import model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EstoqueService {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("=== Produtos no Estoque ===");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public void venderProduto(int id, int quantidade) {
        Optional<Produto> prodOpt = produtos.stream().filter(p -> p.getId() == id).findFirst();
        if (prodOpt.isPresent()) {
            prodOpt.get().vender(quantidade);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void removerProduto(int id) {
        Optional<Produto> prodOpt = produtos.stream().filter(p -> p.getId() == id).findFirst();
        if (prodOpt.isPresent()) {
            produtos.remove(prodOpt.get());
            System.out.println("Produto removido: " + prodOpt.get().getNome());
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
