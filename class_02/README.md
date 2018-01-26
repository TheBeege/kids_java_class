# Class 02 - Variables and Methods

In programming, things can mostly be divided into two areas: knowing things and doing things. Knowing things, or storing information, is done using variables. Doing things is done using methods, also called functions.

## Variables
Again, variables are ways to store information, ways for programs to "know things." Another way to think about variables is like boxes. A variable is like a box - it stores something. These boxes also have a label. The label is the variable's name. These boxes also have sizes. The size is the type of data the variable stores - some data is bigger than others. Here's an example:
```java
int myVariable = 10;
```
`int` is the type of the data being stored, in this case, an integer. The box will be big enough to store an integer, and it can't store anything else.

`myVariable` is the name of the variable. This is like the label on the box.

`10` is the data that the variable is storing. This is what's been put inside the box.

You can also split this into two steps:
```java
int myVariable;
myVariable = 10;
```

The first line is called `declaration`. Declaration is telling Java that we need a box of a certain size and with a certain label - a data type and name.

The second line is called `initialization`. Initialization is setting the value of a variable for the first time.

You might be wondering what other types of data there are. There's a lot, but for today, we'll focus on some of the [primitive types](https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types).

### Data Types

#### Integer Types

`int` is short for integer. An integer is a whole number, without a decimal point. It can store any number from -2,147,483,648 to 2,147,483,647.

`short` is a smaller integer. It can only store from -32,768 to 32,767.

`long` is a larger integer. It's... big. It goes from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. To write a long number in code, you need to add an `L` at the end:
```java
long myLong = 23372036854775807L;
```

#### Floating Point Types

Following this, we have floating point numbers - numbers with decimal points. Floating point numbers work using scientific notation. For example, `5,000,000` is actually `5 x 10^6` --- `5 x 10 x 10 x 10 x 10 x 10 x 10 = 5,000,000`. This allows us to store much, much larger numbers.

Be careful with floating point numbers! They have a limited precision. For example, if you have a number like `50973460784697809567803867407`, it might be stored as `5.0973 x 10^28`. Everything after that last `3` is lost.

There are two types of floating points: `float` and `double`. `float` is a typical floating point number as described above. `double` is the same but can store double the data size of values. Note that `double` is the default floating point type. If you want a `float`, you must add a `f` to the end of the number. See below:
```java
float myFloat = 100f;
```

#### Other Types
The last notable type is `boolean`. This stores simply a `true` or `false` value. It's often used for tracking the state of things. For example, if you had a program that downloaded things, it might have a variable like this:
```java
boolean isDownloadComplete = false;
```
Pretty useful, right?

Now, open up `Variables.java` and play with some of the code.

Don't forget: first compile using the file name, then run the class:
```shell
javac Variables.java
java Variables
```

### Methods
