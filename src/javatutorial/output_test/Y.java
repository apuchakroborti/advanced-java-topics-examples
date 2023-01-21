package javatutorial.output_test;

class Y extends X{
    static{
        i = --i - i--;    //L3
        System.out.println("Static initialize in the Y: "+i);
    }
    {
        i = ++i + i++;    //L4
        System.out.println("Static non-initialize in the Y: "+i);
    }
}

