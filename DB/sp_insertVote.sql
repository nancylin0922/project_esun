/* 新增投票項目 */
DELIMITER $$

CREATE PROCEDURE createVoteItem(IN str VARCHAR(255), OUT errNo int)
BEGIN
	DECLARE count int;
    
    SELECT count(1) INTO count FROM vote_items v WHERE v.item = str;
    IF count > 0 THEN
		SET errNo = 999; /* 投票項目已存在 */
	ELSE
		INSERT INTO vote_items(item) VALUES (str);
        SET errNo = 0;
	END IF;
END$$

DELIMITER ;