package Models;

import utils.Utils;

public class Produto {
    private static int count = 1;

    private final int id;
    private String nome;
    private Double price;


    public Produto(String nome, Double price) {

        this.id =  count;
        this.nome = nome;
        this.price = price;
        Produto.count += 1;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Id: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nPreço"  + Utils.doubleToString(this.getPrice());
    }
}

