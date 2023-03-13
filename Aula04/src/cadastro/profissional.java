package cadastro;

public class profissional {
    private  String codigo,email,nome;
    private double salario,percentual,imposto;

    public profissional(String codigo,String nome, String email,  double salario) {
        this.codigo = codigo;
        this.email = email;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        this.salario*=((percentual/100)+1);
        System.out.println("o novo valor do salário é: "+salario);
    }


    }


