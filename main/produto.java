public class produto {
    String name;
    String fabricante;
    double preco;
    public produto(String name, String fab, double preco){
        this.name=name;
        this.fabricante=fab;
        this.preco=preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "produto{" +
                "name='" + name + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }
}