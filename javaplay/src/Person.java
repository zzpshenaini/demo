public class Person {
    private String id;
    private String name;
    private String sex;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void eat(String food){
        System.out.println("我正在吃"+food);
        System.out.println("慢点吃别噎死");
    }

    public void sayHello(){
        System.out.println("Hello World!!!"+this.name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name="小明";
        person.eat("noodle");
        person.sayHello();
        System.out.println("这是2.0了");
        System.out.println("我是3.0");
    }
}
