Q1: What is a **singleton** pattern and when do you use it?  

A1: A **singleton** pattern means that there is a single instance of a class 
that is tasked with manipulating the whole functionality of an application.
Usually this means that however many instances of a singleton object is created, there is a single place in memory allocated for it,
thus no more than one instance can be created at a time.  
You use this type of design pattern when you want a better **modularization** of the code, due to its simplicity when handling 
different functionalities of an application.  
Another reason why you would use this pattern is for a better **encapsulation**,
as the user only has access to a few methods it can call using the singleton instance, not knowing the rest of the implementation and how it works behind.

Example 1: the **Spring IOC container**, it creates beans using a single pattern by default. There is only one instance
of a singleton bean at a time and its whole lifecycle is handled by the Spring IOC container.

Q2: What is a **dependency injection** and when do you use it?

A2: Some objects require extra steps/components to be created. This is where the dependency injection happens,
as all the required parts of an object are first created before being aggregated to the main object requesting them.  
But this is not the only case when DI happens, as importing libraries could also be considered as part of 
the DI process, because you can inject new functionalities in your own code.

Example: Using Maven, you can manage your own dependencies, such as importing the Lombok library, which you can then use 
to inject Getters and Setter in your classes using annotations.