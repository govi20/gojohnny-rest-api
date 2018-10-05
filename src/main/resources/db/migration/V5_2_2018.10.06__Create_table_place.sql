CREATE TABLE IF NOT EXISTS place (
 id BIGINT NOT NULL,
 name VARCHAR(255) NOT NULL ,
 altitude DECIMAL NOT NULL ,
 location GEOMETRY,

 CONSTRAINT place_pk PRIMARY KEY (id)
);

CREATE INDEX place_id_idx ON place (id);
