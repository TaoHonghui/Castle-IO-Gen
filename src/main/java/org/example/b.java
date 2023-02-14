package org.example;

import java.util.Base64;

public class b extends j {

    public b(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(byte[] bArr) {
        String encoded = Base64.getEncoder().encodeToString(bArr);
        String encoded2 = encoded.replace("+", "-").replace("/", "_").replace("=", "");
        return encoded2;
    }

    @Override
    public s b() {
        return null;
    }

    @Override
    public void c() {

    }

}
