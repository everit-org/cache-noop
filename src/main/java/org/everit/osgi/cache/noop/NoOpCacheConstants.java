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
package org.everit.osgi.cache.noop;

import java.util.concurrent.ConcurrentMap;

public final class NoOpCacheConstants {

    public static final String DEFAULT_SERVICE_DESCRIPTION = "No-operation cache";

    public static final String CACHE_DRIVER_NAME = "noop";

    public static final String OBJECT_CLASS_NAME_CONCURRENT_MAP = ConcurrentMap.class.getName();

    private NoOpCacheConstants() {
    }

}
