package com.metadave.eql.parser.runtime;

/**
 * Created by dparfitt on 5/22/15.
 */
public class HostPort {
    String host;
    Integer port;

    public HostPort(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String toString() {
        return host + ":" + port;
    }
}
