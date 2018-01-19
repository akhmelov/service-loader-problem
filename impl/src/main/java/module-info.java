module com.foo.impl {
    requires com.foo.api;
    provides com.foo.api.ApiInterface with com.foo.impl.ApiInterfaceImpl;
}