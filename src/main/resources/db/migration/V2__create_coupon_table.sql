CREATE TABLE coupon (
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    code VARCHAR(100) NOT NULL,
    discount INTEGER NOT NULL,
    valid TIMESTAMP NOT NULL,
    event_id uuid,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
)