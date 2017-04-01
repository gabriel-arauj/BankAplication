
public class ListaDeContas {
	private Conta c;
	private ListaDeContas prox;
	
	public void inserir(Conta c){
		if(this.c == null){
			this.c = c;
			prox = new ListaDeContas();
		}else{
			prox.inserir(c);
		}
	}
	public Conta procucar(int id){
		if(c == null)
			return null;
		if(c.getNumero() == id){
			return c;
		}else
			return prox.procucar(id);
	}
	public void remover(int num){
		if(c == null)
			return;
		if(this.c.getNumero() == num){
			this.c = prox.c;
			prox = prox.prox;
			return;
		}else
			prox.remover(num);
			return;
	}
	public ListaDeContas() {
		c = null;
		prox = null;
	}
	
}
