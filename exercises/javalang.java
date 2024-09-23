/* Create a class JavaLang that overwrites sayHello and prints "Hello Java" to the console when overwritten. */

public class Language {

    public void sayHello() {
        System.out.print("---");
    }
}

public class JavaLang extends Language {

    public void sayHello() {
        System.out.print("Hello Java");
    }
}
