package demo.cooper.prototype;

/**
 * 
 * Prototype
 *
 */
public abstract class Prototype implements Cloneable {

  @Override
  public abstract Object clone() throws CloneNotSupportedException;

}
