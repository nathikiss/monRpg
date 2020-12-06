package monRpg;
abstract class WeaponAbstract {
		protected double damage;
		abstract public String ascii_art();
		public WeaponAbstract(double d) {
		this.damage = d;
		
		}

	}


