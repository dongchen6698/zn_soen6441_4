package Model;

public class ElectricTower extends Tower {
	
	public ElectricTower(int x, int y, int size) {
		int[] powers = { 40, 80, 120, 160, 200, 240 };
		int[] fightNums = { 1, 1, 2, 2, 3, 3 };
		int[] ranges = {150, 200, 250, 300, 350, 400};
		this.setPowers(powers);
		this.setFightNums(fightNums);
		this.setRanges(ranges);
		this.setLevel(1);
		this.setType(2);
		this.setX(x);
		this.setY(y);
		this.setSpeed(1000);
		this.setSpecial_effects("Long_range");
		//this.setData(data);
		//this.setFighterList(data.getFighterList());
		this.setPrice(200);
		setPowerAndFinghtNum();
	}
}
