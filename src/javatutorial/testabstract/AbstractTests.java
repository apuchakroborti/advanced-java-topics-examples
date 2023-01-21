package javatutorial.testabstract;

public abstract class AbstractTests {
    static Integer number1;    
    Integer number2;
    
    int add(){
       return number1+number2; 
    }
    
    abstract int subtract(int num1); 
    
}
