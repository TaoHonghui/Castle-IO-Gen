package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CastleApplication {
    public static void main(String[] args) {
        SpringApplication.run(CastleApplication.class, args);
    }

    @GetMapping("/castle")
    public String castle() {
        return getCastle();
    }

    public static String getCastle() {
        String version = "2.1.4";
        String uid = "0e013fcd-b4fc-4787-b711-2bfafa8f5927";
        String agent = "Gilt/Gilt-12.3.0 (1230043) (Castle 2.1.4; Android 7.1.2; samsung SM-G988N)";
        String pk = "pk_qvov7CbRqpuxuXPZGixDSKhkwzNWFqqg";
        Highwind h = new Highwind(version, uid, agent, pk);
        String castle = h.token();
        return castle;
    }

}
