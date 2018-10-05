CREATE TABLE IF NOT EXISTS place (
 id BIGINT NOT NULL,
 name VARCHAR(255) NOT NULL ,
 altitude DECIMAL NOT NULL ,
 location GEOMETRY
);

CREATE INDEX place_id_idx ON place (id);
