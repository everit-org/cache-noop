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

import java.util.Dictionary;
import java.util.Hashtable;

import org.everit.cache.CacheConstants;
import org.everit.cache.noop.NoOpCacheConstants;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;

/**
 * Activator to activate No Op Cache.
 *
 * @param <K>
 *          the type of keys maintained by this map
 * @param <V>
 *          the type of mapped values
 */
public class NoOpCacheActivator<K, V> implements BundleActivator {

  private ServiceRegistration<?> cacheSR;

  @Override
  public void start(final BundleContext context) throws Exception {
    Dictionary<String, String> properties = new Hashtable<String, String>(1);
    properties.put(Constants.SERVICE_DESCRIPTION, NoOpCacheConstants.DEFAULT_SERVICE_DESCRIPTION);
    properties.put(CacheConstants.ATTR_CACHE_DRIVER_NAME, NoOpCacheConstants.CACHE_DRIVER_NAME);
    cacheSR = context.registerService(
        new String[] {
            NoOpCacheConstants.OBJECT_CLASS_NAME_CONCURRENT_MAP.getName(),
            CacheConstants.OBJECT_CLASS_NAME_MAP.getName() },
        new NoOpConcurrentMap<K, V>(),
        properties);
  }

  @Override
  public void stop(final BundleContext context) throws Exception {
    if (cacheSR != null) {
      cacheSR.unregister();
    }
  }

}
