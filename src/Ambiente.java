public class Ambiente {

	Object[][] mapa;
	int dimensao;
	public Ambiente(int dimensao) {
		this.dimensao = dimensao;
		mapa = new Object[dimensao][dimensao];
		
	}
	
	public void inicializaAmbiente(){
		for(int i = 0; i < getDimensao(); i++){
			for (int j = 0; j < getDimensao(); j++) {
				if(!(mapa[i][j] == "R")){
					mapa[i][j] = 0;
				}
			}
			
		}
	}
	public void insereNoAmbiente(int px, int py, Object object){
		
	try {
		mapa[px][py] = object;
		
	} catch (Exception e) {
		System.out.println("Posição fornecida é maior que o comprimento da Matriz mapa: "+e.getMessage());
	}	
	}
	
	public void insereSujeiraNoAmbiente(){
		int d = (int) (getDimensao() - getDimensao()*0.3);
		System.out.println(d);
		
		int randx = (int) (Math.random()*getDimensao());
		int randy = (int) (Math.random()*getDimensao());
		mapa[randx][randy] = 1;
	}
	
	public int getDimensao() {
		return dimensao;
	}
	
	public Object[][] getMapa() {
		return mapa;
	}
	
	public static void main(String[] a){
		Ambiente ambiente = new Ambiente(10);
		ambiente.inicializaAmbiente();
		ambiente.insereNoAmbiente(0, 0, "R");
		ambiente.insereSujeiraNoAmbiente();
	
		
		Object[][] o = ambiente.getMapa();
		
		for (int i = 0; i < o.length; i++) {
			for (int j = 0; j < o.length; j++) {
				System.out.print(o[i][j]+"\t");
			}System.out.println();
		}
		
		
	}
	
}
