# Loops

Loops are one of the things that makes computers powerful. Loops allow programs to do similar operations repeatedly, very quickly. Where it would take a human an incredibly long time to count to one million, using loops, computers can accomplish this in milliseconds.

So how does this work? In the current version of Java, there are three different ways to loop through operations. We'll cover all three in today's lesson.

## While Loops
The `while` loop is the most basic kind of loop. The concept is simple. If some condition is `True`, then repeat the loop. This makes `while` loops both powerful and flexible. Let's cover an example.

```java
while(true) {
  System.out.println("I will run forever!");
}
```

This is a `while` loop that will run until you terminate the program. If you ran this program, you can stop it by pressing `control + c`. There are ways to make the while loop stop itself.

```java
int i = 0;
while(i < 10) {
  System.out.println(i);
  i++;
}
```
e
