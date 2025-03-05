package art.backendservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "excludeduser")
@Entity
public class ExcludedUser {

    @Id
    private Long excludedUserId;

    private String excludedUserName;

    @ManyToOne
    @JoinColumn(name = "chat_chat_id")
    private Chat chat;
}
