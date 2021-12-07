package entities;

public class Produto {
    public String Nome;
    public double Preco;
    public int Quantidade;

    public double ValorTotalStoque(){
        return Preco * Quantidade;
    }

    public void AdicionarQuantidade(int QtAdd){
        Quantidade = Quantidade + QtAdd;
    }

    public void RemoverQuantidade(int QtRemove){
        Quantidade = Quantidade - QtRemove;
    }

    public String ToString(){
        return ("do Produto: "
                + Nome
                +", R$ "
                + String.format("%.2f",Preco) /////////////////formatar impressão
                + ", R$ "
                + Quantidade
                + String.format("%.2f",ValorTotalStoque())
        );
    }
}
