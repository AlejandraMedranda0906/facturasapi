CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL,
    nui VARCHAR(13) NOT NULL,
    email VARCHAR(255) NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (nui)
    );


