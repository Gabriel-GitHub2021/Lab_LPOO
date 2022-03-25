package Principal;

public class Mainha {
	
	
	public static void main(String[]args) {
		Robo wall_e = new Robo();
		
		wall_e.incluiDadosNoRobo(
				(short)59, "4.2",(byte) 5,(byte) 8,(short) 2536);
		
		System.out.println(wall_e.mostraDados());
		}
}
