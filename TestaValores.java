package bytebankencapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        

        //conta inconsistente 
        conta.setAgencia(-50);
        conta.setNumero(-330);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 16549);
        conta2.setAgencia(11);

        System.out.println(Conta.getTotal());
    }
}
