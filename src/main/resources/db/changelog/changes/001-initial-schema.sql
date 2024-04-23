CREATE TABLE Filter (
    id int PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
	category VARCHAR(255),
    created timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Criteria (
    id int PRIMARY KEY AUTO_INCREMENT,
    filter_id int,
    type VARCHAR(255),
    additional_type VARCHAR(255),
    choice VARCHAR(255),
    FOREIGN KEY (filter_id) REFERENCES Filter(id)
);