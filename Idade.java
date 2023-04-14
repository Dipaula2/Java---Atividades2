
package Banco;


public class Idade {
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;

     public Idade(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calculaIdade(int diaHoje , int mesHoje , int anoHoje) {
        int idade = anoHoje - getAno();
        if (mesHoje < getMes() || (mesHoje == getMes() && diaHoje < getDia())) {
            idade--;
        }
        this.setIdade(idade);
    }

    public int informaIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
    
    
    
    
    
    
}
