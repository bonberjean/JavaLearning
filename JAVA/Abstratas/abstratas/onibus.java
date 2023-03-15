package abstratas;

public class onibus extends veiculo{
    @Override //sobrecarregando metodo
    public void ligar(){
        System.out.println("[Onibus]: Ligado");
    }
    @Override //sobrecarregando médoto
    public void desligar(){
        System.out.println("[Onibus]: Desligado");
    }
    /*@Override //sobrecarregando método
    public void transportar(){
        System.out.println("[Onibus]: Transportando");
    }*/
}