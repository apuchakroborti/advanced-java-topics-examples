package javatutorial.generics;

class BoundedNumberBox<T extends Number> {
    private T content;

    public BoundedNumberBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

