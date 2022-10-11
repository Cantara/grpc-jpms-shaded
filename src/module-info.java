module grpc.shaded.jpms {
    requires java.logging;

    requires transitive com.google.common;
    requires transitive jsr305;

    exports io.grpc;
    exports io.grpc.stub;
    exports io.grpc.stub.annotations;

}
