/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class BinaryMapStaticSymbolsProvider extends IMapTiledSymbolsProvider {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected BinaryMapStaticSymbolsProvider(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinaryMapStaticSymbolsProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_BinaryMapStaticSymbolsProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BinaryMapStaticSymbolsProvider(BinaryMapPrimitivesProvider primitivesProvider, long referenceTileSizeInPixels) {
    this(OsmAndCoreJNI.new_BinaryMapStaticSymbolsProvider(BinaryMapPrimitivesProvider.getCPtr(primitivesProvider), primitivesProvider, referenceTileSizeInPixels), true);
  }

  public BinaryMapPrimitivesProvider getPrimitivesProvider() {
    long cPtr = OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_primitivesProvider_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BinaryMapPrimitivesProvider(cPtr, true);
  }

  public void setReferenceTileSizeInPixels(long value) {
    OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_referenceTileSizeInPixels_set(swigCPtr, this, value);
  }

  public long getReferenceTileSizeInPixels() {
    return OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_referenceTileSizeInPixels_get(swigCPtr, this);
  }

  public ZoomLevel getMinZoom() {
    return ZoomLevel.swigToEnum(OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_getMinZoom(swigCPtr, this));
  }

  public ZoomLevel getMaxZoom() {
    return ZoomLevel.swigToEnum(OsmAndCoreJNI.BinaryMapStaticSymbolsProvider_getMaxZoom(swigCPtr, this));
  }

}