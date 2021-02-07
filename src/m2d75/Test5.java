package m2d75;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Army army=new Army(2);
		Gun gun=new Gun();
		Tank tank=new Tank();
		try {
			army.addWeapon(gun);
			army.addWeapon(tank);
		} catch (WeaponIndexOutOfBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		army.moveAll();
		army.attackAll();

	}

}
