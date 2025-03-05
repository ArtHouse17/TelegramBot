package art.backendservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chat")
@Entity
public class Chat {

    @Id
    private int chatId;

    private String chatName;

    private String chatDepartament;


    @Column(name = "admin_at")
    private LocalDateTime adminAt;

}
