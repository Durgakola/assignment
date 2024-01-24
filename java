SOLID Principles Java:

In java, SOLID  principles are an object-oriented approach that are applied to software structure design. It is conceptualized by Robert C. Martin (also known as Uncle Bob).
 These five principles have changed the world of object-oriented programming, and also changed the way of writing software.

o	S-Single Responsibility Principle.
o	O-Open-Closed Principle.
o	L-Liskov Substitution Principle.
o	I-Interface Segregation Principle.
o	D-Dependency Inversion Principle.

Single Responsibility Principle:
The Single Responsibility Principle(SRP) states that there should never be more then one reason for a class to change.
This means that every class, or similar structure, in your code should have only one job to do.

Open-Closed Principle:
The Open-Closed Principle (OCP) states that classes should be open for extension but closed for modification.
“Open to extension” means that you should design your classes so that new functionality can be added as new requirements are generated. “Closed for modification” means that once you have developed a class you should never modify it, except to correct bugs.

Liskov Substitution Principle:
The Liskov Substitution Principle (LSP) applies to inheritance hierarchies, specifying that you should design your classes so that client dependencies can be substituted with subclasses without the client knowing about the change.

Interface segregation Principle:
This principle is the first principle that applies to interfaces instead of classes in SOLID and it is similar to the single responsibility principle.
It states that “do not force any client to implement interface which is irrelevant to them”. Hear your main goal is to focus on avoiding fat interface give preference to many small client-specific interface rather than one general interface and each interface should have a specific responsibility.

Dependency Inversion Principle:
The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction. Because the abstraction does not depend on detail but the detail depends on the abstraction.

OOPs (Object-Oriented Programming System)

o	Object
o	Class
o	Inheritance
o	Polymorphism
o	Abstraction
o	Encapsulation

These concepts, there are some other terms which are used in Object-Oriented design:
o	Coupling
o	Cohesion
o	Association
o	Aggregation
o	Composition

Object:
Any entity that has state and behavior is known as an object.
Example:chair, pen, table, keyboard, bike.

Class:
A class can also be defined as a blueprint from which you can create an individual object. Class doesn’t consume any space.

Inheritance:
When one object acquires all the properties and behaviours of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
1.Single-level-inheritance
2.Multi-level-inheritance
3.hierarchies inheritance
4.hybrid inheritance

Polymorphism:
If one task is performed in different ways, it is known as polymorphism.
Ex: to convince the customer differently, to draw something, for ex: shape, triangle, rectangle, etc.
In java, we use method overloading and method overriding to achieve polymorphism.
Ex: can be speck something; for example, a cat speaks meow, dog barks woof.

Abstraction:
Hiding internal details and showing functionality is known as abstraction. For example phone call, we don’t the internal processing.

Encapsulation:
Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.
A java class is the example of encapsulation. Java bean is the fully encapsulation class because all the data members are private.

Coupling:
Coupling refers to the knowledge or information or dependency of another class. It arises when classes are aware of each other.
If a class has the details information of another class, there is strong coupling. In java, we use private, protected, and public modifiers to display the visibility level of a class, method, and field. You can interfaces for the weaker coupling because there is no concreate implementation.

Cohesion:
Cohesion refers to the level of a component which performs a single well-defined task. A single well-defined task is done by a highly cohesive method.
 The weakly cohesive method will split the task into separate parts. The java.io package is highly cohesive package because it has I/O related classes and interface. However, the java.util  package is a weakly cohesive package because it has unrelated classes and interfaces.

Association:
Association represents the relationship between the objects. One object can be associated with one object or many objects. There can be four types of association between the objects:
	One to One
	One to Many
	Many to One
	Many to Many
Lets understand the relationship with real-time examples. For example, One country can have one prime minister (one to one).
Prime minister can have many ministers (one to many).
Also, many MP’s can have one prime minister (many to one).
Many ministers can have many departments (many to many).

Aggregation:
Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains other object as a part of its state.
 It represents the weak relationship between objects.it is also termed as a has-a relationship in java. Like , inheritance represents the is-a relationship. It is another way to reuse objects.

Composition:
The composition is also a way to achieve Association. The composition represents the relationship where one object contains other objects as a part of its state.
There is strong relationship between the containing object and the dependent object. It is the state where containing objects do not have an independent existence. If you delete the parent, all the child objects will be deleted automatically.





















