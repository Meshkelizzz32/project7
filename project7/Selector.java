package project7;
import java.lang.reflect.*;

public class Selector implements InvocationHandler {
private Object proxied;
public Selector(Object proxied) {
	this.proxied=proxied;
}
public Object invoke(Object proxy,Method method, Object[] args)
throws Throwable{
	if(method.getName().equals("interesting"))
		System.out.println("Proxy detected the interesting method");
	else {
		System.out.println("Not interesting method");
	}
	return method.invoke(proxied,args );
}
}
