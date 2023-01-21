package javatutorial.testabstract;

public class AbstractImplementation extends AbstractTests{
    
    
   
    @Override
    int subtract(int num1) {
        return num1-super.number2;
    }
    
    
    public void test(){
         AbstractImplementation abstractImplementation = new AbstractImplementation();
        abstractImplementation.number2=100;
        AbstractTests.number1=200;
        
        System.out.println("Add result: "+abstractImplementation.add());
        
        System.out.println("Subtract Res:"+abstractImplementation.subtract(1000));
    }
    
    
}
