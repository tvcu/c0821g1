package vn.codegym.c0821g1.model;

public enum Role {
    ADMIN("ADMIN"), USER("USER");

    private String value;


    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static Role fromValue(String value) {
        Role[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Role c = var1[var3];
            if (c.value.equals(value)) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid role value: " + value);
    }
}
