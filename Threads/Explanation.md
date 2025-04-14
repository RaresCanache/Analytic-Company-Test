As before, I didn't use **Java Multithreading** until now, so I had to do my research.  
Thus, I tried to make these two separate threads print at random, and not at the same type. I avoided this race condition
using a **monitor lock** from the lock Object. This was done using the **synchronzied** keyword.  
Then, simply using a Random generator, each Thread would randomly print the required outputs, one after another and not at the same time.