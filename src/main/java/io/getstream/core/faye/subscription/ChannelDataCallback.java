package io.getstream.core.faye.subscription;

import java.io.IOException;
import java.util.Map;

public interface ChannelDataCallback {
  void onData(Map<String, Object> data) throws IOException;
}
