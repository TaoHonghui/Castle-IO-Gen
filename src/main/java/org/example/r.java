package org.example;

import kotlin.jvm.internal.Intrinsics;

public class r {
    public final String a;
    public final int b;

    public r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.a, rVar.a) && this.b == rVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Params(data=" + this.a + ", size=" + this.b + ')';
    }

}
