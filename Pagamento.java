package ExerciciosAula11;

public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private Double  valorASerPago;
    //CONSTRUTOR
    public Pagamento(String nomeDoPagador, String cpf, Double valorASerPago){
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }
    //METODOS ACESSO
    public String getNomeDoPagador(){
        return nomeDoPagador;
    }
    public String getCpf(){
        return cpf;
    }
    public Double getValorASerPago(){
        return valorASerPago;
    }
    //METODOS MODIFICADORES
    public void setNomeDoPagador(String nomeDoPagador){
        this.nomeDoPagador = nomeDoPagador;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setValorASerPago(Double valorASerPago){
        this.valorASerPago = valorASerPago;
    }

    public String toString(){
        return getNomeDoPagador() + getCpf() + getValorASerPago();
    }
    

}