package ExerciciosAula11;

public class Boleto extends Pagamento{
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto(String nomeDoPagador, String cpf, Double valorASerPago, String numeroDoCheque, String numeroDoBoleto, int dia, int mes , int ano){
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoBoleto = numeroDoBoleto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //METODO DE ACESSO
    public String getNumeroDoBoleto(){
        return numeroDoBoleto;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    //METODOS MODIFICADORES
    public void setNumeroDoBoleto(String numeroDoBoleto){
        this.numeroDoBoleto = numeroDoBoleto;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    
}