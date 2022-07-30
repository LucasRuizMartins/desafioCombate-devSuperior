public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {

    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }


    
    public static void takeDmg(Champion redChampion, Champion blueChampion) {
    	int redDmg = redChampion.getAttack() - blueChampion.getArmor();
    	int blueDmg = blueChampion.getAttack() - redChampion.getArmor();
    	
    	redChampion.setLife (redChampion.getLife()  - blueDmg) ;
    	blueChampion.setLife(blueChampion.getLife()  - redDmg);
    	
   
    	    	
    }
    
    public static String status(Champion champion ) {
    	String endGame = champion.getName() +  ": 0 de vida (morreu) ";
    	String combatPhrase =  champion.getName() + ": " + champion.getLife() + " de vida" ;
    	    	
    	if (champion.getLife() < 1) {
    		return endGame; 
    	}
    	else 
		return combatPhrase ;}
    

	 
}
