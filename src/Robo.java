public class Robo {
	
	int x,y;
	int dimensao;
	Ambiente ambiente;
	
	public Robo(int px, int py, int dimensao) {
	
		this.x = px;
		this.y = py;
		ambiente = new Ambiente(dimensao);
		ambiente.inicializaAmbiente();
		ambiente.insereNoAmbiente(px, py, "Bobo");
		ambiente.insereSujeiraNoAmbiente();
	
	}
	
	
	public int getX() {
		return x;
	
	}
	public int getY() {
	
		return y;
	}
	
	public static void main(String[] a){
		
		Robo bobo = new Robo(2, 2, 4);
		
		Object[][] n = bobo.ambiente.getMapa();
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j]+"\t");
			}System.out.println(
			
			);
		}
		
	}

}
