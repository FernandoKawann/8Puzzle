CREATE DATABASE "JogoDoOito"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
	
CREATE TABLE save (
save_id SERIAL NOT NULL PRIMARY KEY, 
botao1 VARCHAR(1) NOT NULL,
botao2 VARCHAR(1) NOT NULL, 
botao3 VARCHAR(1) NOT NULL, 
botao4 VARCHAR(1) NOT NULL, 
botao5 VARCHAR(1) NOT NULL, 
botao6 VARCHAR(1) NOT NULL, 
botao7 VARCHAR(1) NOT NULL, 
botao8 VARCHAR(1) NOT NULL, 
botao0 VARCHAR(1) NOT NULL,
data_salvamento DATE ,
numero_jogadas INTEGER NOT NULL 
)

CREATE OR REPLACE FUNCTION F_SALVA_DATA()
RETURNS TRIGGER AS $$
BEGIN
	UPDATE save SET data_salvamento = CURRENT_DATE 
	RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER TR_UPDATE_DATA
AFTER INSERT ON save
FOR EACH ROW 
EXECUTE PROCEDURE F_SALVA_DATA();




