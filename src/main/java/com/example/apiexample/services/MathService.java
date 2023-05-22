package com.example.apiexample.services;

import com.example.apiexample.cache.CacheableConfig;
import com.example.apiexample.cache.CacheableConfig.CacheTarget;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class MathService {

  @CacheableConfig(cacheTarget = CacheTarget.MEMORY)
  @Cacheable(cacheNames = {"mathCache"}, cacheResolver = "cacheResolver")
  public Integer sum(int a, int b) {
    return a + b;
  }

  @CacheableConfig(cacheTarget = CacheTarget.SHARED)
  @Cacheable(cacheNames = {"mathCache"}, cacheResolver = "cacheResolver")
  public Integer multiply(int a, int b) {
    return a * b;
  }

  @CacheableConfig(cacheTarget = CacheTarget.MEMORY_AND_SHARED)
  @Cacheable(cacheNames = {"mathCache"}, cacheResolver = "cacheResolver")
  public Integer substract(int a, int b) {
    return a - b;
  }
}
