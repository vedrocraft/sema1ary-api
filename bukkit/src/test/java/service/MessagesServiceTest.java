package service;

import org.junit.jupiter.api.Test;
import ru.vidoskim.bukkit.util.service.MessagesService;

public class MessagesServiceTest {
    @Test
    void MessagesServiceEnable() {
        MessagesService messagesService = new MessagesService();
        messagesService.enable();
        messagesService.disable();
    }
}
