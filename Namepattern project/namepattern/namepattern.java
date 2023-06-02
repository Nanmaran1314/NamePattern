package namepattern;

public class namepattern {
    public static void main(String[] args) {
        results obj = new results();
        obj.result();
    }
}


// This project is based on Name pattern 
// Here I have included inheritance,class,object and methods
// Three classes => namepattern, input, result in the package
// namepattern is contains the main class
// input contains the input part
// result contains the result to be shown

// when the object is created for results
// The results class extended the parent class input
// The parent properties are accessed by the child results
// Using Scanner i got input from the user
// The input is converted to char and stored in array
// Using switch case it checks the input and return the desired result
// The result will be one by one and The star pattern will be delay on 100 milli seconds using thread(sleep)