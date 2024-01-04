
class Player{
	public String playerName;
	public int level;
	public int HP;
	public int money;
	
	public Player(String playerName, int level, int HP, int money){
		this.playerName=playerName;
		this.level=level;
		this.HP=HP;
		this.money=money;
	}
	
	public void killMonster(Monster monster) {
		monster.amount--;
		this.level++;
		this.HP-=10;
		this.money+=100;
	}
	public void takeInn(Inn inn) {
		inn.take(100);
		this.money=+100;
	}
	
}
class Monster{
	int amount=100;
}
class Inn{
	int count;
	int money;
	
	public void take(int money) {
		this.money+=100;
		count++;
	}
}
public class Herogame {

	public static void main(String[] args) {

	}

}
