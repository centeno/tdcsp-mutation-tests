package com.latam.mutation.example.two;

public class NameParser {

    public Person findPersonWithLastName(String[] names, String lastNameToFind){
        Person result = null;
        for (int i = 0; i <= names.length ; i++) { //Bug <=
            String[] parts = names[i].split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            if(lastName.equals(lastNameToFind)){
                result = new Person(firstName,lastName);
                break;
            }
        }
        return result;
    }

}
