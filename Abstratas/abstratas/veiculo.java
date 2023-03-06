package abstratas;

public class veiculo {
    private String cor = "Verde";
    private int qtdPessoas = 4;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void getQtPessoas(){
        return qtdPessoas;
    }
    public void setqtPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
    public void ligar(){
        System.out.println("[veiculo]:transportando.");
    }
    public void desligar(){
        System.out.println("[veiculo]:parado.");
    }
    
}