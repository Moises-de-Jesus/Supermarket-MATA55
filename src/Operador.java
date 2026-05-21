"Classe operadora"

public class Operador extends Funcionario
{
    private double horasExtra;
    private double valorExtra;

    public Operador(String nome, String cpf, double salario, double horasExtra, double valorExtra)
    {
        super(nome, cpf, salario);
        this.horasExtra = horasExtra;
        this.valorExtra = valorExtra;
    }
    
    public double realizarExtra(double x){
        return this.horasExtra += x;
    }
    @Override
    public double calcSalario(){
        return super.getSalario() + (this.valorExtra*this.horasExtra);
    }
}