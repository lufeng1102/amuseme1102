package com.amuseme.java8.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lufeng on 2017/1/18.
 */
public class PersonTest {

    public static class Person{
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", birthday=" + birthday +
                    ", gender=" + gender +
                    ", emailAddress='" + emailAddress + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public Sex getGender() {
            return gender;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        public void setGender(Sex gender) {
            this.gender = gender;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public enum Sex{
            MALE,FEMALE
        }

        String name;
        LocalDate birthday;
        Sex gender;
        String emailAddress;
        int age;

        public int getAge(){
            return age;
        }

        public void printPerson(){
            System.out.println(toString());
        }
    }

    public static List<Person> genPersons(int number){
        List<Person> persons = new ArrayList<>();
        for(int i = 0; i < number; i++){
            Person person = new Person();
            person.setAge(i+10*i);
            person.setBirthday(LocalDate.now());
            person.setEmailAddress("xxx");
            person.setGender(Person.Sex.FEMALE);
            person.setName("xx"+i);
            persons.add(person);
        }
        return persons;
    }

    public static void printPersonsOlderThan(List<Person> roster, int age){
        for(Person p : roster){
            if(p.getAge() >= age){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args){
        List<Person> persons = genPersons(3);
        printPersonsOlderThan(persons,20);
        persons.stream().filter(p -> p.getAge() >= 20).forEach(p -> p.printPerson());
    }
}
