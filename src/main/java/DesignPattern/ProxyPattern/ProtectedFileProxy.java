package DesignPattern.ProxyPattern;

public class ProtectedFileProxy extends File{
    private File file;

    public ProtectedFileProxy(File file) {
        this.file = file;
    }

    public String getData(AccessAuthority authority) throws Exception {
        switch (authority) {
            case ADMIN:
                return getData();
            case GUEST:
                if(file.authority.equals(authority))
                    return getData();
                else
                    throw new IllegalAccessException("Access Denied");
        }
        throw new Exception("Not Reachable");
    }

    @Override
    protected String getData() {
        return file.getData();
    }
}
