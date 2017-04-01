import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {

	@Test
	public void test() {
		Conta c1, c2, c3, c4;
		Pessoa p, p1, p2, p3;
		p = new Pessoa("Gabriel", 154);
		p1 =  new Pessoa("Jao", 198);
		p2 =  new Pessoa("bilu", 198);
		p3 =  new Pessoa("joca", 198);
		c1 = new Conta(1, p);
		c2 = new Conta(2, p1);
		c3 = new Conta(3, p2);
		c4 = new Conta(4, p3);
		ListaDeContas lista = new ListaDeContas();
		
		lista.inserir(c1);
		lista.inserir(c2);
		lista.inserir(c3);
		lista.inserir(c4);
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println(lista.procucar(i+1).getPessoa().getNome());
		}
		
		lista.remover(c2.getNumero());
		lista.remover(c1.getNumero());
		
		for (int i = 0; i < 4; i++) {
			if(lista.procucar(i+1) == null )
				System.out.println("vazio");
			else
				System.out.println(lista.procucar(i+1).getPessoa().getNome());
		}
	}
}


