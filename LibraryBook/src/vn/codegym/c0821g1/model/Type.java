package vn.codegym.c0821g1.model;

public enum Type {
    MAGAZINE(1),BOOK(2);

    private int value;


    private Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static Type fromValue(int value) {
        Type[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Type c = var1[var3];
            if (c.value == value) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid book type value: " + value);
    }
}
