Functional Interface
Interface with only one abstract method
SAM single abstract method

To invoke or call lambda expression

Runnable, comparable, comparator, callable

It can have any number or default method or/and static method but only one abstract method
@FuctionalInterface



Interface
Default method + Static method + Private method

Default Method (Virtual extension method | Defender method)
without affetcting implementation classes if we want to add new method to Interface

default keyword method is used only inside interface and not allowed inside class
default method can be overidden inside implementing methods by changing access modifier to public

multiple inheritance can be achieved if we overide default method

Static Method
by default the static methods are not available to implementing classes or normal non implementing class, ir needs to be called using the interface.methodName
To call static method the only way is to call it using the interface name i.e Interface.staticMethod()
we can write main method in interface psvm and call it to execute from interface itself (same as main method in class)
why static method in Interface --> until 1.7 these static utility method were defined inside a class
if everything is related to static and not related to class which is object than better to implement static in interface just for cost performance.
if everything is static than better to define in interface not class



Anonymous inner class VS lambda expression
can extend normal class
can extend abstract class
can implement an interface with any number of abstract method

Lambda expression
can implement an interface with only single abstract method








For small small operations to be achieved by Lambda expression we need Functional Interface 

java.util.function pkg
Predefined Fuctional Interface
	Predicate
	Function
	Consumer
	Supplier

Two argument predefined function interface
	BiPredicate
	BiFunction
	BiConsumer
	BiSupplier

Primitive Functional Interface
	IntPredicate, StrPredicate, LongPredicate
	IntFunction, StrFunction, LongFunction
	IntConsumer, StrConsumer, LongConsumer
	IntSupplier, StrSupplier, LongSupplier
	
Predicate(I)
public abstract boolean test(T t);

interface Predicate<T>{
	public boolean test(T t);
}

Can join multiple predicate
predicate p1
Predicate p2

p1.and(p2).test()
p1.or(p2).test()




Function is opposite of predicate in return type
It takes some input and perform some operation and return result which is not boolean




Consumer
It is always Void
No return type at all 
accept some input perform some operation and does not return anything



Supplier
No input only supply required objects
contains only once method get()
public R get();



UnaryOperator
If input and output are always same type (INTEGER, DOUBLE, LONG)
use this

---------------------------------------------------------------------------------------------------------------------------------
Predefined Fuctional Interface
Predicate
Function
Consumer
Supplier

-------------
2 argument function
BiPredicate
BiFunction
BiConsumer
BiSupplier

-------------
Primitive type functional interface
IntPredicate
LongPredicate
DoublePredicate

-------------
UnaryOperator
BinaryOperator

