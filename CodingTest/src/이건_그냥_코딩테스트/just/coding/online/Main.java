package 이건_그냥_코딩테스트.just.coding.online;

public class Main {

	public static void main(String[] args) { // 객체지향을 제대로 알기 위한 좋은 시간이었다.
		
		Hero[] heros = new Hero[3]; // 갯수를 정해야되고
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		
		for(int i = 0; i<heros.length; i++) {
			heros[i].attack();// 기본적으로 사용할 수 있음.
			if(heros[i] instanceof Warrior) { // hero 객체 중에서 몇 번째꺼가 Warrior이야?
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();// 해당 메소드
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else if(heros[i] instanceof Wizard) {
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
		}

	}

}
