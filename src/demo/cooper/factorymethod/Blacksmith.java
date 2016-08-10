package demo.cooper.factorymethod;

/**
 * 
 * The interface containing method for producing objects.
 * 
 */
public interface Blacksmith {

  Weapon manufactureWeapon(WeaponType weaponType);

}
