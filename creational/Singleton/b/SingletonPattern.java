package creational.Singleton.b;

public class SingletonPattern {
    public static void main(String[] args) {
        HttpConnect httpConnect = HttpConnect.getInstance();
        String credentials = httpConnect.getCredentials();
        System.out.println(credentials);
        HttpConnect httpConnect1 = HttpConnect.getInstance();
        String credentials1 = httpConnect1.getCredentials();
        System.out.println(credentials1);
        System.out.println(httpConnect + " " + httpConnect1);
    }
}

class HttpConnect {
    private static HttpConnect instance;


    private HttpConnect() {
        System.out.println("Private constructor called!");
    }

    //synchronized
    public synchronized static HttpConnect getInstance() {
        if (instance == null) {
            instance = new HttpConnect();
        }
        return instance;
    }

    String getCredentials() {
        return "User: Alex" + "\n" + "Password: 1234";
    }
}