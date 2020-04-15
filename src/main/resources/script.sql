CREATE TABLE users(
   username varchar(20) NOT NULL,
   password varchar(80) NOT NULL,
   enabled boolean NOT NULL DEFAULT FALSE,
   primary key(username)
);

CREATE TABLE user_roles (
  user_role_id SERIAL PRIMARY KEY,
  username varchar(20) NOT NULL,
  role varchar(20) NOT NULL,
  UNIQUE (username,role),
  FOREIGN KEY (username) REFERENCES users (username)
);


INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$1tkGIypbJMeJ95ifFN5fb.DFX.NTDjIOt01pV3lxyRhIwWjj9ChiS', true);
INSERT INTO users(username,password,enabled) VALUES ('pracownik','$2a$10$oj1.4DjuQj1A1rUPe2iPpu52YKDvgRETVfxRcRpqsvPNQHNFsOPFi', true);
INSERT INTO users(username,password,enabled) VALUES ('klient','$2a$10$EdXRNXPQ7dyuf.Yxe4A03.r.Q4Yyx7Fh16Hf.Ti/Z7Dg40hjFjqla', true);
INSERT INTO users(username,password,enabled) VALUES ('jan','$2a$10$6BIXDYW2RlYCTSOqupIKaO.fOgkh5OyRVDW6Xoh2Ar/TYF5A9YMti', true);

INSERT INTO user_roles (username, role) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('pracownik', 'ROLE_STAFF');
INSERT INTO user_roles (username, role) VALUES ('klient', 'ROLE_CLIENT');
INSERT INTO user_roles (username, role) VALUES ('jan', 'ROLE_STAFF');
INSERT INTO user_roles (username, role) VALUES ('jan', 'ROLE_ADMIN');


