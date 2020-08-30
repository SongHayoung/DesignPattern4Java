package DesignPattern.ProxyPattern;

public class FileExt extends File{
    public FileExt(String data) {
        super(data);
    }

    public FileExt(String data, AccessAuthority authority) {
        super(data, authority);
    }

    @Override
    public String getData() {
        return data;
    }
}
