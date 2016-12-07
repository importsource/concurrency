package com.importsource.concurrency;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author hezhuofan
 */
public class ABA {
    public static void main(String[] args) {
        // AtomicStampedReference<User>  userAtomicStampedReference=new AtomicStampedReference<User>(
        // )

    }

    class User {
        private String name;

        public String getGender() {
            return gender;
        }

        public User setGender(String gender) {
            this.gender = gender;
            return this;
        }

        private String gender;

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }
    }
}