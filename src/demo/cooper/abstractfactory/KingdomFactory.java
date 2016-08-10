package demo.cooper.abstractfactory;

/**
 * 
 * KingdomFactory factory interface.
 * 
 */
public interface KingdomFactory {

  Castle createCastle();

  King createKing();

  Army createArmy();

}
