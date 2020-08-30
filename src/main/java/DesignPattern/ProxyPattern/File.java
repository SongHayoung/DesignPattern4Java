package DesignPattern.ProxyPattern;

public abstract class File {
    protected String data;
    protected AccessAuthority authority;

    public File() {}

    public File(String data) {
        this.data = data;
    }

    public File(String data, AccessAuthority authority) {
        this.data = data;
        this.authority = authority;
    }

    protected abstract String getData();
}
