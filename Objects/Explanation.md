Here I leveraged the **try-with-resources** approach, using a **Scanner** and a **BufferedReader** for
optimizing the reading of the csv file.

I split the lines at the comma, and created an **ArrayList** of String arrays to store them efficiently.

Using the `comparing()` method, I created a custom **Comparator** to sort the ArrayList by student names, then 
used an enhanced for to print the IDs and Names in order.