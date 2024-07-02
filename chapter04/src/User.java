// Abstraksi untuk EmailService
interface MessageService {
    void sendMessage(String message);
}

// Implementasi konkret dari MessageService
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

// Kelas User tidak bergantung pada implementasi konkret
class User {
    private MessageService messageService;

    // Dependency Injection melalui konstruktor
    public User(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
