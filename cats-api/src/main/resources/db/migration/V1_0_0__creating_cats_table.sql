CREATE TABLE cats
(
    id         VARCHAR(40) PRIMARY KEY NOT NULL,
    name       VARCHAR(255)            NOT NULL,
    birthday   DATE                    NOT NULL,
    created_at TIMESTAMP               NOT NULL
);
