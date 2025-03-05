package art.backendservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chatlog")
@Entity
public class ChatLog {

    @Id
    private String chatLogId;

    private String userName;

    private String charMessage;

    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "chat_chat_id")
    private Chat chat;

}
