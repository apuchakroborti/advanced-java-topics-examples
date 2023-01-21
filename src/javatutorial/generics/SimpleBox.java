package javatutorial.generics;

class SimpleBox<T> {
    private T content;

    public SimpleBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

