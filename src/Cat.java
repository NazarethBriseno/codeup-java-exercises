public class Cat {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String name;

    private int age;

    private String color;

    public void meow(){
        System.out.println(name + " says meow");
    }
    public void catStats(){
        System.out.println(name + " is " + age + " years old. " + "The color of " + name + " is " + color);
    }
}
