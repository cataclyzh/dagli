// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/internal/PreparedTransformerXInternalAPI.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer.internal;

import com.linkedin.dagli.dag.DAG;
import com.linkedin.dagli.placeholder.Placeholder;
import com.linkedin.dagli.producer.Producer;

import com.linkedin.dagli.transformer.PreparedTransformer1;
import com.linkedin.dagli.tuple.Tuple10;
import com.linkedin.dagli.transformer.Value0FromTuple;
import com.linkedin.dagli.transformer.Value1FromTuple;
import com.linkedin.dagli.transformer.Value2FromTuple;
import com.linkedin.dagli.transformer.Value3FromTuple;
import com.linkedin.dagli.transformer.Value4FromTuple;
import com.linkedin.dagli.transformer.Value5FromTuple;
import com.linkedin.dagli.transformer.Value6FromTuple;
import com.linkedin.dagli.transformer.Value7FromTuple;
import com.linkedin.dagli.transformer.Value8FromTuple;
import com.linkedin.dagli.transformer.Value9FromTuple;

import java.util.List;
import com.linkedin.dagli.transformer.PreparedTransformer10;


public interface PreparedTransformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S extends PreparedTransformer10<A, B, C, D, E, F, G, H, I, J, R>>
    extends Transformer10InternalAPI<A, B, C, D, E, F, G, H, I, J, R, S>, PreparedTransformerInternalAPI<R, S> {

  R apply(Object executionCache, A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8,
      I value9, J value10);

  @Override
  @SuppressWarnings("unchecked")
  default R applyUnsafe(Object executionCache, Object[] values) {
    assert values.length >= 10;
    return apply(executionCache, (A) values[0], (B) values[1], (C) values[2], (D) values[3], (E) values[4],
        (F) values[5], (G) values[6], (H) values[7], (I) values[8], (J) values[9]);
  }

  @Override
  @SuppressWarnings("unchecked")
  default R applyUnsafe(Object executionCache, List<?> values) {
    assert values.size() >= 10;
    return apply(executionCache, (A) values.get(0), (B) values.get(1), (C) values.get(2), (D) values.get(3),
        (E) values.get(4), (F) values.get(5), (G) values.get(6), (H) values.get(7), (I) values.get(8),
        (J) values.get(9));
  }

  @Override
  @SuppressWarnings("unchecked")
  default R applyUnsafe(Object executionCache, Object[][] values, int exampleIndex) {
    assert values.length >= 10;
    return apply(executionCache, (A) values[0][exampleIndex], (B) values[1][exampleIndex], (C) values[2][exampleIndex],
        (D) values[3][exampleIndex], (E) values[4][exampleIndex], (F) values[5][exampleIndex],
        (G) values[6][exampleIndex], (H) values[7][exampleIndex], (I) values[8][exampleIndex],
        (J) values[9][exampleIndex]);
  }

  @Override
  default PreparedTransformer1<Tuple10<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I, ? extends J>, R> withArity1(
      Producer<? extends Tuple10<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I, ? extends J>> inputTuple) {
    Placeholder<Tuple10<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I, ? extends J>> placeholderTuple =
        new Placeholder<>("Original Inputs Tuple");

    return DAG.Prepared
        .withPlaceholder(placeholderTuple)
        .withOutput(
            withInputs(new Value0FromTuple<>(placeholderTuple), new Value1FromTuple<>(placeholderTuple),
                new Value2FromTuple<>(placeholderTuple), new Value3FromTuple<>(placeholderTuple),
                new Value4FromTuple<>(placeholderTuple), new Value5FromTuple<>(placeholderTuple),
                new Value6FromTuple<>(placeholderTuple), new Value7FromTuple<>(placeholderTuple),
                new Value8FromTuple<>(placeholderTuple), new Value9FromTuple<>(placeholderTuple)))
        .withInput(inputTuple);
  }
}
