package monRpg;
abstract class WeaponAbstract {
		protected double damage;
		abstract public String ascii_art();
		public WeaponAbstract(double d) {
		this.damage = d;
		
		}
		public String ascii_art(String art) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "|damage="+damage;
		}
	}


