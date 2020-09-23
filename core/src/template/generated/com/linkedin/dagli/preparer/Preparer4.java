// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the preparer/PreparerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.preparer;

import com.linkedin.dagli.objectio.ObjectReader;
import com.linkedin.dagli.transformer.PreparedTransformer4;
import com.linkedin.dagli.util.invariant.Arguments;

import com.linkedin.dagli.tuple.Tuple4;


public interface Preparer4<A, B, C, D, R, N extends PreparedTransformer4<A, B, C, D, R>> extends Preparer<R, N> {
  @Override
  default void processUnsafe(Object[] values) {
    Arguments.check(values.length == 4, "4 arguments must be provided");
    process((A) values[0], (B) values[1], (C) values[2], (D) values[3]);
  }

  /**
   * Processes a single example of preparation data.  To prepare a {@link Preparer}, process(...) will be called on
   * each and every preparation example before finish(...) is called to complete preparation.
   *
   * This method is not assumed to be thread-safe and will not be invoked concurrently on the same {@link Preparer}.
   *
   * @param value1 the first value of the preparation example to be processed
   * @param value2 the second value of the preparation example to be processed
   * @param value3 the third value of the preparation example to be processed
   * @param value4 the fourth value of the preparation example to be processed
   */
  void process(A value1, B value2, C value3, D value4);

  @Override
  default PreparerResultMixed<? extends PreparedTransformer4<? super A, ? super B, ? super C, ? super D, ? extends R>, N> finishUnsafe(
      ObjectReader<Object[]> inputs) {
    return finish(inputs == null ? null : inputs.lazyMap(Tuple4::fromArrayUnsafe));
  }

  /**
   * Completes preparation to obtain the final, prepared transformer result.  This method is called after all
   * preparation data has been process(...)'ed.
   *
   * @param inputs an {@link ObjectReader} that can be used by the {@link Preparer} to iterate over the preparation data
   *               as many times as desired.
   * @return a {@link PreparerResultMixed} containing the resultant prepared transformers (often these are the same
   *         instance; a {@link Preparer} can, however, return a different transformer to be used on preparation and
   *         future ("new") data, which is useful in certain sophisticated use cases)
   */
  PreparerResultMixed<? extends PreparedTransformer4<? super A, ? super B, ? super C, ? super D, ? extends R>, N> finish(
      ObjectReader<Tuple4<A, B, C, D>> inputs);

  /**
   * Casts a preparer to a "supertype".  This cast is safe due to the semantics of preparers.
   *
   * @param preparer the preparer to cast
   * @param <A> the new type of input #1
   * @param <B> the new type of input #2
   * @param <C> the new type of input #3
   * @param <D> the new type of input #4
   * @param <R> the new result type
   * @param <N> the new prepared transformer type
   * @return the provided {@code preparer}, cast to the desired "supertype"
   */
  @SuppressWarnings("unchecked")
  static <A, B, C, D, R, N extends PreparedTransformer4<A, B, C, D, R>> Preparer4<A, B, C, D, R, N> cast(
      Preparer4<? super A, ? super B, ? super C, ? super D, ? extends R, ? extends N> preparer) {
    // safe due to semantics of preparers:
    return (Preparer4<A, B, C, D, R, N>) preparer;
  }
}