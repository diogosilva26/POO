package atividade4;

public class Main {

	

	public static void main(String[] args) {
		VideoGame videoGame = new VideoGame();
		
		//Xadrez xadrez = new Xadrez();
		//PingPong pingPong = new PingPong();
		//TiroAlvoOnline tiroAlvoOnline = new TiroAlvoOnline();
		
		videoGame.ligar();
		
		videoGame.jogar(new PingPong());
		
		videoGame.fechar();
		
		videoGame.desligar();
		

	}

}
