// src/main/java/org/acme/Servico.java

import io.quarkus.hibernate.orm.panache.PanacheEntityBase; // <-- MUDOU AQUI
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "servico")
public class Servico extends PanacheEntityBase { // <-- E MUDOU AQUI

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servico_id")
    public Long id;

    @Column(name = "nome", nullable = false, length = 100, unique = true)
    public String nome;

    @Column(name = "duracao_minutos", nullable = false)
    public int duracaoMinutos;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    public BigDecimal valor;
}