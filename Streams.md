Collection streams
if you want to process object from collection we need to use streams on collection
on collection if we are calling sream method then we will be getting stream object
Stream s = collection.stream();
java.util.stream
-------------------------------------------------------------------
Filter --> this method is used when we need to filter objects from collection (odd even etc)
some boolean condition
filter will always use predicate function in it
return type of predicate is always boolean
filter(predicate)
marks.stream().filter(m -> m >=70) (students in distinction)
-------------------------------------------------------------------
Map --> to do some business or operations should use Map
do some operation and generate a new value
this will return some value after operation (add, multiply etc)
map(function)
marks.stream().map(m -> m + 5).collect(Collector.toList) (some extra marks added for complete attendance)
-------------------------------------------------------------------
collect()
this method is used to collect the reult
-------------------------------------------------------------------

Collectors

-------------------------------------------------------------------
count()
counts the size of list
return type is primitive long (so use long or Long)
-------------------------------------------------------------------
sorted()
sorting elements in stream
-------------------------------------------------------------------
forEach()

-------------------------------------------------------------------
toArray()
convert stream object to Array