package bytebankencapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        // conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente douglas = new Cliente();

        //conta.Titular = douglas;
        conta.setTitular(douglas);
        douglas.setNome("Douglas Crepes");

        System.out.println(conta.getTitular().getNome());
        System.out.println(douglas.getNome());

        conta.getTitular().setProfissao("programador");
        //escrevendo a mesma coisa em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(douglas);
        System.out.println(conta.getTitular());



    }
}
