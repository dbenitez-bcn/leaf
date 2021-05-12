CREATE TABLE IF NOT EXISTS bonsais (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price DECIMAL DEFAULT 0.0,
  sold BOOLEAN DEFAULT FALSE,
  buyer VARCHAR(255) DEFAULT NULL
);