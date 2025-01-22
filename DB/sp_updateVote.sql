/* 更新投票項目 */
DELIMITER $$

CREATE PROCEDURE updateVoteItem(IN id int, IN newItem VARCHAR(255), OUT errNo int)
BEGIN
	DECLARE count1 int;
    DECLARE count2 int;
    
    SELECT count(1) INTO count1 FROM vote_items v WHERE v.id = id;
    SELECT count(1) INTO count2 FROM vote_items v WHERE v.item = newItem;
    
    IF count1 > 0 THEN
		IF count2 > 0 THEN
			SET errNo = 999; /* 投票項目已存在 */
        ELSE
			UPDATE vote_items v SET v.item = newItem WHERE v.id = id;
            SET errNo = 0;
        END IF;
	ELSE
        SET errNo = 998; /* 投票項目不存在 */
	END IF;
END$$

DELIMITER ;