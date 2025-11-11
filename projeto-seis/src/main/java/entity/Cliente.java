package entity; // Use o mesmo nome de pacote

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Cliente extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia para MySQL
    public Long id;

    @Column(length = 150, nullable = false)
    public String nome;

    // CPF com 11 dígitos, obrigatório e único
    @Column(length = 11, nullable = false, unique = true) 
    public String cpf;

    @Column(length = 15) // Telefone (opcional)
    public String telefone;

    @Column(length = 200) // Endereço (opcional)
    public String endereco;
}