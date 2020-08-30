package DesignPattern.ProxyPattern;

import java.util.Objects;

public class VirtualProxy extends File{
    private String path;
    private File file;

    public VirtualProxy(String path) {
        this.path = path;
    }

    @Override
    protected String getData() {
        if(Objects.isNull(file)) {
            file = new FileExt("This is " + path + " file.");
            System.out.println("File has been loaded");
        }

        return file.getData();
    }
}
