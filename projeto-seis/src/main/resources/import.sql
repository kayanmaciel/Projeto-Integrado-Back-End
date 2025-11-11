--
-- INSERTS PARA MEDICAMENTO
--
INSERT INTO Medicamento(id, nome, laboratorio, preco, qtd_estoque) 
VALUES (1, 'Dipirona 500mg', 'Medley', 5.50, 100);

INSERT INTO Medicamento(id, nome, laboratorio, preco, qtd_estoque) 
VALUES (2, 'Paracetamol 750mg', 'EMS', 3.20, 150);

INSERT INTO Medicamento(id, nome, laboratorio, preco, qtd_estoque) 
VALUES (3, 'Dorflex', 'Sanofi', 12.00, 50);

INSERT INTO Medicamento(id, nome, laboratorio, preco, qtd_estoque) 
VALUES (4, 'Neosaldina', 'Takeda', 9.75, 70);

--
-- INSERTS PARA CLIENTE
--
INSERT INTO Cliente(id, nome, cpf, telefone, endereco) 
VALUES (1, 'Ana Silva', '11122233344', '11987654321', 'Rua das Flores, 123');

INSERT INTO Cliente(id, nome, cpf, telefone, endereco) 
VALUES (2, 'Bruno Costa', '55566677788', '21912345678', 'Avenida Principal, 456');

INSERT INTO Cliente(id, nome, cpf, telefone, endereco) 
VALUES (3, 'Carla Mendes', '99988877766', NULL, NULL);

--
-- INSERTS PARA FUNCIONARIO
--
INSERT INTO Funcionario(id, nome, matricula, cargo, cpf) 
VALUES (1, 'Roberto Dias', 'F1001', 'Farmacêutico', '12345678901');

INSERT INTO Funcionario(id, nome, matricula, cargo, cpf) 
VALUES (2, 'Mariana Lima', 'F1002', 'Atendente', '09876543210');

INSERT INTO Funcionario(id, nome, matricula, cargo, cpf) 
VALUES (3, 'Jorge Andrade', 'F1003', 'Gerente', '10203040506');