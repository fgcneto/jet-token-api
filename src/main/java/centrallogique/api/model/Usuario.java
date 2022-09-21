package centrallogique.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String nome;
    String email;
    String username;
    String password;
    String papel;

    public Usuario(String nome, String email, String username, String password, Enum papel) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.password = password;
        this.papel = String.valueOf(papel);
    }
}