import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Vida inicial: ");
		int life = sc.nextInt();
		System.out.println("Ataque: ");
		int atk = sc.nextInt();
		System.out.println("Armadura: ");
		int def = sc.nextInt();
		sc.nextLine();
		Champion redChampion = new Champion(name, life, atk, def);

		System.out.println("Digite os dados do segundo campeão:");
		System.out.println("Nome: ");
		name = sc.nextLine();
		System.out.println("Vida inicial: ");
		life = sc.nextInt();
		System.out.println("Ataque: ");
		atk = sc.nextInt();
		System.out.println("Armadura: ");
		def = sc.nextInt();
	
		
		Champion blueChampion = new Champion(name, life, atk, def);
		System.out.println(" Quantos turnos você deseja executar? ");
		sc.nextLine();
		int combatTurn = sc.nextInt();

	

		for (int i = 1; i < combatTurn + 1; i++) {
			System.out.println("Resultado do turno " + i + " :");
			
			Champion.takeDmg(redChampion, blueChampion);
			
			//Champion.takeDmg(blueChampion, redChampion);
			System.out.println(Champion.status(redChampion));
			System.out.println(Champion.status(blueChampion));
			System.out.println();
			
			if(redChampion.getLife() <1 || blueChampion.getLife() < 1) {
				i = combatTurn;
			}
			
		}
		
		System.out.println("FIM DO COMBATE");
		 	sc.close();

	}
}
