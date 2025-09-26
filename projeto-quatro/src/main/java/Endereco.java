// src/main/java/org/acme/Endereco.java

import io.quarkus.hibernate.orm.panache.PanacheEntityBase; // <-- MUDANÇA AQUI
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco extends PanacheEntityBase { // <-- E MUDANÇA AQUI

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    public Long id;

    @Column(length = 9)
    public String cep;

    @Column(nullable = false)
    public String logradouro;

    @Column(length = 20)
    public String numero;

    public String complemento;
    
    public String bairro;

    @Column(nullable = false)
    public String cidade;

    @Column(nullable = false, length = 2)
    public String uf;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false, unique = true)
    @JsonbTransient
    public Cliente cliente;
}