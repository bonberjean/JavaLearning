package encapsulamento;

public class Imprimir{
    private String nome;
    private String sobrenome;

    public void ImprimeTela(String nome, String sobrenome){
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");

        this.nome = nome;
        this.sobrenome = sobrenome;

        JOptionPane.showMessageDialog(null, this.nome + " " + this.sobrenome);
    }
}