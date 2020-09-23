// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/DefaultOnNullArgument.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import java.util.Objects;


/**
 * A function class implementing ByteFunction4.Serializable<A, B, C, D> that returns 0 if any of
 * the function's inputs are null.
 */
class ByteDefaultOnNullArgument4<A, B, C, D> implements ByteFunction4.Serializable<A, B, C, D> {
  private static final long serialVersionUID = 1;
  private static final int CLASS_HASH = ByteDefaultOnNullArgument4.class.hashCode();
  private final ByteFunction4<A, B, C, D> _wrapped;

  ByteDefaultOnNullArgument4(ByteFunction4<A, B, C, D> wrapped) {
    // stacking this wrapper multiple times should be idempotent:
    if (wrapped instanceof ByteDefaultOnNullArgument4) {
      _wrapped = ((ByteDefaultOnNullArgument4) wrapped)._wrapped;
    } else {
      _wrapped = Objects.requireNonNull(wrapped);
    }
  }

  @Override
  public ByteDefaultOnNullArgument4<A, B, C, D> safelySerializable() {
    return new ByteDefaultOnNullArgument4<>(((ByteFunction4.Serializable<A, B, C, D>) _wrapped).safelySerializable());
  }

  @Override
  public byte apply(A value1, B value2, C value3, D value4) {
    if (value1 == null || value2 == null || value3 == null || value4 == null) {
      return 0;
    }
    return _wrapped.apply(value1, value2, value3, value4);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _wrapped.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ByteDefaultOnNullArgument4) {
      return this._wrapped.equals(((ByteDefaultOnNullArgument4) obj)._wrapped);
    }
    return false;
  }
}