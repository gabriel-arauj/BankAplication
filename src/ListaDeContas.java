
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
	public ListaDeContas remover(Conta c){
		if(c == null)
			return null;
		if(this.c == c){
			this.c = prox.c;
			prox = prox.prox;
			return prox;
		}else
			return prox.remover(c);
	}
	public ListaDeContas() {
		c = null;
		prox = null;
	}
	
}
