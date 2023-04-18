import java.util.List;
public class Pedido {
    public Massa massa;
    private Cliente cliente;
    List<Ingrediente> ingredientes;

    public double calcValor(){
        double valorTotal = massa.getValor() + (ingredientes.size() * 2);
        return valorTotal;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
