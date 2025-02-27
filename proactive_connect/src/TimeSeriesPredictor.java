/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class TimeSeriesPredictor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TimeSeriesPredictor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesPredictor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        TSPJNI.delete_TimeSeriesPredictor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static TimeSeriesPredictor getInstance(SWIGTYPE_p_std__vectorT_std__string_t modelArgs, long trainingLength, long horizon) {
    long cPtr = TSPJNI.TimeSeriesPredictor_getInstance__SWIG_0(SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(modelArgs), trainingLength, horizon);
    return (cPtr == 0) ? null : new TimeSeriesPredictor(cPtr, false);
  }

  public static TimeSeriesPredictor getInstance(String model, long trainingLength, long horizon) {
    long cPtr = TSPJNI.TimeSeriesPredictor_getInstance__SWIG_1(model, trainingLength, horizon);
    return (cPtr == 0) ? null : new TimeSeriesPredictor(cPtr, false);
  }

  public long getTrainingLength() {
    return TSPJNI.TimeSeriesPredictor_getTrainingLength(swigCPtr, this);
  }

  public void observe(double v) {
    TSPJNI.TimeSeriesPredictor_observe(swigCPtr, this, v);
  }

  public void predict(long n, SWIGTYPE_p_double predictions, SWIGTYPE_p_double variances) {
    TSPJNI.TimeSeriesPredictor_predict__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_double.getCPtr(predictions), SWIGTYPE_p_double.getCPtr(variances));
  }

  public void predict(long n, SWIGTYPE_p_double predictions) {
    TSPJNI.TimeSeriesPredictor_predict__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_double.getCPtr(predictions));
  }

  public TimeSeriesPredictor clone() {
    long cPtr = TSPJNI.TimeSeriesPredictor_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeSeriesPredictor(cPtr, false);
  }

  public SWIGTYPE_p_ScenarioTree createScenarioTree(long branchingDepth, long depth) {
    long cPtr = TSPJNI.TimeSeriesPredictor_createScenarioTree__SWIG_0(swigCPtr, this, branchingDepth, depth);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ScenarioTree(cPtr, false);
  }

  public SWIGTYPE_p_ScenarioTree createScenarioTree(long branchingDepth) {
    long cPtr = TSPJNI.TimeSeriesPredictor_createScenarioTree__SWIG_1(swigCPtr, this, branchingDepth);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ScenarioTree(cPtr, false);
  }

  public void predict(double lowerBound, double upperBound, long n, SWIGTYPE_p_double predictions, SWIGTYPE_p_double variances) {
    TSPJNI.TimeSeriesPredictor_predict__SWIG_2(swigCPtr, this, lowerBound, upperBound, n, SWIGTYPE_p_double.getCPtr(predictions), SWIGTYPE_p_double.getCPtr(variances));
  }

  public void predict(double lowerBound, double upperBound, long n, SWIGTYPE_p_double predictions) {
    TSPJNI.TimeSeriesPredictor_predict__SWIG_3(swigCPtr, this, lowerBound, upperBound, n, SWIGTYPE_p_double.getCPtr(predictions));
  }

  public SWIGTYPE_p_ScenarioTree createScenarioTree(double lowerBound, double upperBound, long branchingDepth, long depth) {
    long cPtr = TSPJNI.TimeSeriesPredictor_createScenarioTree__SWIG_2(swigCPtr, this, lowerBound, upperBound, branchingDepth, depth);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ScenarioTree(cPtr, false);
  }

  public SWIGTYPE_p_ScenarioTree createScenarioTree(double lowerBound, double upperBound, long branchingDepth) {
    long cPtr = TSPJNI.TimeSeriesPredictor_createScenarioTree__SWIG_3(swigCPtr, this, lowerBound, upperBound, branchingDepth);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ScenarioTree(cPtr, false);
  }

}
