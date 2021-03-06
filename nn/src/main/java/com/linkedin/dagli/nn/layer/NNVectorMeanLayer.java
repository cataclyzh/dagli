package com.linkedin.dagli.nn.layer;

import com.linkedin.dagli.annotation.visitor.VisitedBy;


/**
 * Layer that outputs the arithmetic average of the vectors provided by input layers.
 *
 * <strong>Known limitation:</strong> at present, the size of the input vectors must be the same.
 */
@VisitedBy(value = "NNLayerVisitor")
public class NNVectorMeanLayer extends AbstractElementWiseLayer<NNVectorMeanLayer>
    implements NonTerminalLayer {
  private static final long serialVersionUID = 1;

  @Override
  boolean isOutputSizeMinInputSize() {
    return false;
  }

  @Override
  public <R> R accept(NNLayerVisitor<R> visitor) {
    return visitor.visit(this);
  }
}
