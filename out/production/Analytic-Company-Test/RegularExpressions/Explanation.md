At first, I thought about using a simple **contains(String)** approach, 
which checked for existance of the words "damage", "minor damages" and "heavy damage", 
while excluding "no damages".

But then I figured that I would need to use **Regular Expressions**, 
which I didn't need to use until now, so I had to do some research on how to best use them.
Thus, I used an approach called **lookahead** (?= and ?! syntax) to check whether the given input contained or not the given words.
Moreover, to separate just the words, I used the \b word boundary on each side,
to match only the word, not its derivatives as well: i.e. just "damage", not "damaged" or "undamaged".

Using RegEx approach, it makes the code cleaner, more readable and more scalable in the future.
 
