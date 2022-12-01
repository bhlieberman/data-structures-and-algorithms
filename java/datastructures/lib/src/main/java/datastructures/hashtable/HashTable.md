# `HashTable`

This is an implementation of a simple `HashTable` in Java, backed by `ArrayList`.

## API

This class exposes the following four public methods:

* `set`: given a key and a value, a new k-v pair is inserted into the hashtable
* `get`: given a key, the corresponding value is returned, or null
* `contains`: returns true iff the hashtable contains the given key, else false
* `keys`: returns a `java.util.List` of the keys present in the hashtable

## Performance characteristics

The `HashTable` gets and sets k-v pairs in `O(1)` time.

The space complexity is `O(n)`.
