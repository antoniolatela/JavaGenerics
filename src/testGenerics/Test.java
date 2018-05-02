package testGenerics;

import java.util.List;

public class Test {

    public class A {}

    public class B extends A {}

    public class C extends B {}

    @MyAnno(str = "Annotation Example", val = 100)
    public void testCoVariance(List<? extends C> myBlist) {


        A a = new A();
        B b = new B();
        C c = new C();
        B cc = myBlist.get(0);
        //myBlist.add(b); // does not compile
        //myBlist.add(c); // does not compile
        A aa = myBlist.get(0);
    }

    public void testContraVariance(List<? super C> myBlist) {
        for (Object a: myBlist){
            myBlist.add((C)a);
        }
        A a = new A();
        B b = new B();
        C c = new C();
        //myBlist.add(a);
        //myBlist.add(b);
        myBlist.add(c);
        //A x = myBlist.get(0); // does not compile
    }
}

