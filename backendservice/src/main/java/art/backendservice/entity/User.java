package art.backendservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    private Long id;

    private String corpMail;

    private String departament;

    private Boolean active;

    private String userName;

    @ManyToOne
    @JoinColumn(name = "chat_chat_id")
    private Chat chat;
}
