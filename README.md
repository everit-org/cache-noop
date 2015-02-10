#cache-noop

NoOperation cache-api[1] implementation. The bundle registers a java.util.Map 
and a java.util.concurrent.ConcurrentMap interfaces as OSGi service 
automatically.

The services can be filtered with the following expression:
`(cache.driver.name=noop)`

The values are available in constants:
 - `org.everit.osgi.cache.CacheConstants` (from the cache-api)
 - `org.everit.osgi.cache.noop.NoOpCacheConstants`

[![Analytics](https://ga-beacon.appspot.com/UA-15041869-4/everit-org/cache-noop)](https://github.com/igrigorik/ga-beacon)

[1]https://github.com/everit-org/cache-api
