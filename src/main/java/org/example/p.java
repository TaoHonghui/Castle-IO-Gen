package org.example;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

public class p {
    public static final String EVENT_PARAM_VALUE_NO = "0";
    public static String a(int i) {
        String stringPlus = Intrinsics.stringPlus(EVENT_PARAM_VALUE_NO, Integer.toString(i & 255, CharsKt.checkRadix(16)));
        return StringsKt.slice(stringPlus, RangesKt.until(stringPlus.length() - 2, stringPlus.length()));
    }

    public static String a(int i, int i2) {
        int i3 = i2 * 2;
        String str = "";
        for (int min = (int) Math.min(Math.pow(2.0d, i2 * 8) - 1, i); min > 0; min >>>= 8) {
            str = Intrinsics.stringPlus(a(min), str);
        }
        if (i3 > 0) {
            while (str.length() < i3) {
                str = Intrinsics.stringPlus(EVENT_PARAM_VALUE_NO, str);
            }
        }
        return str;
    }

}
