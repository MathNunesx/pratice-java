import javax.swing.JOptionPane;
public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;

    public ContaCorrente(String nome, float saldo, float limite, char tipo){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }
    public ContaCorrente(){}

    public void cadastrarDados(){
        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta: "));
        limite = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta: "));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (J ou F): ").charAt(0);
    }

    public String imprimeDados(){
        return tipo + "Dados da conta Corrente: "
                +"\nNome: " + nome
                +"\nSaldo: " + saldo
                +"\nLimite: " + limite
                +"\nTipo: " + tipo;
    }

    public void sacar(float valor){
        if(saldo > valor){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo negativo ------> pobre");
        }
    }
}
