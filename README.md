groupvarint
===========

A Java implementation of **Group Varint**, a technique for the compression of integer numbers. 

### Usage
```java
int a[] = {1, 2, 3, 4, 5, 6, 7};
byte b[] = new byte[GroupVarint.getCompressedSize(a.length)];
int c[] = new int[a.length];

GroupVarint.compress(a, 0, a.length, b, 0);
GroupVarint.decompress(b, 0, c, 0, a.length);
```
with negative numbers:
```java
int a[] = {0, 1, 2, -1, -2, Integer.MAX_VALUE, Integer.MIN_VALUE};
byte b[] = new byte[GroupVarint.getCompressedSize(a.length)];
int c[] = new int[a.length];
int support[] = Arrays.copyOf(a, a.length);

ZigZagGroupVarint.compress(support, 0, support.length, b, 0);
ZigZagGroupVarint.decompress(b, 0, c, 0, a.length);
```

### Dependencies 
* JUnit 4

### References
* Jeff Dean (Google), "Challenges in Building Large-Scale Information Retrieval Systems", WSDM'09
* [http://www.ir.uwaterloo.ca/book/addenda-06-index-compression.html](http://www.ir.uwaterloo.ca/book/addenda-06-index-compression.html)

