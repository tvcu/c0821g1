package vn.codegym.c0821g1.model;

public enum UserStatus {
    LOCKED(1), AVAILABLE(2);

    private int value;


    private UserStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static UserStatus fromValue(int value) {
        UserStatus[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            UserStatus c = var1[var3];
            if (c.value == value) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid user status value: " + value);
    }
}
