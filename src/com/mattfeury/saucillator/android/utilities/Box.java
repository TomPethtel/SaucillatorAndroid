package com.mattfeury.saucillator.android.utilities;

public interface Box<K> {
  public K getOrElse(K other);
  
  public boolean isDefined();
  public boolean isEmpty();
  public boolean isFailure();
  public String getFailure();
}
