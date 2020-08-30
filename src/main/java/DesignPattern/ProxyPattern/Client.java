package DesignPattern.ProxyPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        virtualProxy();
        protectedProxy();
    }

    public static void virtualProxy() {
        VirtualProxy virtualProxy = new VirtualProxy("foo file path");
        System.out.println(virtualProxy.getData());
        System.out.println(virtualProxy.getData());
        System.out.println(virtualProxy.getData());
        System.out.println(virtualProxy.getData());
        System.out.println(virtualProxy.getData());
        System.out.println(virtualProxy.getData());
    }

    public static void protectedProxy() throws Exception {
        File guestFile = new FileExt("This is Guest File.", AccessAuthority.GUEST);
        File adminFile = new FileExt("This is Admin File.", AccessAuthority.ADMIN);

        ProtectedFileProxy guestProxy = new ProtectedFileProxy(guestFile);
        ProtectedFileProxy adminProxy = new ProtectedFileProxy(adminFile);

        System.out.println(guestProxy.getData(AccessAuthority.ADMIN));
        System.out.println(guestProxy.getData(AccessAuthority.GUEST));
        System.out.println(adminProxy.getData(AccessAuthority.ADMIN));
        System.out.println(adminProxy.getData(AccessAuthority.GUEST));
    }
}
