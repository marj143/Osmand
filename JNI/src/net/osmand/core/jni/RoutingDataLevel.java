/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public enum RoutingDataLevel {
  Basemap,
  Detailed;

  public final int swigValue() {
    return swigValue;
  }

  public static RoutingDataLevel swigToEnum(int swigValue) {
    RoutingDataLevel[] swigValues = RoutingDataLevel.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (RoutingDataLevel swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + RoutingDataLevel.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private RoutingDataLevel() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private RoutingDataLevel(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private RoutingDataLevel(RoutingDataLevel swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
