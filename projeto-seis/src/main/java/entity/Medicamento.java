// Mude para o seu pacote (ex: package entity;)
package entity; 

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue; // Importar
import jakarta.persistence.GenerationType;  // Importar
import jakarta.persistence.Id;                // Importar
import io.quarkus.hibernate.orm.panache.PanacheEntityBase; // Mudar para Base
import java.math.BigDecimal;

@Entity 
public class Medicamento extends PanacheEntityBase { // <-- MUDOU AQUI

    @Id // Marca como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- USA AUTO_INCREMENT
    public Long id; // <-- Define o ID manualmente

    // O resto dos campos continua igual
    @Column(length = 150, nullable = false)
    public String nome;

    @Column(length = 100)
    public String laboratorio;
    
    @Column(precision = 10, scale = 2) 
    public BigDecimal preco;

    @Column(name = "qtd_estoque") 
    public int quantidadeEstoque;
}