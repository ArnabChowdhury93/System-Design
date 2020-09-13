public abstract class Notification {
    private int notificationId;
    private String message;

    public boolean send(String message){
        return true;
    }
}
