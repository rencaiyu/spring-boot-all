1、 你都知道哪些常用的Map集合?

2、Collection集合接口和Map接口有什么关系？

3、HashMap是线程安全的吗？线程安全的Map都有哪些？性能最好的是哪个？

4、使用HashMap有什么性能问题吗？

5、HashMap的数据结构是怎样的？默认大小是多少？内部是怎么扩容的？

6、怎么按添加顺序存储元素？怎么按A-Z自然顺序存储元素？怎么自定义排序？

7、HashMap的链表结构设计是用来解决什么问题的？

8、HashMap的键、值可以为NULL吗？HashTable呢？

9、HashMap使用对象作为key，如果hashcode相同会怎么处理？

10、HashMap中的get操作是什么原理？



1、HashMap、HashTable、LinkedHashMap、ConcurrentHashMap。 

2、没关系，Collection是List、Set父接口不是Map父接口。

3、HashMap不是线程安全的。线程安全的有HashTable、ConcurrentHashMap、SynchronizedMap，性能最好的是ConcurrentHashMap。

4、使用HashMap要注意避免集合的扩容，它会很耗性能，根据元素的数量给它一个初始大小的值。 

5、HashMap是数组和链表组成的，默认大小为16，当hashmap中的元素个数超过数组大小*loadFactor（默认值为0.75）时就会把数组的大小扩展为原来的两倍大小，然后重新计算每个元素在数组中的位置。

6、按添加顺序使用LinkedHashMap,按自然顺序使用TreeMap,自定义排序TreeMap(Comparetor c)。 

7、HashMap的链表结构设计是用来解决key的hash冲突问题的。 

8、HashMap的键值都可以为NULL，HashTable不行。 

9、key的hash冲突，如果key equals一致将会覆盖值，不一致就会将值存储在key对应的链表中。

10、先根据key的hashcode值找到对应的链表，再循环链表，根据key的hash是否相同且key的==或者equals比较操作找到对应的值。
