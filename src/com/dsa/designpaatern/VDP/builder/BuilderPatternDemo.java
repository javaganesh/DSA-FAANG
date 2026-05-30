package com.dsa.designpaatern.VDP.builder;

class User {

    private String name;
    private String email;
    private String phone;
    private String city;
    private int age;

    // Private Constructor
    private User(UserBuilder builder) {

        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
        this.age = builder.age;
    }

    // Display Method
    public void showUser() {

        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("City  : " + city);
        System.out.println("Age   : " + age);
    }

    // Static Builder Class
    public static class UserBuilder {

        private String name;
        private String email;
        private String phone;
        private String city;
        private int age;

        // Setter Methods with Method Chaining

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        // Build Method
        public User build() {
            return new User(this);
        }
    }
}

public class BuilderPatternDemo {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setName("Rahul")
                .setEmail("rahul@gmail.com")
                .setPhone("9999999999")
                .setCity("Bangalore")
                .setAge(22)
                .build();

        user.showUser();
    }
}