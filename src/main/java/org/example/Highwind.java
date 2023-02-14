package org.example;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Highwind {
    public final j a;

    public Highwind(String str, String str2, String str3, String str4) {
        this.a = new b(str2, str, str3, str4);
    }

    public String token() {
        j jVar = this.a;
        int time = (int) ((new Date().getTime() / 1000) - 1535000000);
        String a = p.a(new Random().nextInt(256));
        String num = Integer.toString(new Random().nextInt(16) & 15, CharsKt.checkRadix(16));
        // Device data from jVar.b().a();
        //ctrl f function roundToInt(Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics
        r a2 = new r("03000c0773616d73756e671405656e2d55531e222781c283202d0035003e144710004c08534d2d473938384e570a01f65c05372e312e326407416e64726f69646c08542d4d6f62696c65740255537c0447696c748c0b47696c742d31322e332e3095549b03c44a47696c742f47696c742d31322e332e30202831323330303433292028436173746c6520322e312e343b20416e64726f696420372e312e323b2073616d73756e6720534d2d473938384e29", 20);
        String str = a2.a;
        String a3 = p.a((a2.b & 31) | ((jVar.a() & 7) << 5));
        String substring = jVar.a.substring(3);
        int length = substring.length();
        String str2 = "";
        int i = 0;
        String str3 = str2;
        int i2 = 0;
        while (i2 < length) {
            char charAt = substring.charAt(i2);
            i2++;
            str3 = Intrinsics.stringPlus(str3, p.a(charAt));
        }
        int max = Math.max(Math.min(time, 268435455), 0);
        String str4 = p.a(max >> 24) + p.a(time >> 16) + p.a(max >> 8) + p.a(time);
        String substring2 = StringsKt.substring(str4, RangesKt.until(1, str4.length()));
        ArrayList arrayList = new ArrayList();
        char[] charArray = substring2.toCharArray();
        int length2 = charArray.length;
        int i3 = 0;
        while (i < length2) {
            char c = charArray[i];
            i++;
            arrayList.add(Integer.toString(Integer.parseInt(String.valueOf(num.charAt(i3)), CharsKt.checkRadix(16)) ^ Integer.parseInt(String.valueOf(c), CharsKt.checkRadix(16)), CharsKt.checkRadix(16)));
            i3 = (i3 + 1) % num.length();
        }
        String joinedArray = String.join("", arrayList);
        String stringPlus = Intrinsics.stringPlus(joinedArray, num);
        t.a aVar = t.a;
        String a4 = aVar.a(stringPlus, 4, stringPlus.toCharArray()[3], a3 + str + jVar.c);
        String str5 = jVar.d;
        String str6 = jVar.b + str3 + jVar.e + jVar.d + aVar.a(str5, 8, str5.toCharArray()[9], Intrinsics.stringPlus(stringPlus, a4));
        String stringPlus2 = Intrinsics.stringPlus(str6, p.a(str6.length()));
        ArrayList arrayList2 = new ArrayList();
        char[] charArray2 = stringPlus2.toCharArray();
        int length3 = charArray2.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length3) {
            char c2 = charArray2[i4];
            i4++;
            arrayList2.add(Integer.toString(Integer.parseInt(String.valueOf(c2), CharsKt.checkRadix(16)) ^ Integer.parseInt(String.valueOf(a.charAt(i5)), CharsKt.checkRadix(16)), CharsKt.checkRadix(16)));
            i5 = (i5 + 1) % a.length();
        }
        for (String str7 : StringsKt.chunked(Intrinsics.stringPlus(a, String.join("", arrayList2)), 2)) {
            str2 = Intrinsics.stringPlus(str2, Character.valueOf(Character.toChars(Integer.parseInt(str7, CharsKt.checkRadix(16)) & 255)[0]));
        }
        return jVar.a(str2.getBytes(Charsets.ISO_8859_1));
    }

}
