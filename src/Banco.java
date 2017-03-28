
public class Banco {

	public static void main(String[] args) {
		Conta c1, c2;
		Pessoa p;
		p = new Pessoa("Gabriel", 154);
		c1 = new Conta(888, p);
		c2 = new Conta(7847, p);
		
		
		c1.Credito(100);
		c1.Debito(5);
		c2.Credito(1002);
		c2.Debito(100);
		
		c1.getExtrato();
		c2.getExtrato();
	}

}
