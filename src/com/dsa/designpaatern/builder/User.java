package com.dsa.designpaatern.builder;

public class User {
    private String firstName;
    private String lastName;
    private String desg;
    private int age;
    private Long mob;
    public User(UserBuildrer buildrer){
        this.firstName= buildrer.firstName;
        this.lastName=buildrer.lastName;
        this.desg=buildrer.desg;
        this.mob=buildrer.mob;
        this.age=buildrer.age;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDesg() {
        return desg;
    }

    public int getAge() {
        return age;
    }

    public Long getMob() {
        return mob;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", desg='" + desg + '\'' +
                ", age=" + age +
                ", mob=" + mob +
                '}';
    }

    static class UserBuildrer{
        private String firstName;
        private String lastName;
        private String desg;
        private int age;
        private Long mob;

        UserBuildrer(String firstName, String  lastName ,String  desg){
            this.firstName=firstName;
            this.lastName=lastName;
            this.desg=desg;

        }
        public UserBuildrer setAge(int age){
            this.age=age;
            return this;
        }

        public UserBuildrer setMob(Long mob){
            this.mob=mob;
            return this;
        }

        User buid(){
            User user=new User(this);
            return user;
        }
    }

}
