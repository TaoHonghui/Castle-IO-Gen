package org.example;

import java.util.List;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

public class g {
    public static final a a = new a();
    public static final String PERIOD = ".";
    public static final class a {
        public final String a(String str) {
            List split$default = StringsKt.split((CharSequence) str, new String[]{PERIOD}, false, 0);
            CharsKt.checkRadix(10);
            int parseInt = Integer.parseInt((String) split$default.get(1), CharsKt.checkRadix(10));
            return p.a((Integer.parseInt((String) split$default.get(2), CharsKt.checkRadix(10)) & 63) | (((Integer.parseInt((String) split$default.get(0), CharsKt.checkRadix(10)) - 1) & 3) << 11) | 8192 | ((parseInt & 31) << 6), 2);
        }
    }

}
