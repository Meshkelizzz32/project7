package project7;
import java.lang.reflect.*;

public class SelectingMethods {
public static void main(String[] args ) {
	Methods proxy=(Methods)Proxy.newProxyInstance(Methods.class.getClassLoader(),
			new Class[] {Methods.class},
			new Selector(new Implemetions()));
	proxy.boring1();
	proxy.boring2();
	proxy.boring3();
	proxy.interesting("Name");
}
}
