package com.example.Loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//import Tightcoupling.NotificationService;
@Component("UserService")

public class UserService {
   // @Autowired  // can be used for field injection but not preferred rather constructor is used

    NotificationService notificationService;// creating instance (object reference )
  public UserService(){}
//       @Autowired          // isnt used if there is only one constructor it invokes automatically //manage dependencies by spring
//                           //@Qualifier iof multiple beans are matching then the mentioned with the qualifier annotations will be used
//      public UserService(@Qualifier("emailNotificationService")NotificationService notificationService) {
//      this.notificationService = notificationService;  //initialising it with the help of constructor
//   }
      @Autowired
      public UserService(NotificationService notificationService) {
          this.notificationService = notificationService;
      }
        public void notifyUser(String message){

           notificationService.send("notification hello");
        }

        public void setNotificationService(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

////    public UserService(NotificationService notificationService) {
////        this.notificationService = notificationService;
////    }
    
}


