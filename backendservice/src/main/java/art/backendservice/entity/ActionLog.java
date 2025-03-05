package art.backendservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "actionlog")
@Entity
public class ActionLog {

    @Id
    private Long Actionid;

    private String action;

    private String typeOfAction;

    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "chat_chat_id")
    private Chat chat;
}
