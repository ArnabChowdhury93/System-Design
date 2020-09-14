import main.java.com.deli.fooddeli.enumerators.NotificationType;
import main.java.com.deli.fooddeli.model.EmailNotification;
import main.java.com.deli.fooddeli.model.Notification;
import main.java.com.deli.fooddeli.model.NotificationDetails;
import main.java.com.deli.fooddeli.model.SmsNotification;

public class NotificationService {
    public boolean notify(NotificationDetails details){
        Notification notification;
        switch(details.getType()){
            case NotificationType.EMAIL : 
                notification = new EmailNotification(details.getMember().getAccount().getEmail());
                break;
            case NotificationType.SMS : 
                notification = new SmsNotification(details.getMember().getAccount().getPhone());
                break;
            default : 
                notification = new Notification(details.getMember().getAccount().getPhone());
        }
        return notification.send(details.getMessage());
    }
}
