package com.example.apiexample.cache;

import lombok.extern.slf4j.Slf4j;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

@Slf4j
public class CustomCacheEventLogger implements CacheEventListener<Object, Object> {

  @Override
  public void onEvent(CacheEvent<?, ?> cacheEvent) {
    log.info("Caching event = {}, key = {}", cacheEvent.getType(), cacheEvent.getKey());
  }
}
