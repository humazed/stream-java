package io.getstream.core.faye.emitter;

import java.io.IOException;

public interface EventListener<T> {
  void onData(T data) throws IOException;
}
