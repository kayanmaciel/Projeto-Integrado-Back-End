

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @Column(name = "cli_id")
    public UUID id;

    @Column(name = "cli_nome", nullable = false, length = 150)
    public String nome;

    @Column(name = "cli_email", nullable = false, unique = true, length = 100)
    public String email;

    @Column(name = "cli_telefone", length = 20)
    public String telefone;

    @Column(name = "cli_senha", nullable = false)
    public String senha; // Em uma aplicação real, sempre armazene a senha como um hash.

    @CreationTimestamp
    @Column(name = "cli_data_cadastro", nullable = false, updatable = false)
    public LocalDateTime dataCadastro;

    @Column(name = "cli_data_nascimento")
    public LocalDate dataNascimento;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    public Endereco endereco;
}