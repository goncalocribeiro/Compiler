/*  */
package pex.atomic;

import pex.Value;

/**
 * Class for describing syntactic tree leaves for holding string values.
 */
public class StringLiteral extends Value<String> {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param value
   */
  public StringLiteral(String value) {
    super(value);
  }

  //FIXME (possibly) add other methods: e.g. accept, toString, etc.
}
