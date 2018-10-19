CREATE TABLE IF NOT EXISTS place (
 id BIGINT NOT NULL,
 name VARCHAR(255),
 altitude DECIMAL,
 location GEOMETRY NOT NULL,
 description VARCHAR (255),
 photo_url VARCHAR (255),
 osm_id BIGINT,

 CONSTRAINT place_pk PRIMARY KEY (id)
);

CREATE SEQUENCE hibernate_sequence START 1001;