open module grpc.shaded.jpms {
    requires java.logging;
    requires com.google.errorprone.annotations;
    requires com.google.common;
    requires com.google.gson;

    exports io.grpc;
    exports io.grpc.stub;
    exports io.grpc.stub.annotations;

    exports javax.annotation;
    exports javax.annotation.concurrent;
    exports javax.annotation.meta;

    uses io.grpc.ManagedChannelProvider;
    uses io.grpc.NameResolverProvider;
    uses io.grpc.LoadBalancerProvider;
}
