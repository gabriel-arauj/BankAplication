
public class Conta {
	private int numero;
	private float saldo;
	private Pessoa p;
	private String texto;
	
	
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public Pessoa getPessoa(){
		return p;
	}
	
	public void getExtrato(){
		String extrato = "Nome: " + p.getNome() + " Conta: " + getNumero() + "\n" + texto;
		System.out.println(extrato + "\nSaldo = "+ getSaldo() + "\n\n"); 
	}
	public void Debito(float n){
		saldo -= n;
		Registro("Debito: - R$ "+n+"\n");
	}
	public void Credito(float n){
		saldo += n;
		Registro("Credito: + R$ "+n+"\n");
	}
	private void Registro(String texto){
		this.texto += texto;
	}
	public Conta(int numero, Pessoa p) {
		this.numero = numero;
		this.p = p;
		this.texto = "";
	}
	
	
	
}
