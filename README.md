groupvarint
===========

A Java implementation of **Group Varint**, a technique for the compression of integer numbers. 

### Usage
```java
GroupVarint groupVarint = new GroupVarint();

int a[] = {1, 2, 3, 4, 5, 6, 7};
byte b[] = new byte[groupVarint.getCompressedSize(a.length)];
int c[] = new int[a.length];

groupVarint.compress(a, 0, a.length, b, 0);
groupVarint.decompress(b, 0, c, 0, a.length);
```
with negative numbers:
```java
ZigZagGroupVarint zigZagGroupVarint = new ZigZagGroupVarint();

int a[] = {0, 1, 2, -1, -2, Integer.MAX_VALUE, Integer.MIN_VALUE};
byte b[] = new byte[GroupVarint.getCompressedSize(a.length)];
int c[] = new int[a.length];
int support[] = Arrays.copyOf(a, a.length);

zigZagGroupVarint.compress(support, 0, support.length, b, 0);
zigZagGroupVarint.decompress(b, 0, c, 0, a.length);
```

### Dependencies 
* JUnit 4

### References
* Jeff Dean (Google), "Challenges in Building Large-Scale Information Retrieval Systems", WSDM'09
* [http://www.ir.uwaterloo.ca/book/addenda-06-index-compression.html](http://www.ir.uwaterloo.ca/book/addenda-06-index-compression.html)

