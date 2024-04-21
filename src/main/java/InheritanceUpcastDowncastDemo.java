public class InheritanceUpcastDowncastDemo {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.openURL();//can access only methods present in Browser class
        System.out.println("----------------------------------------------");
        Chromium c1 = new Chromium();
        c1.inspect();//can access its own methods
        c1.openURL();//can access its ancestors' methods as well
        System.out.println("----------------------------------------------");
        NonChromium nc1 = new NonChromium();
        nc1.ncInspect();//can access its own methods
        nc1.openURL();//can access its ancestors' methods as well
        System.out.println("----------------------------------------------");
        //When a base class's object is created, all its ancestors' constructors are called.
        //So, here, when we make an object on Chrome class, first constructor of Browser class is called, thereafter that of Chromium class, and lastly that of Chrome class.
        Chrome ch1 = new Chrome();
        ch1.devTools();//can access its own methods
        ch1.openURL();//can access its ancestors' methods as well
        ch1.inspect();//can access its ancestors' methods as well
        System.out.println("----------------------------------------------");
        Edge e1 = new Edge();
        e1.edgeTools();//can access its own methods
        e1.openURL();//can access its ancestors' methods as well
        e1.inspect();//can access its ancestors' methods as well
        System.out.println("----------------------------------------------");

        //Up casting: converting a child to its ancestor
        //However, such an ancestor will only be able to access methods which an object of such an ancestor would normally be able to!
        //Think of it like you are a parent who has access to your child's money he received it from a relative, but since you are behaving like a parent, you won't spend that money.
        Chromium ch2 = new Chrome();//can access inspect() & openURL() (because of its inheritance from Browser class) methods, but can't access devTools() method
        ch2.inspect();
        ch2.openURL();
        Browser b2 = new Chrome();//can access openURL() method but can't access inspect() and devTools() methods
        b2.openURL();
        System.out.println("----------------------------------------------");

        //Down casting: converting an ancestor to its successor
        //It's not allowed directly. It's like asking a child to behave like a parent. Of course, a child can't have maturity like a parent.
        //Chrome c3 = new Browser();//Illegal, not allowed: compilation error
        //The following is also not allowed. Even though it doesn't give compilation error, but throws a run-time exception
        //Exception in thread "main" java.lang.ClassCastException: class Browser cannot be cast to class Chrome (Browser and Chrome are in unnamed module of loader 'app')
        //	at InheritanceUpcastDowncastDemo.main(InheritanceUpcastDowncastDemo.java:36)
        //Chrome c3 = (Chrome) new Browser();
        //c3.devTools();
        //c3.inspect();
        // c3.openURL();

        //However, you can still down-cast an already up-casted version of your child.
        //For example, you make your Chrome to behave like a Chromium first, and then ask that Chromium to again behave like a Chrome.
        Chromium ch3 = new Chrome();
        ((Chrome)ch3).devTools();
        ((Chrome)ch3).inspect();
        ((Chrome)ch3).openURL();
        Browser b3 = new Chrome();
        ((Chrome)b3).devTools();
        ((Chrome)b3).inspect();
        ((Chrome)b3).openURL();
        //The above is similar to doing something like this mathematically:
        //Browser b3 = new Chrome(); and ((Chrome)b3).devTools();
        // => ((Chrome)new Chrome()).devTools();
        // => new Chrome().devTools();
        // In nutshell, b3 was anyway an instance of Chrome but we earlier asked it to behave like a Browser. And now, we are again asking b3 to behave like Chrome (asking one to behave like oneself). Very much allowed!

    }
}
