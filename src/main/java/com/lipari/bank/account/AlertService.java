package com.lipari.bank.account;

import org.springframework.stereotype.Service;

@Service
public class AlertService {

    private final NotificationService notificationService;

    public AlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /*

    Avrei potuto risolvere il problema di ambiguità specificando al costruttore
    quale implementazione di NotificationService utilizzare attreverso l'annotazione:

    @Qualifier("emailNotificationService")


    public AlertService(@Qualifier("emailNotificationService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

     */

    public void raiseAlert(String accountId, String reason) {
        notificationService.notify(accountId, "ALERT: " + reason);
    }
}
