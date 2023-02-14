package org.example;

import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class t {
    public static final a a = new a();

    /* loaded from: classes3.dex */
    public static final class a {
        public final String a(String str, int i, char c, String str2) {
            int i2 = 0;
            String str3 = new String(CollectionsKt.toCharArray(ArraysKt.slice(str.toCharArray(), RangesKt.until(0, i))));
            int parseInt = Integer.parseInt(String.valueOf(c), CharsKt.checkRadix(16));
            Character[] typedArray = ArraysKt.toTypedArray(str3.toCharArray());
            int length = typedArray.length;
            int i3 = parseInt % length;
            Character[] chArr = new Character[0];
            int length2 = typedArray.length;
            if (i3 > length2) {
                i3 = length2;
            }
            List slice = ArraysKt.slice((Object[]) typedArray, RangesKt.until(0, i3));
            List slice2 = ArraysKt.slice((Object[]) typedArray, RangesKt.until(i3, length));
            List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) slice, (Object[]) chArr), (Iterable) ArraysKt.slice((Object[]) typedArray, RangesKt.until(i3 + length, length2)));
            Object[] array = slice2.toArray(new Character[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Object[] array2 = plus.toArray(new Character[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Object[][] objArr = {array, array2};
            String str4 = new String(ArraysKt.toCharArray((Character[]) ArraysKt.plus(objArr[0], objArr[1])));
            ArrayList arrayList = new ArrayList();
            char[] charArray = str2.toCharArray();
            int length3 = charArray.length;
            int i4 = 0;
            while (i2 < length3) {
                char c2 = charArray[i2];
                i2++;
                arrayList.add(Integer.toString(Integer.parseInt(String.valueOf(c2), CharsKt.checkRadix(16)) ^ Integer.parseInt(String.valueOf(str4.charAt(i4)), CharsKt.checkRadix(16)), CharsKt.checkRadix(16)));
                i4 = (i4 + 1) % str4.length();
            }
            return String.join("", arrayList);
        }
    }

}
