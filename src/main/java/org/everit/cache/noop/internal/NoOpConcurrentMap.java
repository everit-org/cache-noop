/*
 * Copyright (C) 2011 Everit (http://everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.cache.noop.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * Simple implementation of {@link ConcurrentMap}.
 *
 * @param <K>
 *          the type of keys maintained by this map
 * @param <V>
 *          the type of mapped values
 */
public class NoOpConcurrentMap<K, V> implements ConcurrentMap<K, V> {

  @Override
  public void clear() {
  }

  @Override
  public boolean containsKey(final Object key) {
    return false;
  }

  @Override
  public boolean containsValue(final Object value) {
    return false;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    return Collections.emptySet();
  }

  @Override
  public V get(final Object key) {
    return null;
  }

  @Override
  public boolean isEmpty() {
    return true;
  }

  @Override
  public Set<K> keySet() {
    return Collections.emptySet();
  }

  @Override
  public V put(final K key, final V value) {
    return null;
  }

  @Override
  public void putAll(final Map<? extends K, ? extends V> m) {
  }

  @Override
  public V putIfAbsent(final K key, final V value) {
    return null;
  }

  @Override
  public V remove(final Object key) {
    return null;
  }

  @Override
  public boolean remove(final Object key, final Object value) {
    return false;
  }

  @Override
  public V replace(final K key, final V value) {
    return null;
  }

  @Override
  public boolean replace(final K key, final V oldValue, final V newValue) {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public Collection<V> values() {
    return Collections.emptyList();
  }

}
