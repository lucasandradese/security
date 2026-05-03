CREATE TABLE IF NOT EXISTS user_permission(
user_id INTEGER NOT NULL,
permission_id INTEGER NOT NULL,
PRIMARY KEY(user_id, permission_id),

CONSTRAINT fk_user_permission_user FOREIGN KEY(user_id) REFERENCES users(id),
CONSTRAINT fk_user_permission_permission FOREIGN KEY(permission_id) REFERENCES permissions(id)
);