Java SDK代理与cglib代理比较
Java SDK代理面向的是一组接口，它为这些接口动态创建了一个实现类，
接口的具体实现逻辑是通过自定义的InvocationHandler实现的，这个实现是自定义的，也就是说，
其背后都不一定有真正被代理的对象，也可能多个实际对象，根据情况动态选择。

cglib代理面向的是一个具体的类，它动态创建了一个新类，继承了该类，重写了其方法。