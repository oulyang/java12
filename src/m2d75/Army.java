package m2d75;

public class Army {

	private Weapon[] weapons;
	public Army(int count) {
		weapons= new Weapon[count];
	}
	
	public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundException {
		for(int i=0;i<weapons.length;i++) {
			if(null==weapons[i]) {
				weapons[i]=weapon;
				return;
			}
		}
		throw new  WeaponIndexOutOfBoundException("武器数量达上限");
	}
	public void attackAll() {
		for(int i=0;i<weapons.length;i++) {
			if(weapons[i] instanceof Shootable) {
				Shootable shootable=(Shootable)weapons[i];
				shootable.shoot();
			}
		}
	}
	public void moveAll() {
		for(int i=0;i<weapons.length;i++) {
			if(weapons[i] instanceof Moveable) {
				Moveable moveable=(Moveable)weapons[i];
				moveable.move();
			}
	}
}
}
