package javatutorial.output_test;

class X {
    static int i = 1111;


    static{
        i = i-- - --i;    //L1
        System.out.println("Static initialize in the X: "+i);
    }


    {
        i = i++ + ++i;    //L2
        System.out.println("Static non-initialize in the X: "+i);
    }
}

