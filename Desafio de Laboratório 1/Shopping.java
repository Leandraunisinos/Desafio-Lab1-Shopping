package Shopping;

import java.util.ArrayList;

import Endereco.*;
import Loja.*;

import Produtos.*;

public class Shopping {
    private String nomeShopping;
    private Address enderecoShopping;
    private Produtos<Loja> Loja;
    private int BigStores

    public Shopping(String nomeShopping, Endereco enderecoShopping, int BigStores) {
        this.shoppingName = nomeShopping;
        this.shoppingAddress = enderecoShopping;

        if(BigStores <= 0) {
            System.out.println("Você precisa ter no mínimo 1 como quantidade máxima de lojas no shopping.");
            this.BigStores = 1;
        } else {
            this.BigStores = BigStores;
        }

        this.stores = new ArrayList<>(BigStores);
    }


    public String getnomeShopping() {
        return nomeShopping;
    }

    public void setnomeShopping(String nomeShopping) {
        this.nomeShopping = nomeShopping;
    }

    public Address getenderecoShopping() {
        return enderecoShopping;
    }

    public void setenderecoShopping(Endereco enderecoShopping) {
        this.enderecoShopping = enderecoShopping;
    }

    public ArrayList<Loja> getShoppingStores() {
        return Loja;
    }

    public void setShoppingStores(ArrayList<Store> shoppingStores) {
        this.loja = shoppingStores;
    }

    public int getBigStores() {
        return BigStores;
    }

    public void setbigStores(int BigStores) {
        this.BigStores = BigStores;
    }

    public boolean adicionarStore(Loja loja){
        System.out.println("Adicionando loja: " + loja.getNameStore());
            if(this.getShoppingStores().tamanho() < this.getBigStores()) {
                this.getShoppingStores().adicionar(Loja);
                System.out.println("Loja adicionada com sucesso!");
                return true;
            }


        System.out.println("Quantidade máxima de lojas alcançada: " + this.getBigStores());
        return false;
    }


    private boolean lojaDeEntregaShopping(String nomeLoja){
        for(int i = 0; i < this.getShoppingLoja().tamanho(); i++){
            if(this.getShoppingStores().get(i).getNomeloja().equals(nomeLoja)){
                System.out.println("A loja " + this.getShoppingStores().get(i).getNameStore() + " foi removida com sucesso.");
                this.getShoppingLoja().remover(i);
                return true;
            }
        }
        return false;
    }

    private int quantidaDeLojasPorTipo(String typeStore){
        int contar = 0;

        for(Loja loja: Loja) {
            if(typeStore.equalsIgnoreCase("Vestuário") && Loja instanceof Vestuario) {
                contar++;
            } else if (typeStore.equalsIgnoreCase("Cosmético") && Loja instanceof Cosmetico){
                contar++;
            } else if (typeStore.equalsIgnoreCase("Alimentação") && Loja instanceof Alimentacao){
                contar++;
            } else if (typeStore.equalsIgnoreCase("Bijuteria") && Loja instanceof Bijuteria){
                contar++;
            } else if (typeStore.equalsIgnoreCase("Informática") && Loja instanceof Informatica){
                contar++;
            }
        }

        if (contar == 0) {
            return -1;
        }

        return contar;
    }


    public Loja lojaDeSeguro() {
        Loja lojaDeSeguro = null;
        double valorSeguro = 0;

        for(Loja loja: Loja) {
            if (loja instanceof Informatica lojaInformatica) {
                double valorSeguro = lojaInformatica.getEletronica();

                if (valorSeguro > valorSeguro) {
                    maiorValor = valorSeguro;
                    lojaCara = lojaInformatica;
                }
            }
        }

        return lojaCara;
    }
}