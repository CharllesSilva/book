package service;

import domain.AdmUser;
import domain.ClientUser;
import domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AdmService {
        public static User ReturnUser(Long id){

        User user01 = new AdmUser(1,"Luca","22/12/2001","adm123");
        User user02 = new ClientUser(2,"Charlles","11/05/2001","client123");

            List<User> users = new ArrayList<>(Arrays.asList(user01,user02));

            for(User user : users){
                if (id.equals((user.getId()))){
                    return user;
                }
            }
            return null;
    }
}
