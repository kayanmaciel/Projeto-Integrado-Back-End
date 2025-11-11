package entity; // Use o mesmo nome de pacote

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Funcionario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 150, nullable = false)
    public String nome;

    // Matrícula (código do funcionário), obrigatória e única
    @Column(length = 20, nullable = false, unique = true) 
    public String matricula;

    @Column(length = 100)
    public String cargo; // Ex: "Farmacêutico", "Atendente", "Gerente"

    // CPF do funcionário
    @Column(length = 11, nullable = false, unique = true)
    public String cpf;
}