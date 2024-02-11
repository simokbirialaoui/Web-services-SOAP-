package ws;

import jakarta.xml.ws.Endpoint;

public class ServiceJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8685/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("web service déployé sur "+url);
    }
}
