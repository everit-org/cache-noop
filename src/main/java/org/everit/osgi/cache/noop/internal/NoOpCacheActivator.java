/**
 * This file is part of Everit - Cache NoOp.
 *
 * Everit - Cache NoOp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Cache NoOp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Cache NoOp.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.cache.noop.internal;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class NoOpCacheActivator implements BundleActivator {

    private ServiceRegistration<?> cacheSR;

    @Override
    public void start(final BundleContext context) throws Exception {
        Dictionary<String, String> properties = new Hashtable<String, String>(1);
        properties.put("cacheName", "noop");
        cacheSR = context.registerService(
                new String[] { ConcurrentMap.class.getName(), Map.class.getName() },
                new NoOpConcurrentMap(),
                properties);
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        cacheSR.unregister();
    }

}
