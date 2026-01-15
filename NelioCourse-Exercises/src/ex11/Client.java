package ex11;

import java.time.LocalDate;

public class Client {

    private String clientName;
    private String clientEmail;
    private LocalDate clientBirthday;

    public Client() {
    }

    public Client(String clientName, String clientEmail, LocalDate clientBirthday) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientBirthday = clientBirthday;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public LocalDate getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(LocalDate clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    @Override
    public String toString() {
        return "Client: " +
                getClientName() +
                " " +
                String.format("(%s)", getClientBirthday()) +
                " - " +
                getClientEmail() +
                "\n";
    }
}
