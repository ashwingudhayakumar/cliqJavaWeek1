// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Mouse{
     static void leftClick(){
        System.out.println("left click");
    }
    void rightClick(){
         System.out.println("right click");
    }
}
class Mouse1 extends Mouse{
    boolean ambidextrous=true;
}
class MyClass {
    public static void main(String[] args) {
        Mouse1 m1Obj=new Mouse1();
        System.out.println(m1Obj.ambidextrous);
        m1Obj.rightClick(); 
        Mouse.leftClick();
    }
}
