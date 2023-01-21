package javatutorial.generics;

class Triple<T,E,F> {
    private T first;
    private E second;
    private F third;

    public Triple(T first, E second, F third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    public F getThird() {
        return third;
    }
}

