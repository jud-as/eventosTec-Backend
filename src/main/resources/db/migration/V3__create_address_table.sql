CREATE TABLE address (
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    city VARCHAR(100) NOT NULL,
    uf VARCHAR(100) NOT NULL,
    event_id uuid,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);