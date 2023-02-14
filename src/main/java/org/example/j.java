package org.example;

import kotlin.text.StringsKt;

public abstract class j {
    public final String a;
    public final String b = p.a(8);
    public final String c = p.a(255);
    public final String d;
    public final String e;

    public j(String str, String str2, String str3, String str4) {
        this.a = str4;
        this.d = StringsKt.replace(str, "-", "", false);
        this.e = g.a.a(str2);
        if (!StringsKt.startsWith(str4, "pk_", false) || str4.length() != 35) {
            throw new IllegalArgumentException("Invalid publishable key");
        }
    }

    public abstract int a();

    public abstract String a(byte[] bArr);

    public abstract s b();

    public abstract void c();

}
