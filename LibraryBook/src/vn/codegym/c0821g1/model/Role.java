package vn.codegym.c0821g1.model;

public enum Role {
    ADMIN("ADMIN"),USER("USER");

    private String value;


    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
