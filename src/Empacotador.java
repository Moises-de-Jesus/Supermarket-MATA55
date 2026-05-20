class Empacotador extends Funcionario{
    private boolean deficiencia;

    public Empacotador(String nome,String cpf, double salario, boolean deficiencia){
        super(nome,cpf,salario);
        this.deficiencia=deficiencia;
    }

    public boolean temAumento(){

    }
    @Override
    public double calcSalario(){
        if (this.deficiencia)
            return super.calcSalario()*1.1;
        return super.calcSalario();
    }


}