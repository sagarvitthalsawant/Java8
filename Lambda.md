Lambda expression

Its main function(method) is to accomodate benefits of function programming in java
to call or invoke lambda function or lambda method we need functional interface

It ia an anonymous(nameless) function
	without name
	without return type
	without modifier
	
-----------------------------------
Before Java8
public void printHello(){
	sysout("Hello");
}

public void add(int a, int b){
	sysout(a+b);
}

public void square(int a){
	sysout(a+b);
}

public int returnType1(int a, int b) {
	return a*b;
}

public int singleParameter(int a) {
return a*a;
}
------------------------------------
After

() -> sysout("Hello");

(a, b) ->  Sout(a+b); 

(a) -> sysout(a*a);

(a, b) -> { return a*b; } or -> a*b;

a -> a*a;